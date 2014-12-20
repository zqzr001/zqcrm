<%@page import="com.util.FormatDate"%>
<%@page import="com.whatbi.zq.dal.domain.ZqProduct"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>理财产品管理</title>
	<meta name="decorator" content="default"/>
	<%@include file="/WEB-INF/views/include/dialog.jsp" %>
	<style type="text/css">.sort{color:#0663A2;cursor:pointer;}</style>
	<script type="text/javascript">
		$(document).ready(function() {
			// 表格排序
			var orderBy = $("#orderBy").val().split(" ");
			$("#contentTable th.sort").each(function(){
				if ($(this).hasClass(orderBy[0])){
					orderBy[1] = orderBy[1]&&orderBy[1].toUpperCase()=="DESC"?"down":"up";
					$(this).html($(this).html()+" <i class=\"icon icon-arrow-"+orderBy[1]+"\"></i>");
				}
			});
			$("#contentTable th.sort").click(function(){
				var order = $(this).attr("class").split(" ");
				var sort = $("#orderBy").val().split(" ");
				for(var i=0; i<order.length; i++){
					if (order[i] == "sort"){order = order[i+1]; break;}
				}
				if (order == sort[0]){
					sort = (sort[1]&&sort[1].toUpperCase()=="DESC"?"ASC":"DESC");
					$("#orderBy").val(order+" DESC"!=order+" "+sort?"":order+" "+sort);
				}else{
					$("#orderBy").val(order+" ASC");
				}
				page();
			});
			$("#btnExport").click(function(){
				top.$.jBox.confirm("确认要导出客户数据吗？","系统提示",function(v,h,f){
					if(v=="ok"){
						$("#searchForm").attr("action","${ctx}/sys/product/export");
						$("#searchForm").submit();
					}
				},{buttonsFocus:1});
				top.$('.jbox-body .jbox-icon').css('top','55px');
			});
			$("#btnImport").click(function(){
				$.jBox($("#importBox").html(), {title:"导入数据", buttons:{"关闭":true}, 
					bottomText:"导入文件不能超过5M，仅允许导入“xls”或“xlsx”格式文件！"});
			});
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").attr("action","${ctx}/sys/product/");
			$("#searchForm").submit();
	    	return false;
	    }
	</script>
</head>
<body>
	<div id="importBox" class="hide">
		<form id="importForm" action="${ctx}/sys/product/import" method="post" enctype="multipart/form-data"
			style="padding-left:20px;text-align:center;" class="form-search" onsubmit="loading('正在导入，请稍等...');"><br/>
			<input id="uploadFile" name="file" type="file" style="width:330px"/><br/><br/>　　
			<input id="btnImportSubmit" class="btn btn-primary" type="submit" value="   导    入   "/>
			<a href="${ctx}/sys/product/import/template">下载模板</a>
		</form>
	</div>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/sys/product/">产品列表</a></li>
	</ul>
	
	<tags:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>产品名称</th>
				<th>可售金额</th>
				<th>售卖开始日期</th>
				<th>售卖结束日期</th>
				<th>利率</th>
				<th>收益方式</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<% 
				List<ZqProduct> productList = (List<ZqProduct>) request.getAttribute("productList");
				for (int i = 0; i < productList.size(); i++)
				{
				    ZqProduct product = productList.get(i);
			%>
					<tr>
						<td><%=product.getProName() %></td>
						<td><%=product.getProMoney() %></td>
						<td><%=FormatDate.getDateByLong(product.getProStartdate()) %></td>
						<td><%=FormatDate.getDateByLong(product.getProEnddate()) %></td>
						<td><%=product.getProRate() %></td>
						<td><%=product.getProType() %></td>
						<td style="cursor: pointer;">
							<a href="/product/del?id=<%=product.getId() %>" target="mainFrame">下架</a>
						</td>
					</tr>
			<%	    
				}
			%>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>