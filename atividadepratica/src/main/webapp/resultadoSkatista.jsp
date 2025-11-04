<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado da Avaliação</title>
</head>
<body>
    <h2>Olá, <%= request.getAttribute("nomeSkatista") %>!</h2>
    
    <p>Sua pontuação de perfil é: <strong><%= request.getAttribute("pontuacaoFinal") %> pontos</strong>.</p>
    <p>Sua classificação é: <strong><%= request.getAttribute("classificacaoFinal") %></strong>.</p>

    <a href="index3.html">Avaliar outro perfil</a>
</body>
</html>