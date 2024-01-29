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

WebUI.callTestCase(findTestCase('CURA_Login/cura_login'), [('link') : 'https://katalon-demo-cura.herokuapp.com/', ('Name') : findTestData(
            'CURA_login_data/login_data').getValue(1, 1), ('Password') : findTestData('CURA_login_data/login_data').getValue(
            2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('cura_healthcare/Cura_booking_appointment/Booking appointment/Dropdown list'), 
    Hospital, false)

WebUI.check(findTestObject('cura_healthcare/Cura_booking_appointment/Booking appointment/Readmission'))

WebUI.check(findTestObject('cura_healthcare/Cura_booking_appointment/Booking appointment/input_Medicaid_programs'))

WebUI.setText(findTestObject('cura_healthcare/Cura_booking_appointment/Booking appointment/input_Visit Date (Required)_visit_date'), 
    Set_Date)

WebUI.setText(findTestObject('cura_healthcare/Cura_booking_appointment/Booking appointment/textarea_Comment_comment'), Comment)

WebUI.click(findTestObject('cura_healthcare/Cura_booking_appointment/Booking appointment/button_Book Appointment'))

