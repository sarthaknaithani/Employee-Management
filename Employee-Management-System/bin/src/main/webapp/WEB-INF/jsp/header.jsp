<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
.topnav {
  background-color: #302F2F;
  overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Add a color to the active/current link */
.topnav a.active {
  background-color: #04AA6D;
  color: white;
}

</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<div class="topnav">
  <a class="active" href="navdash">Dashboard</a>
  <a href="navabout">About</a>
  <a href="log">Logout</a>
</div>

</body>
</html>