<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <div class="success-container">
        <h2>Registration Successful!</h2>
        <p>Welcome, <strong><%= session.getAttribute("username") %></strong>!</p>
        <a href="index.jsp">Back to Form</a>
    </div>
</body>
</html>