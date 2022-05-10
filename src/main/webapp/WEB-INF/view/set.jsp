<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${kPacSet.title}</title>
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
    </style>
</head>
<body>
    <div>
        <table class="table">
            <thead>
                <tr>
                    <th>ID:</th>
                    <th colspan="3">${kPacSet.id}</th>
                </tr>
                <tr>
                    <th>Title:</th>
                    <th colspan="3">${kPacSet.title}</th>
                </tr>
                <tr>
                    <th colspan="4">The name of K-PAC:</th>
                </tr>
                <tr>
                    <th>Id</th>
                    <th>Title</th>
                    <th>Description</th>
                    <th>Creation Date</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${kPacSet.kpacList}" var="kPac">
                    <tr>
                        <th>${kPac.id}</th>
                        <th>${kPac.title}</th>
                        <th>${kPac.description}</th>
                        <th>${kPac.creationDate}</th>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
