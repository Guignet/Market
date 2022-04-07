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
<h1>Magasins</h1>
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
<h2>Ajouter un produit</h2>
<form method="">
    <input type="radio" id="arme" name="typeprod" value="arme"
           checked>
    <label for="arme">Arme</label>
    <input type="radio" id="consomable" name="typeprod" value="consomable"
           >
    <label for="consomable">Consomable</label>
    <input type="radio" id="protection" name="typeprod" value="protection"
           >
    <label for="protection">Protection</label>
</form>
<form:form action="/releases/register" method="post" modelAttribute="newMagasin">
    <form:input path="name" value="" placeholder="Nom"/>
    <form:input path="address" value="" placeholder="Address"/>
    <input type="submit" value="Save"/>
</form:form>

<script>


</script>
</body>
</html>