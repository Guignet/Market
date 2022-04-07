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
<%--TODO faire l'affichage des produits--%>
<h1>Produits</h1>
<h2>List</h2>
<table>
    <tr>
        <td>Id</td>
        <td>Nom</td>
        <td>Description</td>
    </tr>

        <tr>
            <th scope="row">${produit.id}</th>
            <td><a href="/produits/${produit.id}">${produit.name}</a></td>
            <td>${produit.description}</td>²
        </tr>

</table>

</body>
</html>