<%@page import="model.TblCliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Cliente</title>
</head>


<body bgcolor="#c5dec9">
	<h1 align="center">Actualizar cliente</h1>

	<form method="post" action="controladorCliente">
	
	<%
		TblCliente codigo=(TblCliente)request.getAttribute("codigo");
	%>
		<table align="center" borde="2">
			<tr>
				<td><input type="text" name="codigo" value="<%=%>"></td>
			</tr>
			<tr>
				<td>Nombre</td>
				<td><input type="text" name="nombre" value=""></td>
			</tr>
			<tr>
				<td>Apellido</td>
				<td><input type="text" name="apellido" value=""></td>
			</tr>
			<tr>
				<td>Dni</td>
				<td><input type="text" name="dni" value=""></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value=""></td>
			</tr>
			<tr>
				<td>Telefono</td>
				<td><input type="text" name="telefono" value=""></td>
			</tr>
			<tr>
				<td>Sexo</td>
				<td><input type="text" name="sexo" value=""></td>
			</tr>
			<tr>
				<td>Nacionalidad</td>
				<td><input type="text" name="nacionalidad" value=""></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Actualizar Cliente"></td>
			</tr>
		</table>
	</form>
</body>
</html>