package br.ufrj.agil.seleniumTestes.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Selenium utilizando o driver do Safari.
 * É necessário instalar o plugin no Safari (Ver arquivo drivers/SafariDriver.safariextz).
 * 
 * Faz a abertura simples da tela do browser.
 *
 */
public class SeleniumSafari  {

	private final Long SLEEP_TIME = 5000L;
	private WebDriver driver = null;

	@Before
	public void setUp() {
		 this.driver = new SafariDriver();
	}
	
	@Test
	public void abrirTelaBrowser() throws Exception {
		driver.get("http://www.ufrj.br");
		Thread.sleep(SLEEP_TIME);
		
	}

	@After
	public void setDown() {
		this.driver.close();
		this.driver.quit();
	}
}
