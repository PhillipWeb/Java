<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Avaliação de Perfil de Skatista</title>
</head>
<body>
	<form action="avaliarSkatista" method="post">
        <div>
            <label for="nome">Nome:</label>
            <input type="text" id="nome" name="nome" required>
        </div>
          

        <div>
            <label for="idade">Idade:</label>
            <input type="number" id="idade" name="idade" required>
        </div>
          
        <div>
            <label for="estilo">Estilo de Skate:</label>
            <select id="estilo" name="estilo" required>
                <option value="">Selecione um estilo</option>
                <option value="street">Street</option>
                <option value="park">Park</option>
                <option value="vertical">Vertical</option>
            </select>
        </div>
          
        <div>
            <p>Frequência de prática:</p>
            <input type="radio" id="freq1" name="frequencia" value="1x" required>
            <label for="freq1">1x/semana</label>  

            <input type="radio" id="freq2" name="frequencia" value="3x">
            <label for="freq2">3x/semana</label>  

            <input type="radio" id="freq3" name="frequencia" value="diariamente">
            <label for="freq3">Diariamente</label>
        </div>
          
        <button type="submit">Avaliar Perfil</button>
    </form>
</body>
</html>