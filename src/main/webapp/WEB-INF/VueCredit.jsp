<%@ page import="control.CreditModel" %><%--
  Created by IntelliJ IDEA.
  User: Surface
  Date: 18/04/2023
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    CreditModel creditModel = (CreditModel) request.getAttribute("CreditModel");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculateur de prêt</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container mt-5">
    <div class="row justify-content-center">

        <div class="col-md-6">
            <h1 class="text-center">Simulation du Credit</h1>
            <form action="index" method="post">
                <div class="form-group">
                    <label for="montant">Montant :</label>
                    <input type="text" class="form-control" id="montant" name="montant">
                </div>
                <div class="form-group">
                    <label for="taux">Taux :</label>
                    <input type="text" class="form-control" id="taux" name="taux">
                </div>
                <div class="form-group">
                    <label for="duree">Durée :</label>
                    <input type="text" class="form-control" id="duree" name="duree">
                </div>
                <button type="submit" class="btn btn-primary">Calculer</button>
            </form>
            <p class="mt-3"><%= creditModel.getMensualite()%></p>
        </div>

    </div>

</div>

</body>
</html>



