<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
	<link rel="icon" type="image/x-icon" href="static/images/stethoscope_logo.png" />
	<link href="<c:url value="static/css/profile-style.css" />" rel="stylesheet">
</head>

<body>
<div class="wrapper loginForm">
	<div class="header">
		<h1>Login</h1>
	</div>
<div class="container">
<form method="post" action="/validate">
<div  id="logintab" name="logintab" class="loginForm">
<div> </div>
<table class="formTable">
	<tr>
		<td class="label"><strong>Email id :</strong></td>
		<td>
			<input name="Text1" type="text">
		</td>
	</tr>
	<tr>
		<td class="label"><strong>Password:&nbsp;</strong></td>
		<td>
			<input name="Password1" type="password">
		</td>
	</tr>
	<tr align="center">
		<td colspan="2">
		<input name="Submit2" type="submit" value="submit" style="width: 82px; height: 21px"></td>
	</tr>
</table>
<br>
New user?


<input name="submit1" type="button" value="Create an Account" onclick="document.location='registration.html'" style="height: 24px; color: #FFFFFF; background-color: #663300">
</div>
</form>

</div>
</div>
</body>
</html>