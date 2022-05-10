<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>K-PACs</title>
    <style>
        .table {
            width: 600px;
            border: 2px solid darkslateblue;
            padding: 5px;
            margin: 5px;
        }
        th {
            border: 2px solid darkslateblue;
            padding: 5px;
            margin: 5px;
        }
        tr {
            width: 600px;
            border: 2px solid darkslateblue;
            padding: 5px;
            margin: 5px;
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
            margin: 10px;
        }
    </style>
</head>
<body>
    <table class="table">
        <thead>
            <tr>
                <th>Id:</th>
                <th>Title:</th>
                <th>Description:</th>
                <th>Creation Date:</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${kPacData}" var="data">
                <tr>
                    <th>${data.id}</th>
                    <th>${data.title}</th>
                    <th>${data.description}</th>
                    <th>${data.creationDate}</th>
                    <th>
                        <form:form method="delete" action="/kpacs/${data.id}">
                            <input type="submit" value="DELETE">
                        </form:form>
                    </th>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div class="form">
        <form:form method="post" action="/kpacs" modelAttribute="kPac">
            <div class="div">
                <label for="title">Enter a title name:</label><br>
                <form:input path="title" id="title"/>
            </div>
            <div class="div">
                <label for="description">Enter a description:</label><br>
                <form:input path="description" id="description"/>
            </div>
            <div class="div">
                <input type="submit" value="SUBMIT">
            </div>
        </form:form>
    </div>
</body>
</html>
