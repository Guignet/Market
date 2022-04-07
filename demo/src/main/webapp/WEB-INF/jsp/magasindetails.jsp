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
<h2>List</h2>
<table>
    <tr>
        <td>Id</td>
        <td>Nom</td>
        <td>Description</td>
    </tr>
    <c:forEach var="produit" items="${magasin.produits}">
        <tr>
            <th scope="row">${produit.id}</th>
            <td><a href="/produits/${produit.id}">${produit.name}</a></td>
            <td>${produit.description}</td>
            <td>
                <form:form class="col-12" action="/produits/delete/${produit.id}" method="post">
                    <button class="btn btn-danger m-1 p-0 col-5" type="submit" >Delete</button>
                </form:form>
            </td>
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