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

WebUI.navigateToUrl('http://newtours.demoaut.com/')

WebUI.click(findTestObject('Object Repository/Page_Welcome Mercury Tours/a_REGISTER'))

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_First               Name'), 'Joe')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_Last               Name_'), 'One')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_Phone_phone'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_Email_userName'), 'atctcoe@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_Address_address1'), '123 Avenue B')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_City_city'), 'Central')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_StateProvince_state'), 'Yu')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_Postal               Cod'), '125693')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_User               Name_'), 'joeone')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register Mercury Tours/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register Mercury Tours/input_Confirm               Pa'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Register Mercury Tours/input_Confirm               Pa_1'))

WebUI.closeBrowser()

