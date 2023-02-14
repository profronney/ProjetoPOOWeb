<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Texto Teste</title>
	</head>
	<body>
		Isto é um teste de corpo de página HTML
		<br>Teste de linha
		<br>
		<%
			out.println("Este é um teste de String<br>");
			int a = 8;
			int b = 10;
			out.println("Resultado: " + (a+b));
		%>
		<br>
		<b> Teste de fonte Negrito</b>
		<br>
		<button type="button">Clique Aqui</button>
		<br><br><br>
		
		<form action="CadastroClientes.jsp" method="post">
    		<div class="button">
        		<button type="submit">Cadastro de Clientes</button>
   			 </div>
		</form>
		
		
		
	</body>
</html>