package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Cadastrando nova empresa");
        
        // Pega o nome que passou pelo formulário
        String nomeEmpresa = request.getParameter("nome");
        
        // Criar a empresa
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);
        
        BancoDeDados banco = new BancoDeDados();
        banco.adiciona(empresa);
        
        // Redireciona para o servlet que lista as empresas
        response.sendRedirect("listaEmpresas");
    }
}
