package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ListaEmpresasServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	BancoDeDados banco = new BancoDeDados();
	
	List<Empresa> arrayEmpresas = banco.getArrayEmpresas();
	banco.adicionaMockado();
	
	
	
	//printar no html
	PrintWriter out = response.getWriter();
	
	//html
	out.println("<body><html>");
	out.println("<ul>");
	
	//printar a lista de empresas
	for(Empresa e: arrayEmpresas){
		out.println("<li>" + e.getNome() + "</li>");
	}
	
	out.println("</ul>");
	out.println("</body></html>");
	}

}
