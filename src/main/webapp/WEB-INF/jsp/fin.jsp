<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Fin du jeu</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/style.css'/>">
</head>
<body>
<div class="container">
    <h1>Félicitations ! Vous avez trouvé le nombre secret.</h1>
    <p>Nombre de tentatives : ${tentatives}</p>

    <form action="start" method="post">
        <button type="submit">Rejouer</button>
    </form>

    <a href="/">Retour à l'accueil</a>
</div>
</body>
</html>
