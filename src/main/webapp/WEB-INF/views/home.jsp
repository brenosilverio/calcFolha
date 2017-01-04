<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.8/css/materialize.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Calculadora Folha Invest</title>
<style>
	.table {
		padding: 0px;
	}
	.table tr {
		padding: 0px;
	}
	.table td {
		padding: 5px;
	}
</style>
</head>
<body>
	<div class="container">
		<h3 style="text-align: center"></h3>
		<div class="row">
			<div class="col s12 m3"></div>
			<div class="col s12 m6">
				<form action="/calculadora/calculator" method="POST"
					name="calculator">
					<div class="input-field col s12">
						<input id="vlAction" type="text" class="validate"
							placeholder="Valor Inicial" name="vlAction"
							onkeypress='return numeroDecimal(this)' required />
					</div>
					<div class="input-field col s12">
						<input id="vlInterest" type="text" class="validate"
							placeholder="Valor do Juros"
							onkeypress='return numeroJuros(this)' name="vlInterest" required />
					</div>
					<div class="input-field col s12">
						<input id="qtPurch" type="text" class="validate"
							placeholder="Quantidade Comprada"
							onkeypress='return numeroInteiro(this)' name="qtPurch" required />
					</div>
					<button class="btn waves-effect waves-light" type="submit"
						name="action">Calcular</button>
				</form>
				<br />
				<table class="table">
					<tr>
						<td class="tg-yw4l">Total Ganho</td>
						<td class="tg-yw4l">${results.totalWin}</td>
					</tr>
					<tr>
						<td class="tg-yw4l">Juros Compra</td>
						<td class="tg-yw4l">${results.interestBuyPurch}</td>
					</tr>
					<tr>
						<td class="tg-yw4l">Juros Venda</td>
						<td class="tg-yw4l">${results.interestBuySale}</td>
					</tr>
					<tr>
						<td class="tg-yw4l">Emolumentos</td>
						<td class="tg-yw4l">${results.emolumentsPurch}</td>
					</tr>
					<tr>
						<td class="tg-yw4l">Lucro Líquido</td>
						<td class="tg-yw4l">${results.liquidProfit}</td>
					</tr>
				</table>
			</div>


			<div class="col s12 m3"></div>
		</div>

		<!-- <footer class="page-footer">
			<div class="container">
				<div class="row">
					<div class="col l6 s12">
						<h5 class="white-text">Footer Content</h5>
						<p class="grey-text text-lighten-4">You can use rows and
							columns here to organize your footer content.</p>
					</div>
					<div class="col l4 offset-l2 s12">
						<h5 class="white-text">Links</h5>
						<ul>
							<li><a class="grey-text text-lighten-3" href="#!">Sobre
									Nós</a></li>
							<li><a class="grey-text text-lighten-3" href="#!">Politica
									de Privacidade</a></li>
							<li><a class="grey-text text-lighten-3" href="#!">Fale
									Conosco</a></li>
							<li><a class="grey-text text-lighten-3" href="#!">Link 4</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="footer-copyright">
				<div class="container">© 2016 Copyright</div>
			</div>
		</footer> -->

		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.8/js/materialize.min.js"></script>

		<script type="text/javascript">
			function numeroDecimal(e) {
				var tecla = (window.event) ? event.keyCode : e.which;
				if (tecla == 46)
					return true;
				if (tecla > 47 && tecla < 58)
					return true;
				else {
					if (tecla == 8 || tecla == 0)
						return true;
					else
						return false;
				}
			}
			function numeroJuros(e) {
				var tecla = (window.event) ? event.keyCode : e.which;
				if (tecla > 44 && tecla < 47)
					return true;
				if (tecla > 47 && tecla < 58)
					return true;
				else {
					if (tecla == 8 || tecla == 0)
						return true;
					else
						return false;
				}
			}
			function numeroInteiro(e) {
				var tecla = (window.event) ? event.keyCode : e.which;
				if (tecla > 47 && tecla < 58)
					return true;
				else {
					if (tecla == 8 || tecla == 0)
						return true;
					else
						return false;
				}
			}
		</script>
	</div>
</body>
</html>