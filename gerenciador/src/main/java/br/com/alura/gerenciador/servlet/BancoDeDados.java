package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
	//Lista com as empresas pra simular que está em um BD
	public static List<Empresa> arrayEmpresas = new ArrayList();
	
	
	public void adiciona(Empresa empresa) {
		arrayEmpresas.add(empresa);
	}
	
	public void adicionaMockado() {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Empresa 1");
		arrayEmpresas.add(empresa1);

	}
	
	
	
	
	public static List<Empresa> getArrayEmpresas() {
		return arrayEmpresas;
	}
	
	

}
