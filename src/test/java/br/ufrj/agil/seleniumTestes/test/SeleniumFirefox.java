package br.ufrj.agil.seleniumTestes.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Selenium utilizando o driver do Firefox.
 * 
 * Faz a abertura simples da tela do browser.
 *
 */
public class SeleniumFirefox  {

	private final Long SLEEP_TIME = 5000L;
	private WebDriver driver = null;

	@Before
	public void setUp() {
		this.driver = new FirefoxDriver();
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
