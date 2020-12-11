package ChallengeZeDelivery.steps;



import ChallengeZeDelivery.methods.ZeDeliveryMethods;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class ZeDeliverysteps {
	
	@Dado("^que o usuario acesse o \"([^\"]*)\"$")
	public void que_o_usuario_acesse_o(String arg1) throws Throwable {
		ZeDeliveryMethods.acessarPagina();
	}
	
	@Entao("^validar Mensagem de faixa etaria$")
	public void validar_Mensagem_de_faixa_etaria() throws Throwable {
		ZeDeliveryMethods.mensagemMaioridade();
	}
	
	@Entao("^Clicar em \"([^\"]*)\"$")
	public void clicar_em(String arg1) throws Throwable {
		ZeDeliveryMethods.selecionarAvisoNao();
	}
	
	@Entao("^Clicar em \"([^\"]*)\" ambev$")
	public void clicar_em_ambev(String arg1) throws Throwable {
		ZeDeliveryMethods.selecionarAvisoNaoambev();
	}
	
	@E("^Clicar no botao \"([^\"]*)\"$")
	public void clicar_no_botao(String arg1) throws Throwable {
		ZeDeliveryMethods.selecionarSimMaior();
	}

	@Entao("^apresentar a tela Principal \"([^\"]*)\"$")
	public void apresentar_a_tela_Principal(String arg1) throws Throwable {
		ZeDeliveryMethods.validarTelaHome();
	}
	
	@Entao("^Clicar em Entrar$")
	public void clicar_em_Entrar() throws Throwable {
		ZeDeliveryMethods.validarEntrar();
	}

	@Quando("^Clicar em Criar uma conta$")
	public void clicar_em_Criar_uma_conta() throws Throwable {
		ZeDeliveryMethods.criarConta();
	}

	@Entao("^Informar dados do Usuario$")
	public void informar_dados_do_Usuario() throws Throwable {
		ZeDeliveryMethods.informardadoscadastro();
	}
	
	@Entao("^validar Mensagem de validacao$")
	public void validar_Mensagem_de_validacao() throws Throwable {
		ZeDeliveryMethods.clicarContinuar();
	}
	
	@Entao("^Clicar \"([^\"]*)\"$")
	public void clicar(String arg1) throws Throwable {
		ZeDeliveryMethods.clicaremValidarMaisTarde();
	}
	@Entao("^apresentar tela home$")
	public void apresentar_tela_home() throws Throwable {
	    
	}

	@E("^Apresentar conta logada$")
	public void apresentar_conta_logada() throws Throwable {
	   
	}
	
	@Quando("^Informar E-mail e Senha$")
	public void informar_E_mail_e_Senha() throws Throwable {
		ZeDeliveryMethods.informarLogin();
	}

	@Entao("^deve apresentar a Home$")
	public void deve_apresentar_a_Home() throws Throwable {
		ZeDeliveryMethods.validarLoginHome();

	}


	    

}
