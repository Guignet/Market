<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Magasins</title>
    <link rel="stylesheet" href="/css/bugtracking.css"/>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h1>Magasins</h1>
<h2>Liste </h2>
<table>
    <tr>
        <td>Nom</td>
        <td>Adresse</td>

    </tr>
    <c:forEach var="magasin" items="${magasins}">
        <tr>
            <td><a href="/magasins/${magasin.id}">${magasin.name}</a></td>
            <td>${magasin.address}</td>

            <td>
                <form:form action="/magasins/delete/${magasin.id}" method="post">
                    <button type="submit" >Delete </button>
                </form:form>
            </td>
        </tr>
    </c:forEach>
</table>
<h2>Ajouter un nouveau magasin</h2>
<form:form action="/magasins/register" method="post" modelAttribute="newMagasin">
    <form:input path="name" value="" placeholder="Nom"/>
    <form:input path="address" value="" placeholder="Address"/>
    <input type="submit" value="Save"/>
</form:form>
</body>
</html>