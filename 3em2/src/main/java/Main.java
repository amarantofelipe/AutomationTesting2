import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/felicemarano/eclipse-workspace/chromedriver.exe");
		
		WebDriver drive = new SafariDriver();
		
		drive.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		System.out.println("Collegamento al sito...");
		
		Thread.sleep(2000);
		
		drive.manage().window().maximize();
		System.out.println("Finistra al massimo...");
		Thread.sleep(1500);
		
		//CUSTOMER LOGIN
		drive.findElement(By.xpath("//div[2]/div/div/div/button")).click();
		System.out.println("Fatto l'accesso");
		Thread.sleep(3000);
		
		//USER SELECT MENU
		Select menuS = new Select(drive.findElement(By.xpath("//*[@id=\"userSelect\"]")));
		
		//CHOSE USER
		menuS.selectByVisibleText("Harry Potter");
		System.out.println("Scelta dell'utente ");
		
		
		//USER SELECTED
		WebElement menu = drive.findElement(By.xpath("//*[@id=\"userSelect\"]"));
		menu.click();
		System.out.println("Utente selezionato");
		Thread.sleep(3000);
		
		//LOGIN
		drive.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
		Thread.sleep(3000);
		System.out.println("Login effettuato");
		
		//DEPOSIT
		drive.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
		System.out.println("Click su deposito");
		Thread.sleep(3000);
		
		//INSERT NUMBER
		drive.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("1928");
		System.out.println("Inserimento soldi");
		Thread.sleep(3000);
		
		//DEPOSIT BUTTON
		drive.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		System.out.println("click deposit");
		Thread.sleep(3000);
		
		//CLICK WITHDROW
		drive.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]")).click();
		System.out.println("Click withdraw");
		Thread.sleep(3000);
		
		//SEND WITHDRAW
		drive.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("920");
		System.out.println("Inserimento soldi prelievo");
		Thread.sleep(3000);
		
		//BUTTON WITHDRAW
		drive.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		System.out.println("Click buttone prelievo");
		Thread.sleep(3000);
		
		//TRANSITION
		drive.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]")).click();
		System.out.println("Visualizzazione soldi");
		Thread.sleep(3000);
		
		drive.close();
		System.out.println("Chiusura browser");
	}

}
