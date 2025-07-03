<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Passport Seva Table</title>
  <style>
    body {
      font-family: 'Segoe UI', sans-serif;
      background-color: #f4f6f9;
      color: #333;
      padding: 50px;
    }

    h1 {
      text-align: center;
      color: #34495e;
      margin-bottom: 40px;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      background-color: #ffffff;
      border-radius: 12px;
      box-shadow: 0 6px 20px rgba(0, 0, 0, 0.08);
      overflow: hidden;
    }

    th, td {
      padding: 16px 20px;
      text-align: left;
      border-bottom: 1px solid #dee2e6;
    }

    th {
      background-color: #ecf0f1;
      font-weight: bold;
      font-size: 14px;
      text-transform: uppercase;
      color: #2c3e50;
    }

    tr:nth-child(even) {
      background-color: #f9f9f9;
    }

    tr:hover {
      background-color: #eaf4fc;
    }

    td:last-child,
    th:last-child {
      border-right: none;
    }
  </style>
</head>
<body>

<h1>Passport Seva Table</h1>

<table>
  <tr>
    <th>UserId</th>
    <th>Given Name</th>
    <th>Sur Name</th>
    <th>Email Id</th>
    <th>Password</th>
    <th>Confirm Password</th>
    <th>DOB</th>
    <th>Login Id</th>
    <th>Hint Question</th>
    <th>Answer</th>
  </tr>

  <c:forEach items="${listOfUsers}" var="dto">
    <tr>
      <td>${dto.userId}</td>
      <td>${dto.givenName}</td>
      <td>${dto.surName}</td>
      <td>${dto.email}</td>
      <td>${dto.password}</td>
      <td>${dto.confirmPassword}</td>
      <td>${dto.dob}</td>
      <td>${dto.loginId}</td>
      <td>${dto.hintQuestion}</td>
      <td>${dto.answer}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>