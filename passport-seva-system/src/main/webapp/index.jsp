<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Passport Seva - Home</title>
  <style>
    body {
      font-family: 'Segoe UI', sans-serif;
      background: #f0f4f8;
      margin: 0;
      padding: 40px;
      display: flex;
      flex-direction: column;
      align-items: center;
    }

    h2 {
      color: #003366;
      margin-bottom: 30px;
    }

    a {
      display: inline-block;
      padding: 12px 20px;
      margin: 10px;
      text-decoration: none;
      color: white;
      background-color: #004080;
      border-radius: 6px;
      transition: background-color 0.3s ease;
    }

    a:hover {
      background-color: #0066cc;
    }
  </style>
</head>
<body>

  <h2>Passport User Registration</h2>
  <a href="register.jsp" target="_blank">New Registration</a><br>
  <a href="getAllUsers" target="_blank">Get All Users</a>

</body>
</html>
