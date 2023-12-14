<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<style>

        body {
            font-family: Arial, sans-serif;
            margin: 100;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            width: 300px;
            margin: 100px auto;
            background-color: #fff;
            border-radius: 5px;
            padding: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin-bottom: 5px;
        }
        input[type="text"],
        input[type="password"],
        button {
            padding: 8px;
            margin-bottom: 10px;
            border-radius: 3px;
            border: 1px solid #ccc;
        }
        button {
            background-color: #007bff;
            color: #fff;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
<body>
<div class="container">
<h2>Login</h2>
    <form id="loginform" action="Login" method="post">
        <label for="login_id">Email:</label>
        <input placeholder="login id" type="text" id="login_id" name="login_id"><br><br>
        <label for="password">Password:</label>
        <input placeholder="Password"type="password" id="password" name="password"><br><br>
        <button onclick="authenticate()"type="submit" value="Login">Login</button>

    </form>
</div>
    <script>
        function authenticate() {
            const loginId = document.getElementById('login_id').value;
            const password = document.getElementById('password').value;

            // Perform POST request to authenticate user
            fetch('https://qa2.sunbasedata.com/sunbase/portal/api/assignment_auth.jsp', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    login_id: loginId,
                    password: password
                })
            })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Invalid credentials');
                }
                return response.json();
            })
            .then(data => {
                // Store the received token in localStorage or session storage
                localStorage.setItem('bearerToken', data.token); // Using localStorage for simplicity, use sessionStorage or more secure methods in production
                // Redirect or load the customer list screen
                window.location.href = 'customerList.html'; // Redirect to customer list page after successful login
            })
            .catch(error => {
                console.error('Error:', error);
                alert('Invalid credentials. Please try again.');
            });
        }
    </script>

</body>
</html>