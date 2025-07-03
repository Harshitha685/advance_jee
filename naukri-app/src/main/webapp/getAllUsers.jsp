<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Naukri User Registry</title>
  <style>
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background-color: #f8f9fa;
      color: #343a40;
      padding: 50px;
    }

    h1 {
      text-align: center;
      color: #007bff;
      margin-bottom: 40px;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      background-color: #ffffff;
      box-shadow: 0 4px 8px rgba(0,0,0,0.1);
      border-radius: 8px;
      overflow: hidden;
    }

    th, td {
      padding: 16px 20px;
      text-align: left;
      border-bottom: 1px solid #dee2e6;
    }

    th {
      background-color: #e9ecef;
      color: #495057;
      text-transform: uppercase;
      font-size: 14px;
    }

    tr:hover {
      background-color: #f1f3f5;
    }

    tr:last-child td {
      border-bottom: none;
    }
  </style>
</head>
<body>

<h1>Naukri User Registry</h1>

<table>
  <tr>
    <th>User ID</th>
    <th>Full Name</th>
    <th>Email</th>
    <th>Mobile</th>
    <th>Password</th>
    <th>Qualification</th>
  </tr>

  <c:forEach items="${listOfUsers}" var="dto">
    <tr>
      <td>${dto.userId}</td>
      <td>${dto.fullName}</td>
      <td>${dto.email}</td>
      <td>${dto.mobile}</td>
      <td>${dto.password}</td>
      <td>${dto.qualification}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>