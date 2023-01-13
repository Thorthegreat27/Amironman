package org.arc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Iron extends  Geed {
	
	public void bdsm() {
		
		
		System.out.println("fjggffjfdjbb");
		
		
		
	}
	
	
	public void hep() {
		
		
		super.hep();
		System.out.println("love");
		
	}
	
	
	
	public static void main(String[] args) {
	
		
		Iron e = new Iron();
		
		e.bdsm();
		
		
		e.hep();
		
		
		
		
		
	
}}


public static WebDriver driver;  
@Given("browser launch")
public void browser_launch() {
   
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
}

@Given("user enter the {string},{string}")
public void user_enter_the(String username, String password) {
   
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	
	
	
}

@Given("user clicks the login button")
public void user_clicks_the_login_button() {
	driver.findElement(By.id("login")).click();

}

@Given("user should select {string},{string},{string},{string}")
public void user_should_select(String location, String hotel, String roomtype, String numberofrooms) {
	
	
	WebElement loca = driver.findElement(By.id("location"));
	
	Select s = new Select(loca);
	s.selectByValue(location);
	WebElement hotels = driver.findElement(By.id("hotels"));
	Select s1 = new Select(hotels);
   s1.selectByValue(hotel);
   
   WebElement roomty = driver.findElement(By.id("room_type"));
   
   Select s2 = new Select(roomty);
   s2.selectByValue(roomtype);
   
   WebElement noOfRooms = driver.findElement(By.id("room_nos"));
   Select s3= new Select(noOfRooms);
   s3.selectByValue(numberofrooms);
   }

@Given("user should enter check in and checkoutdate {string},{string}")
public void user_should_enter_check_in_and_checkoutdate(String checkin, String checkout) {
    
	WebElement checkingin = driver.findElement(By.id("datepick_in"));
	Select s4= new Select(checkingin);
	   s4.selectByValue(checkin);
	
	
	   WebElement checkingOut = driver.findElement(By.id("datepick_out"));
		Select s5= new Select(checkingOut);
		   s5.selectByValue(checkout);
	   
	
}
@Given("user enter the heads for room {string}>,{string}")
public void user_enter_the_heads_for_room(String  adults, String children) {
   
	WebElement aduroom = driver.findElement(By.id("adult_room"));
	Select s6= new Select(aduroom);
	   s6.selectByValue(adults);
   
	
	   WebElement childroom = driver.findElement(By.id("child_room"));
		Select s7= new Select(childroom);
		   s7.selectByValue(children);
	   		   
}

@Given("user have to click the search Button")
public void user_have_to_click_the_search_button() {
   
	WebElement submit = driver.findElement(By.id("Submit"));
	submit.click();
}

@Given("user have to select the desired hotel")
public void user_have_to_select_the_desired_hotel() {
   
	WebElement click2 = driver.findElement(By.id("radiobutton_0"));
	
	click2.click();
	
}

@Given("user have to select the continue button")
public void user_have_to_select_the_continue_button() {
   WebElement contiue = driver.findElement(By.id("continue"));
   
   contiue.click();
   
   
   
   
}

@Given("user have to enter the personal information {string},{string},{string}")
public void user_have_to_enter_the_personal_information(String firstName, String secondName, String billingAddress) {
   
	 WebElement fname = driver.findElement(By.id("first_name"));
		Select s8= new Select(fname);
		   s8.selectByValue(firstName);
	
	
	

			 WebElement lname = driver.findElement(By.id("last_name"));
				Select s9= new Select(lname);
				   s9.selectByValue(secondName);
			

					 WebElement invoice = driver.findElement(By.id("address"));
						Select s10= new Select(invoice);
						   s10.selectByValue(billingAddress);
					
						 	
	
}

@Given("user have to enter the billing details {string},{string}")
public void user_have_to_enter_the_billing_details(String creditcardNumber, String creditcardType) {
  
	
	WebElement ccno = driver.findElement(By.id("cc_num"));
	Select s11= new Select(ccno);
	   s11.selectByValue(creditcardNumber);

	   WebElement ccType = driver.findElement(By.id("cc_type"));
		Select s12= new Select(ccType);
		   s12.selectByValue(creditcardType);
	
		   
	
	
}

@Given("user have to select the card expiry stats {string}>,{string},{string}")
public void user_have_to_select_the_card_expiry_stats(String expiryMonth, String expiryyear, String cvvNumber) {
	WebElement expirm = driver.findElement(By.id("cc_exp_month"));
	Select s13= new Select(expirm);
	   s13.selectByValue(expiryMonth);

	   WebElement expireYear = driver.findElement(By.id("cc_exp_year"));
		Select s14= new Select(expireYear);
		   s14.selectByValue(expiryyear);
	
		   WebElement cvvNnumber = driver.findElement(By.id("cc_cvv"));
			Select s15= new Select(cvvNnumber);
			   s15.selectByValue(cvvNumber);
		
}

@Given("user have to click the book button")
public void user_have_to_click_the_book_button() {
   driver.findElement(By.id("book_now")).click();
}














}











































































