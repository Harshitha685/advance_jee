<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Job Portal Registration</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
        <h2>Create Your Job Profile</h2>
        <form action="registerJobUser" method="post">
            Full Name: <input type="text" name="fullName" required><br>

            Email: <input type="email" name="email" required><br>

            Mobile Number: <input type="text" name="mobile" required><br>

            Password: <input type="password" name="password" required><br>

            Highest Qualification:
            <select name="qualification" required>
                <option>B.E/B.Tech</option>
                <option>M.E/M.Tech</option>
                <option>MCA</option>
                <option>B.Sc</option>
                <option>MBA</option>
                <option>Other</option>
            </select><br>

            <input type="submit" value="Register">
        </form>

</body>
</html>
