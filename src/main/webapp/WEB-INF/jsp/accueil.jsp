<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Accueil GuessMyNumber</title>
    <link rel="stylesheet" href="<c:url value='/css/style.css' />">
</head>
<body>
<div class="container">
    <h1>Bienvenue dans le jeu GuessMyNumber !</h1>
    <form action="start" method="post">
        <button type="submit">Commencer le jeu</button>
    </form>
</div>
</body>
</html>
