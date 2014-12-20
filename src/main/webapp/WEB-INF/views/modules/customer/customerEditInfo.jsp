<%@page import="com.whatbi.zq.dal.domain.ZqCustomer"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>个人信息</title>
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
		<li class="active"><a href="/sys/customer/info">个人信息</a></li>
	</ul><br/>
	<% ZqCustomer customer = (ZqCustomer) request.getAttribute("zqCustomer"); %>
	<form id="inputForm" action="/customer/editCustomer" method="post" class="form-horizontal">
		<tags:message content="${message}"/>
		<input name="id" type="hidden" value="<%=customer.getId()%>">
		<div class="control-group">
			<label class="control-label">姓名:</label>
			<div class="controls">
				<label class="lbl"><%=customer.getCName() %></label>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">职业:</label>
			<div class="controls">
				<input name="cJob" class="required" value="<%=customer.getCJob() %>"></input>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">身份证:</label>
			<div class="controls">
				<input name="cCardid" class="lbl" value="<%=customer.getCCardid() %>"></input>
			</div>
		</div>
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>
		</div>
	</form>
</body>
</html>