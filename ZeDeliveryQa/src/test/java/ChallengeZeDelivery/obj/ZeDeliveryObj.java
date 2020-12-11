package ChallengeZeDelivery.obj;

import static ChallengeZeDelivery.config.ZeDeliveryWebConfig.getDriver;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZeDeliveryObj {
	
	//Metodo para clicar
    public void clicar (By elementBy) {
        getDriver().findElement(elementBy).click();
    }
    
    //Metodo para clicar por texto
    public void clicarPorTexto(String texto) {
    	clicar(By.xpath("//*[@text=' + texto + ']"));
	}
 
    //Metodo para escrever
    public static void escrever (By elementBy, String text) {
        getDriver().findElement(elementBy).sendKeys(text);
    }
 
    //Metodo para ler texto
    public String readText (By elementBy) {
        return getDriver().findElement(elementBy).getText().toString();
    }
 
    //Metodo de comparacao de texto
    public void validarTexto (By elementBy, String expectedText) {
        Assert.assertEquals(readText(elementBy), expectedText);
    }
    @FindBy(id = "fake-address-search-input")
	public static WebElement bebidasGeladasAPreoDeMercado;
    
    
}
	
	
	 


