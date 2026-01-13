<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<title>Jeu</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="bg-gradient">
    <div class="container card">
        <h1>Devinez le nombre secret (1-100)</h1>
        <c:if test="${not empty message}">
            <p class="message">${message}</p>
        </c:if>
        <p>Nombre de tentatives : ${tentatives}</p>
        <form action="jeu" method="post">
            <input type="number" name="proposition" min="1" max="100" required placeholder="Votre proposition">
            <button type="submit">Proposer</button>
        </form>
    </div>
</div>
</body>
</html>