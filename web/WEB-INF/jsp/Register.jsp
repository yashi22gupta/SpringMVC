<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yashi
  Date: 09-07-2017
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration</title>
</head>
<body>

<%--<h1>Register</h1>
<form action="" method="POST">
    Firstname<input type="text" name="fname"><br>
    Lastname<input type="text" name="lname"><br>
    username<input type="text" name="username"><br>
    password<input type="password" name="password"><br>
    mobile no.<input type="mobile" name="mobile"><br>
    email<input type="email" name="email"><br>
    <input type="submit" name="submit" value="Submit">
</form>--%>

<div align="center">
    <form:form action="RegisterUser" method="post" commandName="userForm">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2>User Registration</h2></td>
            </tr>

            <tr>
                <td>First Name:</td>
                <td><form:input path="fname" /></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><form:input path="lname" /></td>
            </tr>
            <tr>
                <td>User Name:</td>
                <td><form:input path="username" /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:password path="password" /></td>
            </tr>
            <tr>
                <td>MobileNo.:</td>
                <td><form:input path="mobileno" /></td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td><form:input path="email" /></td>
            </tr>

            <tr>
                <td colspan="2" align="center"><input type="submit" value="Register" /></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
