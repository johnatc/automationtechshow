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

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in (5)'))

WebUI.setText(findTestObject('Page_Login - My Store/input_Email address_email (3)'), 'atctcoe@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login - My Store/input_Password_passwd (3)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Login - My Store/span_Sign in (3)'))

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/a_Cart0ProductProducts(empty)'))

WebUI.setText(findTestObject('Object Repository/Page_Order - My Store/input_Call us now_search_query'), 'shirt')

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/button_Search'))

WebUI.click(findTestObject('Page_Search - My Store/img_16.51_replace-2x img-respo (1)'))

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/i_Quantity_icon-plus'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Blouse - My Store/select_SML (1)'), '2', true)

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/a_Color_White (1)'))

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/span_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/p_I agree to the terms of serv'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/input_2.00_cgv'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Proceed to checkout_1'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/a_Pay by bank wire (order proc'))

WebUI.click(findTestObject('Object Repository/Page_My Store/span_I confirm my order'))

WebUI.click(findTestObject('Object Repository/Page_Order confirmation - My Store/a_Back to orders'))

WebUI.click(findTestObject('Object Repository/Page_Order history - My Store/a_Sign out'))

WebUI.closeBrowser()

