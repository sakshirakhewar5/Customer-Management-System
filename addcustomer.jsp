<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<style>

        body {
            font-family: Arial, sans-serif;
            margin: 50;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            width: 400px;
            margin: 50px auto;
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
        .top-row {
  &:after {
    content: "";
    display: table;
    clear: both;
  } > div {
    float:left;
    width:48%;
    margin-right:4%;
    &:last-child { 
      margin:0;
    }
  }
}
    </style>
<body>
<div class="container">
<h2>Customer Details</h2>
    <form id="customerForm" action="addcustomer" method="post">
    <div class="top-row">
            <div class="field-wrap">
              <label>
                First Name
              </label>
              <input type="text" placeholder="First Name" id="firstname" name="firstname"/>
            </div>
        
            <div class="field-wrap">
              <label>
                Last Name
              </label>
              <input type="text"placeholder="Last Name"id="lastname" name="lastname"/>
            </div>
          </div>
        <div class="top-row">
            <div class="field-wrap">
              <label>
                Street
              </label>
              <input type="text" placeholder="Street" id="street" name="street" />
            </div>
        
            <div class="field-wrap">
              <label>
               Address
              </label>
              <input type="text"placeholder="Address"id="address" name="address"/>
            </div>
          </div>

         <div class="top-row">
            <div class="field-wrap">
              <label>
                City
              </label>
              <input type="text" placeholder="City" id="city" name="city"/>
            </div>
        
            <div class="field-wrap">
              <label>
               State
              </label>
              <input type="text"placeholder="State"id="state" name="state"/>
            </div>
          </div>
          <div class="top-row">
            <div class="field-wrap">
              <label>
                Email
              </label>
              <input type="text" placeholder="Email" id="email" name="email"/>
            </div>
        
            <div class="field-wrap">
              <label>
               Phone
              </label>
              <input type="text"placeholder="Phone"id="phone" name="phone"/>
            </div>
          </div>        
          <button type="submit" value="Submit">Submit</button>
    </form>
</div>
</body>
</html>