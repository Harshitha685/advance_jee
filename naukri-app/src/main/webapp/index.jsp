<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Naukri Home</title>
  <style>
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background-color: #f0f2f5;
      margin: 0;
      padding: 40px;
      text-align: center;
    }

    h2 {
      color: #2c3e50;
      font-size: 28px;
      margin-bottom: 30px;
    }

    a {
      display: inline-block;
      margin: 10px 15px;
      padding: 12px 24px;
      background-color: #007bff;
      color: #ffffff;
      text-decoration: none;
      border-radius: 6px;
      transition: background-color 0.3s;
      font-weight: bold;
    }

    a:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>

  <h2>Naukri</h2>

  <a href="registration.jsp">Click here to register</a>
  <a href="getAllUsers">Get User Details</a>

</body>
</html>