<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <style>
        body {
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            background-color: #121212;
            font-family: 'Arial', sans-serif;
        }

        h2 {
            color: #f8f8f8;
            font-size: 36px;
            margin-bottom: 40px;
        }

        .btn-link {
            background: linear-gradient(135deg, #1e88e5, #42a5f5);
            color: white;
            text-decoration: none;
            padding: 14px 28px;
            border-radius: 6px;
            margin: 10px;
            font-size: 16px;
            box-shadow: 0 6px 10px rgba(0,0,0,0.25);
            transition: all 0.3s ease;
        }

        .btn-link:hover {
            background: linear-gradient(135deg, #1565c0, #1976d2);
            transform: translateY(-2px);
        }
    </style>
</head>
<body>
    <h2>Welcome to Amazon Portal</h2>
    <a class="btn-link" href="register.jsp" target="_blank">User Registration</a>
    <a class="btn-link" href="getUsers" target="_blank">Get Users Details</a>
</body>
</html>