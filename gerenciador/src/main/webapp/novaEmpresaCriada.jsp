<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nova empresa criada</title>
</head>
<body>
<html>
<body> 
<!-- Empresa " + nomeEmpresa + " cadastrada com sucesso  -->
<%
//Isso é um scriplet

String nomeEmpresa = (String)request.getAttribute("empresaAtributo");
System.out.println("Cadastrei no jsp a empresa: " + nomeEmpresa);

%>

jsp Empresa <%=nomeEmpresa %> cadastrada com sucesso! 
<!-- Nao precisa instanciar o printWriter no jsp -->

</body></html>
</body>
</html>