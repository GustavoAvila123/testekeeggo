package testes;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Metodos;

public class Steps {
	
	ElementosWeb elementos = new ElementosWeb();
	Metodos metodos = new Metodos();
	
	@Dado("que eu esteja no site")
	public void que_eu_esteja_no_site() {
	  metodos.abrirNavegador("http://advantageonlineshopping.com/#/");
	}

	@Quando("cadastrar uma conta")
	public void cadastrar_uma_conta() throws InterruptedException {
		metodos.clicar(elementos.getBotaoUsuario());
		metodos.pausa(3000);
		metodos.clicar(elementos.getBotaoCriarConta());
		metodos.escrever(elementos.getNome(), "Josefina");
		metodos.escrever(elementos.getEmail(), "a1@a1.com.br");
		metodos.escrever(elementos.getSenha(), "Gg@123");
		metodos.escrever(elementos.getCsenha(), "Gg@123");
		metodos.escrever(elementos.getPrinome(), "Rodolfo");
		metodos.escrever(elementos.getSobrenome(), "Avila");
		metodos.escrever(elementos.getTelefone(), "(11) 99190-9090");
		metodos.escrever(elementos.getPais(), "Brazil");
		metodos.escrever(elementos.getCidade(), "Osasco");
		metodos.escrever(elementos.getEndereco(), "Rua 12345");
		metodos.escrever(elementos.getEstado(), "São Paulo");
		metodos.escrever(elementos.getCep(), "1234-123");
		metodos.clicar(elementos.getMarcar());
		metodos.pausa(3000);
		metodos.clicar(elementos.getRegistro());
	}

	@Entao("valido as informacoes")
	public void valido_as_informacoes() throws InterruptedException, IOException {
		metodos.pausa(3000);
		metodos.validacao("Josefina", elementos.getValidacao());
		metodos.ScreenShot("evidencia");
		metodos.fecharNavegador();
		
	}
	
	@Dado("que esteja no site")
	public void que_esteja_no_site() {
	  metodos.abrirNavegador("http://advantageonlineshopping.com/#/");
	}
	
	@Quando("digitar login e senha")
	public void digitar_login_e_senha() throws InterruptedException {
		metodos.clicar(elementos.getLogin());
		metodos.escrever(elementos.getUsuarionome(), "Rodolfoo");
		metodos.escrever(elementos.getLoginsenha(), "Gg@123");
		metodos.pausa(3000);
		metodos.clicar(elementos.getLogar());
		
	}
	
	@Entao("valida as informacoes")
	public void valida_as_informacoes() throws InterruptedException, IOException {
		metodos.pausa(3000);
		metodos.validacao("Rodolfoo", elementos.getValidacao());
		metodos.ScreenShot("evidencia1");
		metodos.fecharNavegador();
		
	}
	
	
	

}
