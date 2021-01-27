<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Main page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <p>Enter the Employee information to add to database</p>
    <form action="addemployee" method="post">
        <input type="text" name="id" placeholder="Enter Id"><br />
        <input type="text" name="name" placeholder="Enter Name"><br/>
        <input type="text" name="age" placeholder="Enter Age"><br />
        <input type="text" name="department" placeholder="Enter Department"><br />
        <input type="Submit">
    </form>

</body>
</html>
