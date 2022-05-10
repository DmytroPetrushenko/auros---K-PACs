<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>K-Pac Sets</title>
    <style>
        .table {
            height: 300px;
            width: 600px;
            margin: 10px;
            border: 2px solid blue;
        }
        tr {
            border: 1px solid blue;
            margin: 10px;
        }
        th {
            border: 1px solid blue;
        }
        .form {
            height: 200px;
            width: 590px;
            margin: 10px;
            border: 2px solid blue;
            padding: 5px;
        }
        .div {
            padding: 5px;
        }
    </style>
</head>
<body>
    <table class="table">
        <tr>
            <th>Id:</th>
            <th>Title:</th>
        </tr>
        <c:forEach items="${kPacSetData}" var="data">
            <tr>
                <th>${data.id}</th>
                <th><a href="/set/${data.id}">${data.title}</a></th>
                <th>
                    <form:form method="delete" action="/sets/${data.id}">
                        <input type="submit" value="DELETE">
                    </form:form>
                </th>
            </tr>
        </c:forEach>
    </table>
    <div class="form">
        <form:form method="post" action="/sets" modelAttribute="kPacSet">
            <div class="div">
                <label for="title">Enter the name of the new K-PAC Set:</label><br>
                <form:input path="title" id="title"/>
            </div>
            <div class="div">
            <form:select path="kpacList" items="${kPacData}" itemValue="id" itemLabel="title" multiple="true"/>
            </div>
            <input type="submit" title="SUBMIT">
        </form:form>
    </div>
</body>
</html>
