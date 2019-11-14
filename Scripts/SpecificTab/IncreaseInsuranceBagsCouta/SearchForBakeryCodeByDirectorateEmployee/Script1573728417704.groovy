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

File file

String BackeryCode

// Get the Backary code from cash file
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\GetBackeryCode.txt')

BackeryCode = file.readLines()

BackeryCode = BackeryCode.replaceAll('[^\\d]', '')

println(BackeryCode)

// set the Backary code in searsh field
WebUI.setText(findTestObject('CreateIncreaseInsuranceCouta/Page_/input_ _formj_idt34'), BackeryCode)

// Click on إستعلام
WebUI.click(findTestObject('Object Repository/CreateMdifyBankAcc/Page_/span_ (1)'))
