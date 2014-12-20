<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>菜单导航</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript"> 
		$(document).ready(function() {
			$(".accordion-heading a").click(function(){
				$('.accordion-toggle i').removeClass('icon-chevron-down');
				$('.accordion-toggle i').addClass('icon-chevron-right');
				if(!$($(this).attr('href')).hasClass('in')){
					$(this).children('i').removeClass('icon-chevron-right');
					$(this).children('i').addClass('icon-chevron-down');
				}
			});
			$(".accordion-body a").click(function(){
				$("#menu li").removeClass("active");
				$("#menu li i").removeClass("icon-white");
				$(this).parent().addClass("active");
				$(this).children("i").addClass("icon-white");
			});
			$(".accordion-body a:first i").click();
		});
	</script>
</head>
<body>
	<div class="accordion" id="menu">
	<% 
		String parentId = request.getAttribute("parentId").toString();
		if("1".equals(parentId))
		{ 
	%>
		<div class="accordion-group">
		    <div class="accordion-heading">
		    	<a class="accordion-toggle" data-toggle="collapse" data-parent="#menu" href="#collapse${menu.id}" title=""><i class="icon-chevron-down"></i>&nbsp;用户管理</a>
		    </div>
		    <div id="collapse" class="accordion-body in collapse">
				<div class="accordion-inner">
					<ul class="nav nav-list">
						<li><a href="/user/list" target="mainFrame" ><i class="icon-circle-arrow-right"></i>&nbsp;用户列表</a></li>
						<li><a href="/user/add" target="mainFrame" ><i class="icon-circle-arrow-right"></i>&nbsp;新增用户</a></li>
					</ul>
				</div>
		    </div>
		</div>
	<%
		} 
		
		if("2".equals(parentId) || "4".equals(parentId))
		{ 
	%>
		<div class="accordion-group">
		    <div class="accordion-heading">
		    	<a class="accordion-toggle" data-toggle="collapse" data-parent="#menu" href="#collapseCustomer" title=""><i class="icon-chevron-down"></i>客户管理</a>
		    </div>
		    <div id="collapseCustomer" class="accordion-body in collapse">
				<div class="accordion-inner">
					<ul class="nav nav-list">
						<li><a href="/customer/list" target="mainFrame" ><i class="icon-circle-arrow-right"></i>&nbsp;客户列表</a></li>
						<li><a href="/customer/add" target="mainFrame" ><i class="icon-circle-arrow-right"></i>&nbsp;新增客户</a></li>
					</ul>
				</div>
		    </div>
		</div>
	<%
		} 
		
		if("2".equals(parentId))
		{ 
	%>
		<div class="accordion-group">
		    <div class="accordion-heading">
		    	<a class="accordion-toggle" data-toggle="collapse" data-parent="#menu" href="#collapse${menu.id}" title=""><i class="icon-chevron-down"></i>&nbsp;贷款订单管理</a>
		    </div>
		    <div id="collapse" class="accordion-body in collapse">
				<div class="accordion-inner">
					<ul class="nav nav-list">
						<li><a href="/debt/list" target="mainFrame" ><i class="icon-circle-arrow-right"></i>&nbsp;订单列表</a></li>
						<li><a href="/debt/add" target="mainFrame" ><i class="icon-circle-arrow-right"></i>&nbsp;新增订单</a></li>
					</ul>
				</div>
		    </div>
		</div>
	<%
		} 
		
		if("3".equals(parentId))
		{ 
	%>
		<div class="accordion-group">
		    <div class="accordion-heading">
		    	<a class="accordion-toggle" data-toggle="collapse" data-parent="#menu" href="#collapse${menu.id}" title=""><i class="icon-chevron-down"></i>&nbsp;产品管理</a>
		    </div>
		    <div id="collapse" class="accordion-body in collapse">
				<div class="accordion-inner">
					<ul class="nav nav-list">
						<li><a href="/product/list" target="mainFrame" ><i class="icon-circle-arrow-right"></i>&nbsp;产品列表</a></li>
						<li><a href="/product/add" target="mainFrame" ><i class="icon-circle-arrow-right"></i>&nbsp;新增产品</a></li>
					</ul>
				</div>
		    </div>
		</div>
	<%
		} 
		
		if("4".equals(parentId))
		{ 
	%>
		<div class="accordion-group">
		    <div class="accordion-heading">
		    	<a class="accordion-toggle" data-toggle="collapse" data-parent="#menu" href="#collapse${menu.id}" title=""><i class="icon-chevron-down"></i>&nbsp;出借订单管理</a>
		    </div>
		    <div id="collapse" class="accordion-body in collapse">
				<div class="accordion-inner">
					<ul class="nav nav-list">
						<li><a href="/lend/list" target="mainFrame" ><i class="icon-circle-arrow-right"></i>&nbsp;订单列表</a></li>
						<li><a href="/lend/add" target="mainFrame" ><i class="icon-circle-arrow-right"></i>&nbsp;新增订单</a></li>
					</ul>
				</div>
		    </div>
		</div>
	<%
		} 
	%>		
	</div>
</body>
</html>
