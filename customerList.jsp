<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<style>
        /* Add your CSS styling here if needed */
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: white;
            
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

<a href="/openCustomerView"><button>Add Customer</button></a>  
<h2>Customer List</h2>

    <table id="customerTable">
        
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Street</th>
                <th>Address</th>
                <th>City</th>
                <th>State</th>
                <th>Email</th>
                <th>Phone</th>
            </tr>
           	<c:foreach items="${list}" var="s">
           		<tr>
           			<td>${s.firstname}</td>
           			<td>${s.lastname}</td>
           			<td>${s.street}</td>
           			<td>${s.address}</td>
           			<td>${s.city}</td>
           			<td>${s.state}</td>
           			<td>${s.email}</td>
           			<td>${s.phone}</td>
           		</tr>
           	</c:foreach>
        
    </table>
</form>
</body>
</html>