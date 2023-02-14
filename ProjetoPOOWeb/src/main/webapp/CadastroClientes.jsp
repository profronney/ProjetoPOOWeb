<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro de Clientes</title>
	</head>
	<body>
		<form action="/pagina-processa-dados-do-form" method="post">
    		<div>
        		<label for="codCliente">Código do Cliente:</label>
        		<input type="text" id="codCliente" />
    		</div>
    		<div>
        		<label for="nome">Nome:</label>
        		<input type="email" id="nome" />
    		</div>
    		<div>
        		<label for="endrua">Rua:</label>
        		<input type="email" id="endrua" />
    		</div>
    		<div>
        		<label for="endnumero">Número:</label>
        		<input type="email" id="endnumero" />
    		</div>
    		<div>
        		<label for="endcomplemento">Complemento:</label>
        		<input type="email" id="endcomplemento" />
    		</div>
    		<div class="button">
        		<button type="submit">Salvar</button>
   			 </div>
		</form>
	</body>
</html>