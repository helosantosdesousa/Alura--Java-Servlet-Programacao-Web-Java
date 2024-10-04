<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="br.com.alura.gerenciador.servlet.Empresa" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista das empresas jsp</title>
</head>
<body>

    Lista de empresas: <br />
    <ul>
    <% 
        List<Empresa> arrayEmpresas = (List<Empresa>)request.getAttribute("empresas");
        if (arrayEmpresas != null && !arrayEmpresas.isEmpty()) {
            for (Empresa e : arrayEmpresas) {
    %>
        <li><%= e.getNome() %></li> 
    <% 
            }
        } else {
    %>
        <li>Nenhuma empresa cadastrada.</li>
    <% 
        }
    %>
    </ul>

</body>
</html>
