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

<table class="table mt-5 table-light table-striped table-hover caption-top align-middle">
    <thead class="table-dark">
        <tr>
            <th class="col-1">ID</th>
            <th class="col-1">NOM</th>
            <th class="col-1">ADRESSE</th>
            <th class="col-6">ACTIONS</th>
        </tr>
    </thead>

    <tbody>
    <c:forEach var="magasin" items="${magasins}">
        <tr>
            <th scope="row">${magasin.id}</th>
            <td><a href="/magasins/${magasin.id}">${magasin.name}</a></td>
            <td>${magasin.address}</td>

            <td>
                <form:form class="col-12" action="/magasins/delete/${magasin.id}" method="post">
                    <button class="btn btn-danger m-1 p-0 col-5" type="submit" >Delete</button>
                </form:form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
    <tfoot class="table-dark">
        <tr>
            <th class="col-1">ID</th>
            <th class="col-1">NOM</th>
            <th class="col-1">ADRESSE</th>
            <th class="col-6">ACTIONS</th>
        </tr>
    </tfoot>
</table>

<div class="mt-5">
    <h1>Ajouter un nouveau magasin</h1>

    <form:form class="col-3 mt-5" action="/magasins/register" method="post" modelAttribute="newMagasin">
        <label class="form-label" for="name">Nom</label>
        <form:input class="form-control" id="name" type="text" path="name" value="" placeholder="Nom"/>

        <label class="form-label" for="adress">Nom</label>
        <form:input class="form-control" id="adress" type="text"  path="address" value="" placeholder="Address"/>

        <input class="btn btn-primary btn-lg mt-5" type="submit" value="Save"/>
    </form:form>
</div>

</body>
</html>