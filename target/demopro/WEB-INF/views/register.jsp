<%@include file="/WEB-INF/views/includes.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: #ff0000;
}

body {
	font-family: Arial, Helvetica;
	background-color: grey;
	padding-top: 10;
	padding: 120px;
}

* {
	box-sizing: border-box;
}

.box {
	padding: 16px;
	background-color: white;
}

.name {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

.submit {
	background-color: #555555;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 50%;
	opacity: 0.9;
	align-items: center;
	border-radius: 25px;
	margin-left: 120px;
}
</style>
</head>
<body>
	<form:form action="/demopro/success_register" method="post"
		modelAttribute="data">
		<div class="box">
			<label>Name:</label><br>
			<form:input path="name" placeholder="Enter your last name"
				cssClass="name" />
			<form:errors path="name" cssClass="error"></form:errors>
			<br> <label>Age</label>
			<form:input path="age" placeholder="enter your age" cssClass="name" />
			<form:errors path="age" cssClass="error"></form:errors>
			<br> <label>Email</label>
			<form:input path="email" placeholder="enter your email"
				cssClass="name" />
			<form:errors path="email" cssClass="error"></form:errors>
			<br> <label>phone</label>
			<form:input path="phone" placeholder="enter your phone number"
				cssClass="name" />
			<form:errors path="phone" cssClass="error"></form:errors>
			<br> <label>password</label><br>
			<form:input path="password" placeholder="enter your password"
				cssClass="name" />
			<form:errors path="password" cssClass="error"></form:errors>
			<br> <label>Confirm Password</label><br>
			<form:input path="confirm_password" placeholder="re enter password"
				cssClass="name" />
			<form:errors path="confirm_password" cssClass="error"></form:errors>
			<br> <input type="submit" value="REGISTER" class="submit" c />
		</div>

	</form:form>
</body>
</html>