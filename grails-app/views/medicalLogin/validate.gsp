<%--
  Created by IntelliJ IDEA.
  User: lzacharewicz
  Date: 16/3/13
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <!-- login/validate.gsp  head -->
    <title>Login Title</title>
    <!-- login/validate.gsp  head -->
</head>
<body>
<!-- login/validate.gsp  body -->
<div>
    <g:form name="myForm" url="[action:'validate',controller:'login']">
        <label>Username:</label> <input type="text" name="username">
        <label>Password:</label> <input type="text" name="password">
        <input type="submit" value="login">
    </g:form>
</div>
<!-- login/validate.gsp  body -->
</body>
</html>