<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HTML Decorator!</title>
</head>
<body>
	<!-- Todo se edita desde aqui... -->
	<h1>Decorador HTML!</h1>
	<p>Agrega contenido HTML a la pagina según se seleccione, por el momento es solo lineal, no agrega un componente dentro de otro. :(</p>
	<%
		request.getAttribute("val");
		String result= (String)request.getAttribute("val");
		out.println(result);
	%>
	<!-- ...hasta aqui -->
	<div>
		<form method="post" action="HTMLDecorator">
			<label><input type="checkbox" name="h1" id="h1" value="h1_checkbox"> Agregar h1</label><br>
			<label><input type="checkbox" name="h2" id="h2" value="h2_checkbox"> Agregar h2</label><br>
			<label><input type="checkbox" name="h3" id="h3" value="h3_checkbox"> Agregar h3</label><br>
			<label><input type="checkbox" name="h4" id="h4" value="h4_checkbox"> Agregar h4</label><br>
			<label><input type="checkbox" name="bold" id="bold" value="bld_checkbox"> Agregar bold</label><br>
			<label><input type="checkbox" name="paragraph" id="paragraph" value="paragraph_checkbox"> Agregar párrafo</label><br>
			<label><input type="checkbox" name="list" id="list" value="list_checkbox"> Agregar list</label><br>
			<label><input type="checkbox" name="div" id="div" value="div_checkbox"> Agregar Div</label><br>
			
			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>