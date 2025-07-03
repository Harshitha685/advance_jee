<html>
<head>
    <title>Netflix Sign Up</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="form-container">
        <h2>Join Netflix Now</h2>
        <form action="registerNetflixUser" method="post">
            Full Name: <input type="text" name="fullName" required><br>

            Email: <input type="email" name="email" required><br>

            Mobile Number: <input type="text" name="mobile" required><br>

            Password: <input type="password" name="password" required><br>

            Choose Plan:
            <select name="plan" required>
                <option>Mobile - ₹149/month</option>
                <option>Basic - ₹199/month</option>
                <option>Standard - ₹499/month</option>
                <option>Premium - ₹649/month</option>
            </select><br>

            <input type="submit" value="Sign Up">
        </form>
        </div>
</body>
</html>
