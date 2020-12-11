package ChallengeZeDelivery.pages;

import static ChallengeZeDelivery.config.ZeDeliveryWebConfig.getDriver;
import static org.junit.Assert.assertEquals;



import static org.junit.Assert.assertTrue;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;

import ChallengeZeDelivery.obj.ZeDeliveryObj;

import org.openqa.selenium.chrome.ChromeDriver;





public class ZeDeliveryPage extends ZeDeliveryObj {
	
	
    private static  WebDriver driver;
    
	
	protected static By aSuaPrivacidade = By.id("A-sua");
	By aceitarCookies = By.cssSelector("button.optanon-allow-all.accept-cookies-button");
    By antarcticaGarrafa300ml = By.cssSelector("a[title='Antarctica Garrafa 300ml']");
    
    protected By aracaju = By.id("city-Aracaju");
    By ativo = By.id("chkMain");
    //protected By bebidasGeladasAPreoDeMercado = By.id("fake-address-search-input");
    By belm = By.id("city-Belém");
    By beloHorizonte = By.id("city-Belo Horizonte");
    By boaVista = By.id("city-Boa Vista");
    By brahmaLata350ml = By.cssSelector("a[title='Brahma Lata 350ml']");
    By braslia = By.id("city-Brasília");
    By budweiserGarrafa330ml = By.cssSelector("a[title='Budweiser Garrafa 330ml']");
    By campoGrande = By.id("city-Campo Grande");
    By cervejas = By.cssSelector("a[title='Cervejas']");
    By cidadesAtendidas = By.cssSelector("#__next footer.css-1jzdpvu-footer div.css-1ae9okz-footerContainer div:nth-of-type(2) div:nth-of-type(2) div.css-1xwekl6-linkContainer a:nth-of-type(4)");
    By configuraoDeCookies = By.cssSelector("button.optanon-toggle-display.cookie-settings-button");
    By cookiesDeDesempenho = By.id("Cookies-de");
    By cookiesDePublicidade = By.id("Cookies-de");
    By cookiesEstritamenteNecessrios = By.id("Cookies-estritamente");
    By cuiab = By.id("city-Cuiabá");
    By curitiba = By.id("city-Curitiba");
    By destilados = By.cssSelector("a[title='Destilados']");
    By entrar = By.id("welcome-button-sign-in");
    By fechar = By.cssSelector("button.optanon-alert-box-close");
    By florianpolis = By.id("city-Florianópolis");
    By fortaleza = By.id("city-Fortaleza");
    protected final By goinia = By.id("city-Goiânia");
    protected final By guardarDefinies = By.cssSelector("button[title='Guardar definições']");
    protected final By jooPessoa = By.id("city-João Pessoa");
    protected final By macap = By.id("city-Macapá");
    protected final By macei = By.id("city-Maceió");
    protected final By maisInformaes = By.cssSelector("a[href='https://cookiepedia.co.uk/giving-consent-to-cookies']");
    protected final By manaus = By.id("city-Manaus");
    protected final By meAjudaZ = By.cssSelector("a[href='https://zedelivery.freshdesk.com/support/home']");
    protected final By natal = By.id("city-Natal");
    protected final By no = By.id("age-gate-button-no");
    protected final By outros = By.cssSelector("a[title='Outros']");
    protected final By pagamentoNaEntrega = By.cssSelector("a[href='https://zedelivery.freshdesk.com/support/solutions/articles/60000601483-posso-fazer-meu-pagamento-online-no-app-']");
    private final String pageLoadedText = "O Zé Delivery utiliza cookies que são necessários ao funcionamento adequado de suas Páginas e que podem melhorar a sua experiência";
    private final String pageUrl = "/?gclid=CjwKCAiA_Kz-BRAJEiwAhJNY78BBankMpl0lXhpq75OR0UCKZBKlOsbBGumAHb28JAetVK8Yr_mWvBoC0foQAvD_BwE";
    protected final By palmas = By.id("city-Palmas");
    protected final By permitirTodos = By.cssSelector("button[title='Permitir todos']");
    protected final By petiscos = By.cssSelector("a[title='Petiscos']");
    protected final By polticaDePrivacidade = By.cssSelector("#__next footer.css-1jzdpvu-footer div.css-1ae9okz-footerContainer div:nth-of-type(3) div:nth-of-type(1) div.css-1lm18yo-PrivacyTerms a.css-kwcbw2-link");
    protected final By polticaDePrivacidadeDoZDelivery = By.cssSelector("a.banner-policy-link");
    protected final By portoAlegre = By.id("city-Porto Alegre");
    protected final By portoVelho = By.id("city-Porto Velho");
    protected final By queroSerParceiro = By.cssSelector("a[href='/cadastro-parceiro']");
    protected final By recife = By.id("city-Recife");
    protected final By rioBranco = By.id("city-Rio Branco");
    protected final By rioDeJaneiro = By.id("city-Rio de Janeiro");
    protected final By salvador = By.id("city-Salvador");
    protected final By semLcool = By.cssSelector("a[title='Sem álcool']");
    protected final By sim = By.id("age-gate-button-yes");
    protected final By skolLata269ml = By.cssSelector("a[title='Skol Lata 269ml']");
    protected final By soLus = By.id("city-São Luís");
    protected final By soPaulo = By.id("city-São Paulo");
    protected final By termosDeUso = By.cssSelector("#__next footer.css-1jzdpvu-footer div.css-1ae9okz-footerContainer div:nth-of-type(3) div:nth-of-type(1) a.css-kwcbw2-link");
    protected final By trabalheConosco = By.cssSelector("a[href='https://bit.ly/374UOmX']");
    protected final By verMaisCidades = By.cssSelector("#section-cities ul.css-1nwgjtp-citiesContainer li:nth-of-type(27) a");
    protected final By verProdutosDisponveis = By.cssSelector("button.css-1wt3qgq-buttonBase-primaryButton");
    protected final By vinhos = By.cssSelector("a[title='Vinhos']");
    protected final By vitria = By.id("city-Vitória");
    protected final By voltarAoTopo = By.cssSelector("a.css-1ji5vdx-dividerText");
    protected final By aceitarTermos = By.id("age-gate-button-yes");
    By NaoaceitarTermos = By.id("age-gate-button-no");
    
    public static By Vocetem18anosoumais = By.cssSelector("css-h75j03-message");
    By maioridade = By.id("age-gate-button-yes");
	By botaoEntrar = By.id("welcome-button-sign-in");
	By botaoCadastrar = By.id("login-home-link-dont-have-account");
	By entrarComEMail = By.id("signup-home-button-email");
	protected By nomeESobrenome = By.name("signup-email-input-name");
	By eMail = By.name("signup-email-input-email");
	By senhaEmail = By.id("signup-email-input-password");
	By numeroCpf = By.name("signup-email-input-document");
	By telefone = By.id("signup-email-input-phone");
	By idade = By.xpath("//*[@id='signup-email-input-age']");
	By confirmar = By.id("signup-email-button-signUp");
	By sairCadastro = By.id("sidebar-header-close-button");
	By textoCadastro = By.xpath("//*[@id=\"header-user-badge\"]/div/div");
	
	static Random aleatorio = new Random();
	public static int valor = aleatorio.nextInt(100000);

	
  

	
    public static void ValidarMensageaceitarCookies() {
    	String texto = driver.findElement(By.className("button.optanon-allow-all.accept-cookies-button")).getText();
	    assertEquals("Aceitar cookies", texto);
	    
    }
    
    
    
  

    
    
 
    
  
}
