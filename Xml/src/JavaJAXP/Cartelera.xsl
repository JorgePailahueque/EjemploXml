<?xml version="1.0" encoding="iso-8859-1"?> 
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"> 
<xsl:output method="html"/> 
<xsl:template match="/"> 
	<html> 
		<head> 
			<style type="text/css"> table {font-family: arial, 'sans serif'; 
				margin-left: 15pt;} 
				th,td {font-size: 80%;} 
				th {background-color:#FAEBD7} 
			</style> 
		</head> 
		<body> 
			<table border="1"> 
				<xsl:apply-templates/> 
			</table> 
		</body> 
	</html> 
</xsl:template>
<xsl:template match="Cartelera"> 
<xsl:for-each select="Cine"> 
	<tr> 
		<th><xsl:text>Cine</xsl:text></th> 
		<th><xsl:text>Dirección</xsl:text></th> 
		<th><xsl:text>Población</xsl:text></th> 
		<th></th> </tr> <tr> 
		<td><xsl:value-of select="./@nombre"/></td> 
		<td><xsl:value-of select="./@direccion"/></td> 
		<td><xsl:value-of select="./@poblacion"/></td> 
		<td><xsl:text></xsl:text></td> 
	</tr> 
		<xsl:for-each select="Pelicula"> 
	<tr> 
		<th></th> 
		<th><xsl:text>Película</xsl:text></th> 
		<th><xsl:text>Director</xsl:text></th> 
		<th><xsl:text>Actores</xsl:text></th> 
	</tr> 
	<tr> 
	 	<td><xsl:text></xsl:text></td> 
		<td><xsl:value-of select="./@titulo"/></td> 
		<td><xsl:value-of select="./@director"/></td> 
		<td><xsl:value-of select="./@actores"/></td> 
	</tr>
	<tr> 
		<th></th> 
		<th></th> 
		<th><xsl:text>Sesión</xsl:text></th> 			
		<th><xsl:text>Hora</xsl:text></th> 
	</tr> 
		<xsl:for-each select="Sesion"> 
		<tr> 
			<td><xsl:text></xsl:text></td> 
			<td><xsl:text></xsl:text></td> 
			<td><xsl:value-of select="position()"/></td> 
			<td><xsl:value-of select="."/></td> 
		</tr> 
		</xsl:for-each> 
	</xsl:for-each> 
</xsl:for-each> 
</xsl:template> 
</xsl:stylesheet>