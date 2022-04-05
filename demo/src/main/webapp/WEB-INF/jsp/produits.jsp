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
<%--TODO faire l'affichage des produits--%>
<h1>Produits</h1>
<h2>List</h2>
<table>
    <tr>
        <td>Nom</td>
        <td>Adresse</td>
        <td>Proprietaire</td>
    </tr>
    <c:forEach var="magasin" items="${magasins}">
        <tr>
            <td><a href="/magasins/${magasin.id}">${magasin.name}</a></td>
            <td>${magasin.address}</td>
            <td><a href="/owners/${magasin.owner.id}">${magasin.owner.name}</a> </td>
        </tr>
    </c:forEach>
</table>
<h2>Add new release</h2>
<form:form action="/releases/register" method="post" modelAttribute="newMagasin">
    <form:input path="name" value="" placeholder="Nom"/>
    <form:input path="address" value="" placeholder="Address"/>
    <input type="submit" value="Save"/>
</form:form>
</body>
</html>