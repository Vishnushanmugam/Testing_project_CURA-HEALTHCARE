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

WebUI.callTestCase(findTestCase('TS_CURA/CURA_Makeappointment/appointment booking'), [('Hospital') : findTestData('CURA_BookingAppointment/Dropdown_list').getValue(
            1, 1), ('Program') : findTestData('CURA_BookingAppointment/Healthcare_Program').getValue(1, 1), ('Set_Date') : findTestData(
            'CURA_BookingAppointment/Date_Booking').getValue(1, 1), ('Comment') : findTestData('CURA_BookingAppointment/Comment').getValue(
            1, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('cura_healthcare_obj/Cura_History/History/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('cura_healthcare_obj/Cura_History/History/a_History'))

WebUI.verifyElementPresent(findTestObject('cura_healthcare_obj/Cura_History/History/h2_History'), 0)

