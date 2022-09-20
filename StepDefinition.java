package com.stepdefinition;

import org.openqa.selenium.By;

import com.Maven_8am.BaseClass;
import com.Maven_8am.Page_Object_Manager;
import com.properties.File_Reader_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Must Launch Url page$")
	public void user_Must_Launch_Url_page() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getinstanceCR().getUrl();
		launchUrl(url);
	    	    
	}
	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {
	   
		passinput(pom.getinstancelogin().getUsername(),username);   
	    
	}
	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
	   passinput(pom.getinstancelogin().getPassword(),password);  
	    
	}

	@Then("^user Login The Click Button And It Navigate To Search Hotel Page$")
	public void user_Login_The_Click_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		clickonElement(pom.getinstancelogin().getLoginBtn()); 
	    
	}

	@When("^user Select Location Of Hotel In Hotel Field$")
	public void user_Select_Location_Of_Hotel_In_Hotel_Field() throws Throwable {
		 String location = File_Reader_Manager.getInstanceFRM().getinstanceCR().getlocation();
	        selectByvalue(driver.findElement(By.name("location")),"London");   
	    
	}

	@When("^user Select Available Hotel In The Location Field$")
	public void user_Select_Available_Hotel_In_The_Location_Field() throws Throwable {
		 String hotels = File_Reader_Manager.getInstanceFRM().getinstanceCR().getHotels(); 
	        selectByVisibleTest(driver.findElement(By.name("hotels")),"Hotel Creek");
	          
	    
	}

	@When("^user Select Type Of Room In The Hotel Field$")
	public void user_Select_Type_Of_Room_In_The_Hotel_Field() throws Throwable {
		 String roomtype = File_Reader_Manager.getInstanceFRM().getinstanceCR().getRoomtype();
	        selectByvalue(driver.findElement(By.name("room_type")),"Deluxe");
	    
	}

	@When("^user Select No Of Rooms In The Numbers Of Rooms Field$")
	public void user_Select_No_Of_Rooms_In_The_Numbers_Of_Rooms_Field() throws Throwable {
		 String roomnos = File_Reader_Manager.getInstanceFRM().getinstanceCR().getRoomnos();
	        selectByvalue(driver.findElement(By.name("room_nos")),"1"); 
	    
	}

	@When("^user Select Date Of Pick In Date of pickField$")
	public void user_Select_Date_Of_Pick_In_Date_of_pickField() throws Throwable {
		 String datein = File_Reader_Manager.getInstanceFRM().getinstanceCR().getDatein();
	        passinput(driver.findElement(By.id("datepick_in")),"21/08/2022"); 
	    
	}

	@When("^user Select Date Of Pick Out In Date Of Pick Out Field$")
	public void user_Select_Date_Of_Pick_Out_In_Date_Of_Pick_Out_Field() throws Throwable {
		String dateout = File_Reader_Manager.getInstanceFRM().getinstanceCR().getDateout();
        passinput(driver.findElement(By.id("datepick_out")),"22/08/2022");  
	    
	}

	@When("^user Select No Of Adult Room In Adult Room Field$")
	public void user_Select_No_Of_Adult_Room_In_Adult_Room_Field() throws Throwable {
		 String adultroom = File_Reader_Manager.getInstanceFRM().getinstanceCR().getAdultroom();
	        passinput(driver.findElement(By.id("adult_room")),"1");    
	    
	}

	@When("^user Select No OF Child Room In Child Room Field$")
	public void user_Select_No_OF_Child_Room_In_Child_Room_Field() throws Throwable {
		String childroom = File_Reader_Manager.getInstanceFRM().getinstanceCR().getChildroom();
        selectByvalue(driver.findElement(By.name("child_room")),"0");
	    
	}

	@Then("^user Login The Click Button For Submission Hotel Details$")
	public void user_Login_The_Click_Button_For_Submission_Hotel_Details() throws Throwable {
	    
		clickonElement(driver.findElement(By.id("Submit")));
	}

	@Given("^user Click the RadioButton To Navigate To Search Hotel Page Details$")
	public void user_Click_the_RadioButton_To_Navigate_To_Search_Hotel_Page_Details() throws Throwable {
		 clickonElement(driver.findElement(By.id("radiobutton_0")));
	    
	}

	@Then("^user Login Continue Buttun To Navigate To Continue Hotel Page Details$")
	public void user_Login_Continue_Buttun_To_Navigate_To_Continue_Hotel_Page_Details() throws Throwable {
		clickonElement(driver.findElement(By.name("continue")));
	    
	}

	@When("^user Select The First Name In Name Field$")
	public void user_Select_The_First_Name_In_Name_Field() throws Throwable {
		String firstname = File_Reader_Manager.getInstanceFRM().getinstanceCR().getFirstname();
        passinput(driver.findElement(By.id("first_name")),"jebitto");  
	    
	}

	@When("^user Select The Last Name in Name Field$")
	public void user_Select_The_Last_Name_in_Name_Field() throws Throwable {
		 String lastname = File_Reader_Manager.getInstanceFRM().getinstanceCR().getLastname();
	        passinput(driver.findElement(By.id("last_name")),"benny"); 
	    
	}

	@When("^user Select The Address In The Address Field$")
	public void user_Select_The_Address_In_The_Address_Field() throws Throwable {
		 String address = File_Reader_Manager.getInstanceFRM().getinstanceCR().getAddress();
	        passinput(driver.findElement(By.id("address")),"calicut,kerala"); 
	    
	}

	@When("^user Select The Card No In The Card Field$")
	public void user_Select_The_Card_No_In_The_Card_Field() throws Throwable {
		String getccnum = File_Reader_Manager.getInstanceFRM().getinstanceCR().getccnum();
        passinput(driver.findElement(By.id("cc_num")),"9567757929123456");
	    
	}

	@When("^user Select The Card Type In The Card Field$")
	public void user_Select_The_Card_Type_In_The_Card_Field() throws Throwable {
		 String getcctype = File_Reader_Manager.getInstanceFRM().getinstanceCR().getcctype();
	        passinput(driver.findElement(By.id("cc_type")),"VISA"); 
	    
	}

	@When("^user Select The Card EXpiry Month In The Expiry Field$")
	public void user_Select_The_Card_EXpiry_Month_In_The_Expiry_Field() throws Throwable {
		String getccexpmonth = File_Reader_Manager.getInstanceFRM().getinstanceCR().getccexpmonth();
        passinput(driver.findElement(By.id("cc_exp_month")),"December");
	    
	}

	@When("^User Select The Card Expiry Year In The Expiry Field$")
	public void user_Select_The_Card_Expiry_Year_In_The_Expiry_Field() throws Throwable {
		 String getccexpyear = File_Reader_Manager.getInstanceFRM().getinstanceCR().getccexpyear();
	        passinput(driver.findElement(By.id("cc_exp_year")),"2022");
	    
	}

	@When("^user Select The Card CVV In The In The Cvv Field$")
	public void user_Select_The_Card_CVV_In_The_In_The_Cvv_Field() throws Throwable {
		 String getcccvv = File_Reader_Manager.getInstanceFRM().getinstanceCR().getcccvv();
	        passinput(driver.findElement(By.id("cc_cvv")),"234");  
	    
	}

	@Then("^user Click Login Button To Logout Page$")
	public void user_Click_Login_Button_To_Logout_Page() throws Throwable {
		clickonElement(driver.findElement(By.name("book_now")));
	    
	}

	@Then("^user Click Logout In The Logout Field$")
	public void user_Click_Logout_In_The_Logout_Field() throws Throwable {
	    
	    
	}



}
