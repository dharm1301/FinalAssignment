import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

"""
What is this test script refers to ?
-> here i have first signup the form using wrong credentials and then signup using right credentials with asserting that values , then after adding on product to cart
and redirecting to the checkout then after i fill the form which was in the home page by using DDT , moreever i have also use Dynamic objects , dynamic keywords ,
Global variable ,test listeners and run that test script in chrome and mozilla combinely using test suite collection 

"""

String homevariable = 'Home'

WebUI.click(findTestObject('RahulShetty_Repo/RahulShetty_Repo/DynamicObjectCreation/a_Shop', [('text') : homevariable]))

WebUI.delay(1)

String shopvariable = 'shop'

WebUI.verifyElementClickable(findTestObject('RahulShetty_Repo/RahulShetty_Repo/DynamicObjectCreation/a_Shop', [('text') : shopvariable]))

WebUI.click(findTestObject('RahulShetty_Repo/RahulShetty_Repo/DynamicObjectCreation/a_Shop', [('text') : shopvariable]))

CustomKeywords.'com.RSPage.checkout'(Add_Object, Checkout_Object)

WebUI.verifyElementText(findTestObject('RahulShetty_Repo/assertion/Page_ProtoCommerce/a_iphone X'), 'iphone X')

CustomKeywords.'com.RSPage.payment'(FinalCheckout,tnc,purchase)

WebUI.verifyElementVisible(findTestObject('RahulShetty_Repo/assertion/Page_ProtoCommerce/div_Success Thank you Your order will be delivered in next few weeks -)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/a_ProtoCommerce Home'))

CustomKeywords.'com.RSPage.formdata'(name,email,password,name_object,email_object,password_object)

WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/input_term  Conditions_btn btn-success btn-lg'))

WebUI.verifyElementVisible(findTestObject('RahulShetty_Repo/assertion/Page_ProtoCommerce/div_Success The Form has been submitted successfully'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/strong_Success'))

WebUI.delay(2)

@com.kms.katalon.core.annotation.SetUp
def SetupMethod() {
    WebUI.navigateToUrl(GlobalVariable.url)

    WebUI.getUrl().equals('https://rahulshettyacademy.com/loginpagePractise/')

    try {
		
		CustomKeywords.'com.RSPage.Invalidlogin'(Invalidusername,LoginPassword,object_username,object_password)
		
        WebUI.verifyElementClickable(findTestObject('RahulShetty_Repo/assertion/Page_LoginPage Practise  Rahul Shetty Academy/span_User_checkmark'))

        WebUI.click(findTestObject('RahulShetty_Repo/assertion/Page_LoginPage Practise  Rahul Shetty Academy/span_User_checkmark'))

        WebUI.verifyElementText(findTestObject('RahulShetty_Repo/assertion/Page_LoginPage Practise  Rahul Shetty Academy/div_You will be limited to only fewer functionalities of the app. Proceed'), 
            'You will be limited to only fewer functionalities of the app. Proceed?')

        WebUI.click(findTestObject('RahulShetty_Repo/assertion/Page_LoginPage Practise  Rahul Shetty Academy/button_Okay'))

        WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/input_I Agree to the_signin'))

        WebUI.verifyElementText(findTestObject('RahulShetty_Repo/assertion/Page_LoginPage Practise  Rahul Shetty Academy/div_Incorrect usernamepassword'), 
            ' username/password.')

        WebUI.verifyElementPresent(findTestObject('RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/h1_Shop Name'), 
            0)
    }
    catch (Exception e) {
		
		CustomKeywords.'com.RSPage.Validlogin'(Validusername,LoginPassword,object_username,object_password)
      
        WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/input_I Agree to the_signin'))

        WebUI.delay(2)

        WebUI.verifyElementPresent(findTestObject('RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/h1_Shop Name'), 
            0)
    } 
}

@com.kms.katalon.core.annotation.TearDown
def TearDownMethod() {
    WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/a_Shop'))
}

