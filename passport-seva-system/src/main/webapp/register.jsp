<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <meta charset="UTF-8">
  <title>Passport Seva - Registration</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<div class="form-container">
  <h2>Passport Seva - User Registration</h2>
  <form action="registerUser" method="POST">

    Given Name :<input type="text" name="givenName">

    Surname:<input type="text" name="surName">

   E-mail Id:<input type="email" name="emailId">

    Password:<input type="password" name="password" required>

    Confirm Password:<input type="password" name="confirmPassword" required>
    <input type="submit" value="Register">
    </div>
  </form>
</div>

</body>
</html>
