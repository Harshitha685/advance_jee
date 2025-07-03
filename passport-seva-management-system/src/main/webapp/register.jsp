<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<form action="registerUser" method="POST">
Register to apply at <span>*</span>:
        <div class="Register to apply at">
            <label><input type="radio" name="registerToApplyAt" value="CPV Delhi" required> CPV Delhi</label>
            <label><input type="radio" name="registerToApplyAt" value="Passport Office" required> Passport Office</label>
</div>

Passport Office:
            <select name="passportOffice" required>
                <option>--select--</option>
                <option>Bengaluru</option>
                <option>Hyderabad</option>
                <option>Chennai</option>
                <option>Delhi</option>
                <option>Mumbai</option>
                <option>Others</option>
            </select><br>

          Given Name :<input type="text" name="givenName"><br>

          Surname:<input type="text" name="surName"><br>

          Date of birth:<input type="date" name="dob"><br>

          <label for="email">Email:</label>
          <input type="text" id="email" name="email" required>
          <br>

          <label>Do you want your Login Id to be same as E-mail Id?</label>
          <div>
              <label><input type="radio" name="sameAsEmailId" value="yes" id="sameYes" required> Yes</label>
              <label><input type="radio" name="sameAsEmailId" value="no" id="sameNo" required> No</label>
          </div>
          <br>

          <label for="loginId">LoginId:</label>
          <input type="text" id="loginId" name="loginId"required><br>

          Password:<input type="password" name="password" required><br>

          Confirm Password:<input type="password" name="confirmPassword" required><br>

          Hint Question:
           <select input type=text name="hintQuestion" required>
                          <option>--select--</option>
                          <option>Birth City</option>
                          <option>Favourite color</option>
                          <option>Favourite cricketer</option>
                          <option>Favourite food</option>
                          <option>First School</option>
                      </select><br>


          Hint Answer:
          <input type="text" name="answer"><br>

          <input type="submit" value="Register">

</form>
</body>
<script>
    const email = document.getElementsByName("email")[0];
    const loginId = document.getElementsByName("loginId")[0];
    const emailOptions = document.getElementsByName("sameAsEmailId");
    const password = document.getElementsByName("password")[0];
    const confirmPassword = document.getElementsByName("confirmPassword")[0];
    const passportOfficeSelect = document.getElementsByName("passportOffice")[0];
    const registerRadios = document.getElementsByName("registerToApplyAt");

    function updateLoginIdField() {
        const selectedOption = [...emailOptions].find(option => option.checked);
        if (selectedOption && selectedOption.value === "yes") {
            loginId.value = email.value;
            loginId.readOnly = true;
        } else {
            loginId.readOnly = false;
            loginId.value = "";
        }
    }

    function validatePassword() {
        if (password.value !== confirmPassword.value) {
            confirmPassword.setCustomValidity("Passwords do not match");
        } else {
            confirmPassword.setCustomValidity("");
        }
    }

    function updatePassportOfficeAvailability() {
        const selectedOption = [...registerRadios].find(radio => radio.checked);
        if (selectedOption) {
            if (selectedOption.value === "CPV Delhi") {
                passportOfficeSelect.disabled = true;
                passportOfficeSelect.value = "";
            } else if (selectedOption.value === "Passport Office") {
                passportOfficeSelect.disabled = false;
            }
        }
    }

    document.addEventListener("DOMContentLoaded", function () {
        // Initialize all behaviors
        updateLoginIdField();
        validatePassword();
        updatePassportOfficeAvailability();

        // LoginId syncing
        emailOptions.forEach(option => {
            option.addEventListener("change", updateLoginIdField);
        });

        email.addEventListener("input", () => {
            const selectedOption = [...emailOptions].find(option => option.checked);
            if (selectedOption && selectedOption.value === "yes") {
                loginId.value = email.value;
            }
        });

        // Password validation
        password.addEventListener("input", validatePassword);
        confirmPassword.addEventListener("input", validatePassword);

        // Register radio logic
        registerRadios.forEach(radio => {
            radio.addEventListener("change", updatePassportOfficeAvailability);
        });
    });
</script>

</html>