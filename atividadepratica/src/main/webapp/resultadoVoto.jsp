<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado da Verificação de Voto</title>
</head>
<body>
    <p><strong>Nome:</strong> <%= request.getAttribute("nomeUsuario") %></p>
    <p><strong>Idade:</strong> <%= request.getAttribute("idadeUsuario") %></p>
    <p><strong>Resultado:</strong> <%= request.getAttribute("resultadoVerificacao") %></p>

    <a href="index2.jsp">Verificar novamente</a>
</body>
</html>