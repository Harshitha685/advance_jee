<html>
<head>
    <title>IRCTC User Registration</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div class="container">
        <h2>Register for IRCTC</h2>
        <form action="registerIRCTCUser" method="post">
            Full Name: <input type="text" name="fullName" required><br>

            Email: <input type="email" name="email" required><br>

            Mobile Number: <input type="text" name="mobile" required><br>

            Password: <input type="password" name="password" required><br>

            Aadhaar/ID Proof Number: <input type="text" name="idProofNumber" required><br>

            Upload ID Proof (PDF/Image): <input type="file" name="idProofFile" accept=".pdf,.jpg,.jpeg,.png" required><br>

            Preferred Class:
            <select name="travelClass" required>
                <option>Sleeper</option>
                <option>AC 3 Tier</option>
                <option>AC 2 Tier</option>
                <option>AC First Class</option>
                <option>Chair Car</option>
            </select><br>

            Food Preference:
            <select name="foodPreference" required>
                <option>Vegetarian</option>
                <option>Non-Vegetarian</option>
                <option>None</option>
            </select><br>

            <input type="submit" value="Register">
        </form>
        </div>
</body>
</html>
