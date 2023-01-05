package teste.senai.eplayers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteEplayers {
	
	private WebDriver driver;
	
	@Before
	public void ConfigurarTeste () {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void TesteNavegabilidade () {
		
		try {
		driver.get("http://localhost:4200/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("gabi@hotmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("senha")).sendKeys("Senhagabi");
		Thread.sleep(3000);
		driver.findElement(By.id("botao-enviar")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		}  catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	
	
	@After
	
	public void Fim () {
		driver.quit();
	}
	

}
