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

WebUI.click(findTestObject('Object Repository/Page_Welcome Mercury Tours/td_SIGN-ON'))

WebUI.click(findTestObject('Object Repository/Page_Welcome Mercury Tours/a_SIGN-ON'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-on Mercury Tours/input_User               Name_'), 'joeone')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-on Mercury Tours/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Sign-on Mercury Tours/input_Password_login'))

WebUI.click(findTestObject('Page_Find a Flight Mercury Tours/input_Round TripOne Way_tripTy (1)'))

WebUI.selectOptionByValue(findTestObject('Page_Find a Flight Mercury Tours/select_1                 2 (1)'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Find a Flight Mercury Tours/select_AcapulcoFrankfurtLondon (1)'), 'Frankfurt', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Find a Flight Mercury Tours/select_JanuaryFebruaryMarchApr (1)'), '10', true)

WebUI.selectOptionByValue(findTestObject('Page_Find a Flight Mercury Tours/select_12345678910111213141516 (1)'), '20', true)

WebUI.selectOptionByValue(findTestObject('Page_Find a Flight Mercury Tours/select_AcapulcoFrankfurtLondon_1 (1)'), 'New York', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Find a Flight Mercury Tours/select_JanuaryFebruaryMarchApr_1 (1)'), '11', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Find a Flight Mercury Tours/select_12345678910111213141516_1 (1)'), '20', 
    true)

WebUI.click(findTestObject('Page_Find a Flight Mercury Tours/td_JanuaryFebruaryMarchAprilMa'))

WebUI.click(findTestObject('Page_Find a Flight Mercury Tours/input_Economy class Business c (1)'))

WebUI.selectOptionByValue(findTestObject('Page_Find a Flight Mercury Tours/select_No Preference (1)'), 'Blue Skies Airlines', 
    true)

WebUI.click(findTestObject('Page_Find a Flight Mercury Tours/input_Airline_findFlights (1)'))

WebUI.click(findTestObject('Object Repository/Page_Select a Flight Mercury Tours/td_Price               270_fra'))

WebUI.click(findTestObject('Object Repository/Page_Select a Flight Mercury Tours/input_Price               270_'))

WebUI.click(findTestObject('Object Repository/Page_Select a Flight Mercury Tours/input_Price               270__1'))

WebUI.click(findTestObject('Object Repository/Page_Select a Flight Mercury Tours/input_Price               303_'))

WebUI.click(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/td_First Name'))

WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Meal_passFirst0'), 'Joe')

WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Meal_passLast0'), 'one')

WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Meal_passFirst1'), 'Joe')

WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Meal_passLast1'), 'two')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/select_No preference'), 'BLML', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/select_No preference          _1'), 
    'DBML', true)

WebUI.click(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/div_HomeFlightsHotelsCar Renta'))

WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Expiration_creditnumber'), '123456789')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/select_American Express'), 
    'IK', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/select_None'), '02', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/select_None                   _1'), 
    '2000', true)

WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Last_cc_frst_name'), 'Joe')

WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Last_cc_last_name'), 'One')

WebUI.click(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Delivery Address_ticketL'))

WebUI.click(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Billing Address_ticketLe'))

WebUI.click(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Country_buyFlights'))

WebUI.click(findTestObject('Object Repository/Page_Flight Confirmation Mercury To/img'))

WebUI.closeBrowser()

