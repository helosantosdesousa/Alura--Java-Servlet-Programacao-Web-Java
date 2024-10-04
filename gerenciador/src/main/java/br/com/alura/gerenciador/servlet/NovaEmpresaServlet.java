package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		
		//pega o nome que passou pelo form
		String nomeEmpresa = request.getParameter("nome");
		
		//Criar a empresa
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		BancoDeDados banco = new BancoDeDados();
		banco.adiciona(empresa);
		
		///print no console (está printando o endereço de
		//memória, mas é só pra ver se está armazenando certo
		System.out.println(banco.getArrayEmpresas());

		PrintWriter out = response.getWriter();
		out.println("<html><body> Empresa " + nomeEmpresa + " cadastrada com sucesso </body></html>");
	}

}