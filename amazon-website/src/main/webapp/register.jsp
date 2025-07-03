<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
    <style>
        body {
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            font-family: Arial, sans-serif;
            background: #f4f4f4;
        }

        .form-container {
            background: #fff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        input, select {
            display: block;
            width: 100%;
            margin-bottom: 15px;
            padding: 8px;
            border-radius: 4px;
            border: 1px solid #ccc;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
            font-weight: bold;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        label {
            margin-bottom: 5px;
            display: block;
            font-weight: 500;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Amazon</h2>
        <form action="registerUser" method="post">
            <label>Full Name: <span style="color: red;">*</span></label>
            <input type="text" name="fullName" required>

            <label>Email:</label>
            <input type="email" name="email">

            <label>Mobile Number:</label>
            <input type="text" name="mobile">

            <label>Password:</label>
            <input type="password" name="password">

            <label>Date of Birth:</label>
            <input type="date" name="dob">

            <label>Gender:</label>
            <select name="gender">
                <option>Male</option>
                <option>Female</option>
                <option>Other</option>
            </select>

            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>