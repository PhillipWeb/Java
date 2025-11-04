<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado do IMC</title>
</head>
<body>
    <p><strong>Nome:</strong> <%= request.getAttribute("nomeUsuario") %></p>
    <%
        double imc = (Double) request.getAttribute("valorImc");
    %>
    <p><strong>Valor do IMC:</strong> <%= String.format("%.2f", imc) %></p>

    <p><strong>Classificação:</strong> <%= request.getAttribute("classificacaoImc") %></p>

    <a href="index.jsp">Calcular novamente</a>
</body>
</html>