<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Verificação de Elegibilidade para Voto</title>
</head>
<body>
	<form action="verificarVoto" method="post">
        <div>
            <label for="nome">Nome:</label>
            <input type="text" id="nome" name="nome" required>
        </div>
          
        <div>
            <label for="idade">Idade:</label>
            <input type="number" id="idade" name="idade" required>
        </div>
          
        <button type="submit">Verificar</button>
    </form>
</body>
</html>