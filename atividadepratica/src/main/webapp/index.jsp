<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora IMC</title>
</head>
<body>
	<form action="CalculadoraIMC" method="post">
        <div>
            <label for="nome">Nome:</label>
            <input type="text" id="nome" name="nome" required>
        </div>
          

        <div>
            <label for="peso">Peso (kg):</label>
            <input type="number" id="peso" name="peso" step="0.1" required>
        </div>
          

        <div>
            <label for="altura">Altura (cm):</label>
            <input type="number" id="altura" name="altura" step="0.01" required>
        </div>
          

        <button type="submit">Calcular</button>
    </form>
</body>
</html>