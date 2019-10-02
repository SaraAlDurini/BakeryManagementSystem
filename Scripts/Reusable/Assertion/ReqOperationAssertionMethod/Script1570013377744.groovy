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

String Query

String ExpectedResult
File file


// Save the Req code in Cash
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem\\Cash\\ReqCode.txt')


// Write your Get query in Query =
// Example of Select Query
Query = ((('SELECT REQ_OPERATION FROM REQUESTS WHERE REQ_CODE = ' + '\'') + 'ReqCode') + '\'')


// 
ExpectedResult = 'UPD'


// Call the cnnection (UserName , Password , Query , The Expected Result to copare it with actual query result  )
CustomKeywords.'dataBaseConnection.ExecuteOracleQueryWithExpectedResult.conectsql'('SupplyCard', 'smart999', Query, ExpectedResult)

