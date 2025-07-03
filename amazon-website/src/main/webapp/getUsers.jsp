<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>

<style>
    body {
      font-family: Arial, sans-serif;
      background-color: #fff;
      margin: 40px;
    }
 h1 {
      color: #444;
      text-align: center;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 20px;
    }

    th, td {
      padding: 12px 16px;
      text-align: left;
      border-bottom: 1px solid #ddd;
    }
 th {
      background-color: #f5f5f5;
      color: #333;
    }

    tr:nth-child(even) {
      background-color: #fafafa;
    }

    tr:hover {
      background-color: #f0f8ff;
    }
    </style>
</head>
<body>

<h1>Amazon User Table</h1>

<table>
  <tr>
    <th>Id</th>
    <th>Full Name</th>
    <th>Email</th>
    <th>Mobile</th>
    <th>Password</th>
    <th>Dob</th>
  </tr>

  <c:forEach items="${listOfUsers}" var="dto">
      <tr>
         <td>${dto.amazonId}</td>
          <td>${dto.fullName}</td>
          <td>${dto.email}</td>
          <td>${dto.mobile}</td>
          <td>${dto.password}</td>
          <td>${dto.dob}</td>
      </tr>
  </c:forEach>
  <c:out value="${listOfUsers}" />


</table>
</body>
</html>
