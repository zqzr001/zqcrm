<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>产品信息</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="/sys/user/info">产品信息</a></li>
	</ul><br/>
	<form id="inputForm" action="/product/addProduct" method="post" class="form-horizontal">
		<tags:message content="${message}"/>
		<div class="control-group">
			<label class="control-label">产品名称:</label>
			<div class="controls">
				<input type="text" name="proName" class="lbl"></input>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">可售金额:</label>
			<div class="controls">
				<input type="text" name="proMoney" class="lbl"></input>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">开始日期:</label>
			<div class="controls">
				<input name="startdate" type="text" readonly="readonly" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'});"></input>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">结束日期:</label>
			<div class="controls">
				<input name="enddate" type="text" readonly="readonly" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'});"></input>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">利率:</label>
			<div class="controls">
				<input type="text" name="proRate" class="lbl"></input>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">收益方式:</label>
			<div class="controls">
				<input type="text" name="proType" class="lbl"></input>
			</div>
		</div>
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>
		</div>
	</form>
</body>
</html>