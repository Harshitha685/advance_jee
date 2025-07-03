<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <style>
    body {
      font-family: 'Roboto', sans-serif;
      background-color: #1f2023;
      color: #f0f0f0;
      padding: 40px;
    }

    h1 {
      text-align: center;
      color: #f1c40f;
      margin-bottom: 30px;
    }

    table {
      width: 100%;
      border-collapse: separate;
      border-spacing: 0;
      background-color: #2c2f33;
      border-radius: 10px;
      overflow: hidden;
      box-shadow: 0 0 12px rgba(0,0,0,0.3);
    }

    th, td {
      padding: 14px 18px;
      text-align: left;
    }

    th {
      background-color: #3a3d42;
      color: #f1f1f1;
      font-weight: bold;
      border-bottom: 2px solid #444;
    }

    tr:nth-child(even) {
      background-color: #323539;
    }

    tr:hover {
      background-color: #3f4349;
    }

    td {
      border-bottom: 1px solid #444;
    }
  </style>
</head>
<body>
<h1>Hello,${usName}</h1>
<h1>Passport Seva Table</h1>

<table>
  <tr>
    <th>UserId</th>
    <th>Given Name</th>
    <th>Sur Name</th>
    <th>Email Id</th>
    <th>Password</th>
    <th>Confirm Password</th>
  </tr>

  <c:forEach items="${listOfUsers}" var="dto">
    <tr>
      <td>${dto.userId}</td>
      <td>${dto.givenName}</td>
      <td>${dto.surName}</td>
      <td>${dto.emailId}</td>
      <td>${dto.password}</td>
      <td>${dto.confirmPassword}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>