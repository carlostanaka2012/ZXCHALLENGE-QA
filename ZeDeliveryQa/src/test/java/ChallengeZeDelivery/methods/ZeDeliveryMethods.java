package ChallengeZeDelivery.methods;



import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;


import ChallengeZeDelivery.pages.ZeDeliveryPage;
import ChallengeZeDelivery.obj.ZeDeliveryObj;




public class ZeDeliveryMethods extends ZeDeliveryPage {
	
	public static By nomeESobrenome = By.name("signup-email-input-name");
	public static By eMail = By.name("signup-email-input-email");
	public static By senhaEmail = By.id("signup-email-input-password");
	public static By numeroCpf = By.name("signup-email-input-document");
	public static By telefone = By.id("signup-email-input-phone");
	public static By idade = By.xpath("//*[@id='signup-email-input-age']");
	public static By nao = By.className("age-gate-dialog__answer-button");
	 
	private static WebDriver driver;
	private static ExtentTest extenTest;
	private static ExtentHtmlReporter htmlReporter;
	


	
	@Before
	public void setUp() {
		
		driver = new ChromeDriver();
		//if(extentReport ==null) {
			//extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/recources/htmlReporter.html");
			//extentReport.attachReporter(htmlReporter);
			
			
		}
		
		
		//ZeDeliveryObj.takeScreenshot();
		
	
	
	@After
    public void encerra() {
        driver.quit();
    }
	
	
	public static void acessarPagina() {
		
		driver.get("http://ze.delivery");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	
	}
	
	public static void mensagemMaioridade() {
	
		String texto = driver.findElement(By.className("css-h75j03-message")).getText();
		//driver.findElement(By.linkText("Você tem 18 anos ou mais?"));
	    assertEquals("Você tem 18 anos ou mais?", texto);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	public static void selecionarAvisoNao() {
    	
		driver.findElement(By.id("age-gate-button-no")).click();

    	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    	
    
    	
    }
	
	public static void selecionarAvisoNaoambev() {
		
		
		driver.findElement(By.id("age-gate-dialog__answer-button")).click();
		

    	
    			
    			
    	
    }
	
	public static void validarmensagemConsumoresposanvel() {
    	
		String texto = driver.findElement(By.className("main-section__title main-section__title--2")).getText();
	    assertEquals("Consumo responsável", texto);
	    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	   
    }
	public static void selecionarSimMaior() {
		
		driver.findElement(By.xpath("//*[@id=\"age-gate-button-yes\"]")).click();
	    
		
	}
	
	public static void validarTelaHome() {
		
		String texto = driver.findElement(By.className("css-103pmcf-title")).getText();
	    assertEquals("Bebidas geladas a preço de mercado na sua casa agora", texto);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	
	}
	public static void validarEntrar() {
		
		
		driver.findElement(By.id("welcome-button-sign-in")).click();
	   
		
	
	}
	public static void criarConta() {
		driver.findElement(By.id("create-account-link")).click();
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	
	public static void informardadoscadastro() {
		
		driver.findElement(By.id("signup-form-input-name")).sendKeys("GUSTAVO Bispo");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("signup-form-input-email")).sendKeys("qa31@gmail.com");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("signup-form-input-password")).sendKeys("7W8m6h78555");
	
		
		driver.findElement(By.id("signup-form-input-document")).sendKeys("43910373437");

		
		driver.findElement(By.id("signup-form-input-phone")).sendKeys("113926963399");

		
		driver.findElement(By.id("signup-form-input-age")).sendKeys("23");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		

		driver.findElement(By.id("sign-up-form-input-terms")).click();

	    
	    driver.findElement(By.id("sign-up-form-input-marketing")).click();
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
	    
	    driver.findElement(By.id("signup-form-button-signup")).click();
	    
	    
	   // driver.findElement(By.id("//*[@id=\"confirm-phone-link-validate-later\"]")).click();
	    
	    //driver.findElement(By.className("confirm-phone-link-validate-later")).click();
	    
	    //driver.findElement(By.linkText("validar mais tarde")).click();
	    
	    driver.findElement(By.className("css-1p5ii6y-text-link")).click();
	    
	    
	    
	    
	    
	    
	    
	    //JavascriptExecutor js = ((JavascriptExecutor) driver);
	    //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	    //driver.findElement(By.cssSelector("css-wob29k-buttonBase-primaryButton-button']")).click();
	    
	
	    
	 
	
	}
	public static void clicarContinuar() {
		
		//String texto4 = driver.findElement(By.className("css-wob29k-buttonBase-primaryButton-button")).getText();
	   // assertEquals("ENTRAR NA CONTA COM E-MAIL", texto4);
	    
	    driver.findElement(By.id("signup-form-button-signup")).click();
	    
	    //driver.findElement(By.className("css-wob29k-buttonBase-primaryButton-button")).click();
		
		//String texto = driver.findElement(By.className("css-wob29k-buttonBase-primaryButton-button")).getText();
	    //assertEquals("CONTINUAR", texto);
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		
		//driver.findElement(By.className("//*[@=\"signup-form-button-signup\"]")).click(); 
		//driver.findElement(By.className("css-wob29k-buttonBase-primaryButton-button")).click();
		
	    //driver.findElement(By.id("signup-form-button-signup")).click();
	   

	    
	    
	 }
	public static void clicaremValidarMaisTarde() {
		
		String texto = driver.findElement(By.className("css-1qn9swo-title")).getText();
	    assertEquals("CONFIRMAR CELULAR", texto);
	    
	    driver.findElement(By.id("confirm-phone-link-validate-later")).click();
	    
	    String texto1 = driver.findElement(By.className("css-7kgpm6-textBase-UserProfileCard")).getText();
	    assertEquals("Olá,", texto1);
	    	
	}
	public static void informarLogin() {
		
		String texto3 = driver.findElement(By.className("css-phjb01-text-subTitle-MailPasswordLoginForm")).getText();
	    assertEquals("ENTRAR NA CONTA COM E-MAIL", texto3);
	    
	    driver.findElement(By.id("login-mail-input-email")).sendKeys("karis64815@hmnmw.com");
	    
	    driver.findElement(By.id("login-mail-input-password")).sendKeys("TESTE2020");
	    
	    driver.findElement(By.id("login-mail-button-sign-in")).click();
	    
	}
	public static void validarLoginHome() {
		
		
		String texto5 = driver.findElement(By.cssSelector("css-zj9thr-howItWorksTitle")).getText();
	    assertEquals("Como funciona o Zé Delivery?", texto5);
		
		
		
	

	
		
		
	}


	
	}
	
	    
	    
	 
		
	

	
