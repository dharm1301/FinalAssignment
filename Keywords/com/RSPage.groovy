package com

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable




public class RSPage {
	
//	String userclickcondition = 'Object Repository/RahulShetty_Repo/assertion/Page_LoginPage Practise  Rahul Shetty Academy/div_You will be limited to only fewer functionalities of the app. Proceed'
//	String userCheckmark = 'Object Repository/RahulShetty_Repo/assertion/Page_LoginPage Practise  Rahul Shetty Academy/span_User_checkmark'
//	String ButtonClick = 'Object Repository/RahulShetty_Repo/assertion/Page_LoginPage Practise  Rahul Shetty Academy/button_Okay'
//	String Signup = 'Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/input_I Agree to the_signin'
//	String IncorrectCheck = 'Object Repository/RahulShetty_Repo/assertion/Page_LoginPage Practise  Rahul Shetty Academy/div_Incorrect usernamepassword'
//	String HomePageVerify = 'Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/h1_Shop Name'
	
	
	@Keyword
	void Invalidlogin(username,LoginPassword,object_username,object_password) {

		WebUI.setText(findTestObject(object_username),username)

		WebUI.setText(findTestObject(object_password),LoginPassword)
		
		
//		WebUI.verifyElementClickable(findTestObject(userCheckmark))
//		
//		WebUI.click(findTestObject(userCheckmark))
//
//		WebUI.verifyElementText(findTestObject(userclickcondition),
//			'You will be limited to only fewer functionalities of the app. Proceed?')
//
//		WebUI.click(findTestObject(ButtonClick))
//
//		WebUI.click(findTestObject(Signup))
//
//		WebUI.verifyElementText(findTestObject(IncorrectCheck),' username/password.')
//
//		WebUI.verifyElementPresent(findTestObject(HomePageVerify),0)

		
	}
	@Keyword
	void Validlogin(username,LoginPassword,object_username,object_password) {
		
		WebUI.setText(findTestObject(object_username),username)
		
		WebUI.setText(findTestObject(object_password),LoginPassword)
//						
//		WebUI.click(findTestObject(Signup))
//		
//		WebUI.delay(1)
//
//		WebUI.verifyElementPresent(findTestObject(HomePageVerify),0)
	}
	
	

	@Keyword
	void checkout(Add_Object,Checkout_Object) {
		WebUI.click(findTestObject(Add_Object))

		WebUI.delay(2)

		WebUI.verifyElementVisible(findTestObject(Checkout_Object),
				FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject(Checkout_Object))
	}

	@Keyword
	void formdata(name,email,password,name_object,email_object,password_object) {
		WebUI.setText(findTestObject(name_object),
				name)

		WebUI.setText(findTestObject(email_object),
				email)

		WebUI.setText(findTestObject(password_object),
				password)
	}
	
	@Keyword
	void payment(FinalCheckout,tnc,purchase) {
		WebUI.click(findTestObject(FinalCheckout))
		
		WebUI.click(findTestObject(tnc))
		
		WebUI.verifyElementClickable(findTestObject(purchase))
		
		WebUI.click(findTestObject(purchase))
	}
}

