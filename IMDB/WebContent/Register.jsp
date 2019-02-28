<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up</title>
</head>
<body>
<style>
div
{
margin:200px 50px 50px 50px;
}
</style>


</head>
<center>
<body bgcolor="#fefefe">

<div>
<h1>Registration Form</h1>

<form action="RegisterServlet" method="post">
<table>
<tr>
   <td><h3> Name:</h3></td>
   <td>
     <input type="text" placeholder="Name" name="Name" required>
   </td>
   </tr>
<tr>
<td>
 <h3> Email:</h3>
</td>
<td>
<input type="text" placeholder="Email" name="Email" required>
</td>
</tr>
<tr>
<td>
<h3>password:</h3>
</td>
<td>
<input type="password" placeholder="password" name="password" required>
</td>
</tr>
<tr>
<td>
<h3>phone No:</h3>
</td>
<td>
<select>
<option>91</option>
<option>92</option>
<option>97</option>
<option>98</option>
</select>
<input type="number" placeholder="90******" name="phone_no" required>
</td>
</tr>

<tr>
<td>
<input type="submit" value="submit" name="" required>
</td>
</tr>
</center>
</table>
</form>
</div>

</body>
</html>