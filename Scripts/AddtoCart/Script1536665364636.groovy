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

WebUI.click(findTestObject('Page_My Store/a_Sign in (4)'))

WebUI.setText(findTestObject('Page_Login - My Store/input_Email address_email (2)'), 'atctcoe@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login - My Store/input_Password_passwd (2)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Login - My Store/span_Sign in (2)'))

WebUI.setText(findTestObject('Page_My account - My Store/input_Call us now_search_query (1)'), 'shirt')

WebUI.click(findTestObject('Page_My account - My Store/button_Search (1)'))

WebUI.click(findTestObject('Object Repository/Page_Search - My Store/img_16.51_replace-2x img-respo'))

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/span'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Blouse - My Store/select_SML'), '2', true)

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/a_Color_White'))

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/span_Check out_cross'))

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/a_Sign out'))

WebUI.closeBrowser()

