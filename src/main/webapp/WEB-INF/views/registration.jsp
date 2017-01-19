<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.8/css/materialize.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Calculadora Folha Invest</title>
</head>
<body>

	<div class="container">
		<h3 style="text-align: center"></h3>
		<div class="row">
			<div class="col s12 m3"></div>
			<div class="col s12 m6">
				<form action="/calculadora/loginformRegistration" method="POST" name="userSave">
					<div class="input-field col s12">
						<input id="name" type="text" class="validate"
							placeholder="Nome Completo" name="name" required />
					</div>
					<div class="input-field col s12">
						<input id="email" type="email" class="validate"
							placeholder="Email" name="email" required aria-required="true" />
					</div>
					<div class="input-field col s12">
						<input id="pass" type="password" class="validate"
							placeholder="Senha" name="pass" maxlength="6" required/>
					</div>
					<div class="input-field col s12">
						<input id="passConfirm" type="password" class="validate"
							placeholder="Confirmar Senha" name="passConfirm" maxlength="6" required />
					</div>
					
					<button class="btn waves-effect waves-light" type="submit"
						name="action">Registrar</button>
					<a href="login"><p>Voltar</p></a>
				</form>
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
			var password = document.getElementById("pass")
			,confirm_password = document.getElementById("passConfirm");
			function validatePassword(){
				if(password.value != confirm_password.value) {
			    	confirm_password.setCustomValidity("Senha nao confere");
			  	} else {
			    	confirm_password.setCustomValidity('');
			  	}
			}
			pass.onchange = validatePassword;
			passConfirm.onkeyup = validatePassword;
		</script>
	</div>
</body>
</html>