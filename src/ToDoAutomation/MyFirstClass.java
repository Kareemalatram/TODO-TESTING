package ToDoAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstClass extends MyData{
  
	
	WebDriver driver = new ChromeDriver();
	
	String MyWebSite = "https://todo.qacart.com/";
	
	String MySignUpURL = "https://todo.qacart.com/signup";
	
	
	@BeforeTest()
	
	public void mySetUp() {
		
		driver.get(MyWebSite);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test(priority = 1 , enabled = true)
	
	public void MySignUpRegister() {
		
		driver.get(MySignUpURL);
		
		WebElement FirstName = driver.findElement(By.cssSelector("[data-testid = 'first-name']"));
		WebElement LastName = driver.findElement(By.cssSelector("[data-testid = 'last-name']"));
		WebElement Email = driver.findElement(By.cssSelector("[data-testid = 'email']"));
		WebElement password = driver.findElement(By.cssSelector("[data-testid = 'password']"));
		WebElement passwordConfirm = driver.findElement(By.cssSelector("[data-testid = 'confirm-password']"));
		WebElement SignupBtn = 	driver.findElement(By.cssSelector("[data-testid = 'submit']"));
		
		
		FirstName.sendKeys(TheFirstName);
		LastName.sendKeys(TheLastName);
		Email.sendKeys(TheEmail);
		password.sendKeys(ThePassword);
		passwordConfirm.sendKeys(ThePassword);
		SignupBtn.click();	

	}
	

	@Test(priority = 2 , enabled = true)
	
	public void LogoutTest() throws InterruptedException {

		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".MuiButton-label")).click();

}
	
	
	@Test(priority = 3 , enabled = true)
	
	public void LoginPage() throws InterruptedException {
		
		WebElement Email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement LoginBtn = driver.findElement(By.id("submit"));
		
		Email.sendKeys(TheEmail);
		password.sendKeys(ThePassword);
		
		Thread.sleep(2000);
		LoginBtn.click();
		
		WebElement AddTodo = driver.findElement(By.cssSelector("[data-testid = 'add']"));
		
		AddTodo.click();
			
	}
	
	@Test(priority = 4 , enabled = true)
	
	public void AddANewToDo() throws InterruptedException {
		
		Thread.sleep(2000);
			
		WebElement todoItem = driver.findElement(By.cssSelector("input[type='text']"));
		WebElement createTodoBtn = driver.findElement(By.cssSelector("[data-testid = 'submit-newTask']"));
		

		todoItem.sendKeys(TheToDo);
		createTodoBtn.click();
	}
	
	
	
	@Test(priority = 5 , enabled = true)
	
	public void CheckorDelete() throws InterruptedException {
		
		driver.findElement(By.name("checked")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[data-testid=\"delete\"]")).click();
		
	}
	
	
	

}
