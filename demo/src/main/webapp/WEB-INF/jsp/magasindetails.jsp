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
<h2>Liste</h2>

<table class="table mt-5 table-light table-striped table-hover caption-top align-middle">
    <thead class="table-dark">
        <tr>
            <th class="col-1">ID</th>
            <th class="col-1">NOM</th>
            <th class="col-1">ADRESSE</th>
            <th class="col-1">PROPRIETAIRE</th>
        </tr>
    </thead>

    <tbody>
    <c:forEach var="magasin" items="${magasins}">
        <tr>
            <th scope="row">${magasin.id}</th>
            <td><a href="/magasins/${magasin.id}">${magasin.name}</a></td>
            <td>${magasin.address}</td>
            <td><a href="/owners/${magasin.owner.id}">${magasin.owner.name}</a> </td>
        </tr>
    </c:forEach>
    </tbody>
    <tfoot class="table-dark">
    <tr>
        <th class="col-1">ID</th>
        <th class="col-1">NOM</th>
        <th class="col-1">ADRESSE</th>
        <th class="col-1">PROPRIETAIRE</th>
    </tr>
    </tfoot>
</table>


<h2>Ajouter un nouveau produit</h2>

<div class="mt-5">
    <form method="">
        <input type="radio" id="arme" name="typeprod" value="arme" onclick="addItem(this.value)" checked>
        <label for="arme">Arme</label>

        <input type="radio" id="consomable" name="typeprod" value="consomable" onclick="addItem(this.value)">
        <label for="consomable">Consomable</label>

        <input type="radio" id="protection" name="typeprod" value="protection" onclick="addItem(this.value)">
        <label for="protection">Protection</label>

        <input type="hidden" name="type" value="-1">

    </form>

    <form:form class="form-add-arme d-none" onsubmit="submitForm()" onreset="hideForm()" action="/produits/register" method="post" modelAttribute="newArme">
        <h1>Ajouter une Arme</h1>
        <label class="form-label" for="damage">Damage</label>
        <form:input class="form-control" id="damage" type="number" path="damage" value="" placeholder="damage"/>
        <input class="btn btn-primary btn-lg mt-5" type="submit" value="Save"/>
    </form:form>


    <form:form class="form-add-consomable d-none" onsubmit="submitForm()" onreset="hideForm()" action="/produits/register" method="post" modelAttribute="newConsomable">
        <h1>Ajouter une Potion</h1>
        <form:input class="form-control" id="effect" type="text" path="effect" value="" placeholder="effect"/>
        <input class="btn btn-primary btn-lg mt-5" type="submit" value="Save"/>
    </form:form>


    <form:form class="form-add-protection d-none" onsubmit="submitForm()" onreset="hideForm()" action="/produits/register" method="post" modelAttribute="newProtection">
        <h1>Ajouter une Armure</h1>
        <form:input class="form-control" id="defense" type="number" path="defense" value="" placeholder="defense"/>
        <input class="btn btn-primary btn-lg mt-5" type="submit" value="Save"/>
    </form:form>

</div>


<script>

    function addItem(value) {
        if (value.equals("arme")){
            document.querySelector('.form-add-arme').setAttribute('class', 'form-add-arme d-block');

            document.querySelector('.form-add-consomable').setAttribute('class', 'form-add-consomable d-none');
            document.querySelector('.form-add-protection').setAttribute('class', 'form-add-protection d-none');
        }
        else if (value.equals("consomable")){
            document.querySelector('.form-add-consomable').setAttribute('class', 'form-add-consomable d-block');

            document.querySelector('.form-add-arme').setAttribute('class', 'form-add-arme d-none');
            document.querySelector('.form-add-protection').setAttribute('class', 'form-add-protection d-none');
        }
        else if (value.equals("protection")){
            document.querySelector('.form-add-protection').setAttribute('class', 'form-add-protection d-block');

            document.querySelector('.form-add-arme').setAttribute('class', 'form-add-arme d-none');
            document.querySelector('.form-add-consomable').setAttribute('class', 'form-add-consomable d-none');
        }

    }

    function submitForm() {
        document.querySelector('.form-add-arme').reset();
        document.querySelector('.form-add-consomable').reset();
        document.querySelector('.form-add-protection').reset();
    }

</script>


</body>
</html>