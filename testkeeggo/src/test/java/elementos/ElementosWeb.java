package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	private By botaoUsuario = By.id("menuUser");
	private By botaoCriarConta = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	private By nome = By.name("usernameRegisterPage");
	private By email = By.name("emailRegisterPage");
	private By senha = By.name("passwordRegisterPage");
	private By csenha = By.name("confirm_passwordRegisterPage");
	private By prinome = By.name("first_nameRegisterPage");
	private By sobrenome = By.name("last_nameRegisterPage");
	private By telefone = By.name("phone_numberRegisterPage");
	private By pais = By.name("countryListboxRegisterPage");
	private By cidade = By.name("cityRegisterPage");
	private By endereco = By.name("addressRegisterPage");
	private By estado = By.name("state_/_province_/_regionRegisterPage");
	private By cep = By.name("postal_codeRegisterPage");
	private By marcar = By.name("i_agree");
	private By registro = By.id("register_btnundefined");
	private By validacao = By.cssSelector("#menuUserLink > span");
	private By login = By.id("menuUser");
	private By usuarionome = By.name("username");
	private By loginsenha = By.name("password");
	private By logar = By.id("sign_in_btnundefined");
	
	
	
	public By getBotaoUsuario() {
		return botaoUsuario;
	}

	public By getBotaoCriarConta() {
		return botaoCriarConta;
	}

	public By getNome() {
		return nome;
	}

	public By getEmail() {
		return email;
	}

	public By getSenha() {
		return senha;
	}

	public By getCsenha() {
		return csenha;
	}

	public By getPrinome() {
		return prinome;
	}

	public By getSobrenome() {
		return sobrenome;
	}

	public By getTelefone() {
		return telefone;
	}

	public By getPais() {
		return pais;
	}

	public By getCidade() {
		return cidade;
	}

	public By getEndereco() {
		return endereco;
	}

	public By getEstado() {
		return estado;
	}

	public By getCep() {
		return cep;
	}

	public By getMarcar() {
		return marcar;
	}

	public By getRegistro() {
		return registro;
	}

	public By getValidacao() {
		return validacao;
	}

	public By getLogin() {
		return login;
	}

	public By getUsuarionome() {
		return usuarionome;
	}

	public By getLoginsenha() {
		return loginsenha;
	}

	public By getLogar() {
		return logar;
	}
	

}
