<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<title>Fin du jeu</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="bg-gradient">
    <div class="container card">
        <h1>Félicitations ! Vous avez trouvé le nombre secret.</h1>
        <p>Nombre de tentatives : ${tentatives}</p>
        <form action="start" method="post">
            <button type="submit">Rejouer</button>
        </form>
        <a href="/"><button>Retour à l'accueil</button></a>
    </div>
</div>
</body>
</html>