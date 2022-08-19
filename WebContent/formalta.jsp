<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ModuloAlta</title>
</head>
<s:head/>
<sx:head/>
<body>
	<sx:tabbedpanel id="formAlta">
		<sx:div label="MODULO DE AGREGAR USERCAP">
			<s:form action="alta.action" method="post">
				<s:textfield key="nombre" label="NOMBRE"/>
				<s:password key="password" label="PASSWORD"/>
				<s:radio  name="genero" label="GENERO" list="#{'Masculino':'MASCULINO','Femenino':'FEMENINO'}"/>
				<s:checkboxlist name="idioma" label="IDIOMA" list="#{'Esp':'Espa�ol','Ale':'AlEMAN','ingl':'INGLES','Port':'PORTUGUES'}"/>
				<s:select name="ciudad" label="CIUDAD" list="#{'Pue':'PUEBLA','Tlax':'Tlaxcala','Mor':'MORELOS','Cdmx':'CD-MX','Ver':'VERACRUZ'}" 
				headerkey="1" headerValue="Selecciona Ciudad"/>
				<sx:datetimepicker key="fecha" label="FECHA" displayFormat="dd/MM/yyyy"/>
				<sx:autocompleter name="tipo" label="TIPO" list="#{'User':'USER','Root':'ROOT','Admin':'ADMIN'}"/>
				<s:textarea key="comentario" label="COMENTARIO"/>
				<s:submit value="Enviar Datos"/>
			</s:form>
		</sx:div>
	</sx:tabbedpanel>
	

</body>
</html>