package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BancoDeDados banco = new BancoDeDados();
        
        // Obtém a lista de empresas
        List<Empresa> arrayEmpresas = BancoDeDados.getArrayEmpresas();
        
        // Adiciona a lista ao request
        request.setAttribute("empresas", arrayEmpresas);
        
        // Redireciona para o JSP que exibe a lista
        RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
        rd.forward(request, response);
    }
}
