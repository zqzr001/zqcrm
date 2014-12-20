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
		<li class="active"><a href="/sys/user/info">个人信息</a></li>
	</ul><br/>
	<form id="inputForm" action="/user/addUser" method="post" class="form-horizontal">
		<tags:message content="${message}"/>
		<div class="control-group">
			<label class="control-label">用户名称:</label>
			<div class="controls">
				<input name="userName" class="lbl"></input>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">用户类型:</label>
			<div class="controls">
				<select name="userRole">                                        
					<option class="lbl" value="0">管理员</option>
					<option class="lbl" value="1">贷款经纪人</option>
					<option class="lbl" value="2">理财产品设计师</option>
					<option class="lbl" value="3">理财经纪人</option>
					<option class="lbl" value="4">老板</option>
				</select>
			</div>
		</div>
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>
		</div>
	</form>
</body>
</html>