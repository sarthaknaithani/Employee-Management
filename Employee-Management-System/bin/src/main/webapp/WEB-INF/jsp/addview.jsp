<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add employee</title>
</head>
<body>

<div class="container">
        <form method="post" action="/api/add">
          <label for="usrname">User Name</label>
          <br>
          <input type="text" id="username" name="username" placeholder="Enter your username" required >
          <br>
          <label for="psw">Password</label>
          <br>
          <input type="password" placeholder="Enter your password" id="psw" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
          <br>
          <label for="Dob">Date of Birth</label>
          <br>
          <input type="text" id="Dob" name="Dob" placeholder="Enter your username" required >
          <br>
          <label for="DoJ">Date of Joining</label>
          <br>
          <input type="text" placeholder="Enter your Date of Joining" id="DoJ" name="DoJ" >
          <br>
          <label for="employeeNumber">Employee Number</label>
          <br>
         <input type="text" placeholder="Enter your Employee Number" id="employeeNumber" name="employeeNumber" >
          <br>
           <label for="firstName">First Name</label>
          <br>
         <input type="text" placeholder="Enter your First Name" id="firstName" name="firstName" >
          <br>
           <label for="lastName">Last Name</label>
          <br>
         <input type="text" placeholder="Enter your Last Name" id="lastName" name="lastName" >
          <br>
             <label for="gender">Gender</label>
          <br>
         <input type="text" placeholder="Gender" id="gender" name="gender" >
          <br>
            <label for="role">Role</label>
          <br>
         <input type="text" placeholder="role" id="role" name="role" >
          <br>
         <label for="img">Image</label>
          <br>
         <input type="text" placeholder="role" id="img" name="img" >
          <br>
          <input type="submit" value="Submit">
        </form>
      </div>

</body>
</html>