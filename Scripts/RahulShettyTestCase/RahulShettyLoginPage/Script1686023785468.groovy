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

String homevariable = 'Home'

WebUI.click(findTestObject('RahulShetty_Repo/RahulShetty_Repo/DynamicObjectCreation/a_Shop',[('text'):homevariable]))

WebUI.delay(2)

String shopvariable = 'shop'

WebUI.click(findTestObject('RahulShetty_Repo/RahulShetty_Repo/DynamicObjectCreation/a_Shop',[('text'):shopvariable]))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/a_Checkout ( 1 )            (current)'))

WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/button_Checkout'))

WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/label_I agree with the term  Conditions'))

WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/input_term  Conditions_btn btn-success btn-lg'))

WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/a_ProtoCommerce Home'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/input_Name_name'), 
    name)

WebUI.setText(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/input_Email_email'), 
    email)

WebUI.setText(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/input_Password_exampleInputPassword1'), 
    password)

WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/input_term  Conditions_btn btn-success btn-lg'))

WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/strong_Success'))

//    WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/a_Shop'))
WebUI.delay(2)

@com.kms.katalon.core.annotation.SetUp
def SetupMethod() {
    WebUI.navigateToUrl(GlobalVariable.url)

    try {
        WebUI.setText(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/input_Username_username'), 
            'dharm')

        WebUI.setEncryptedText(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/input_Password_password'), 
            'vChGV51bHgJ2ZUog9CEBVw==')

        WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/input_I Agree to the_signin'))

        WebUI.verifyElementPresent(findTestObject('RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/h1_Shop Name'), 0)
    }
    catch (Exception e) {
        WebUI.setText(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/input_Username_username'), 
            'rahulshettyacademy')

        WebUI.setEncryptedText(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/input_Password_password'), 
            '1PiAXA7e6bXYOnY+D2FYUg==')

        WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_LoginPage Practise  Rahul Shetty Academy/Page_LoginPage Practise  Rahul Shetty Academy/input_I Agree to the_signin'))

        WebUI.delay(2)

        WebUI.verifyElementPresent(findTestObject('RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/h1_Shop Name'), 0)
    } 
}

@com.kms.katalon.core.annotation.TearDown
def TearDownMethod() {
    WebUI.click(findTestObject('Object Repository/RahulShetty_Repo/RahulShetty_Repo/Page_ProtoCommerce/Page_ProtoCommerce/a_Shop'))
}

