<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Queries</title>
</head>
<body>
<h1>${query}</h1>
    <h4>${desc}</h4>
    <br>
    <table>
        <thead><!-- how to get the column names to show????  -->
            <tr>
                <c:forEach items="${columns}" var="name">
                    <th >${name}</th>
                </c:forEach>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${table}" var="row">
                <tr >
                <c:forEach items="${row}" var="data">
                    <td >${data}</td>
				</c:forEach>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>