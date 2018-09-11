import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Page_My Store/a_Sign in (1)'))

WebUI.setText(findTestObject('Page_Login - My Store/input_Email address_email_crea'), email)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account (1)'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mr._id_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname (1)'), 'First')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname (1)'), 'Name')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd (1)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1 (1)'), '1st street')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Address (Line 2)_address (1)'), '2nd avenue')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city (1)'), 'new vihar')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaAr (1)'), 
    '16', true)

WebUI.setText(findTestObject('Page_Login - My Store/input__postcode'), '78590')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile (1)'), '858588')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__alias (1)'), 'home')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register (1)'))

WebUI.click(findTestObject('Page_My account - My Store/a_Sign out (1)'))

WebUI.closeBrowser()

