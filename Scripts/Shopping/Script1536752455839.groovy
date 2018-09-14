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

WebUI.setText(findTestObject('Page_My Store/input_Call us now_search_query'), 'blouse')

WebUI.click(findTestObject('Page_My Store/button_Search'))

WebUI.verifyElementVisible(findTestObject('Page_Blouse - My Store/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Search - My Store/span_Add to cart'))

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=order')

WebUI.click(findTestObject('Page_Order - My Store/span_Proceed to checkout (1)'))

WebUI.setText(findTestObject('Page_Login - My Store/input_Email address_email (2)'), 'atctcoe@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login - My Store/input_Password_passwd (2)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Login - My Store/span_Sign in (2)'))

WebUI.setText(findTestObject('Page_Order - My Store/textarea_If you would like to (1)'), 'This is a gift')

WebUI.click(findTestObject('Page_Order - My Store/span_Proceed to checkout (1)'))

WebUI.click(findTestObject('Page_Order - My Store/input_2.00_cgv (1)'))

WebUI.click(findTestObject('Page_Order - My Store/span_Proceed to checkout_1 (1)'))

WebUI.click(findTestObject('Page_Order - My Store/a_Pay by bank wire (order proc (1)'))

WebUI.click(findTestObject('Page_My Store/span_I confirm my order (1)'))

WebUI.click(findTestObject('Page_Order confirmation - My Store/a_Sign out (1)'))

WebUI.closeBrowser()

