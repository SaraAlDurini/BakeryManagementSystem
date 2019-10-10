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
File file
String ExpectedResult_BAKERY_CODE
String ExpectedResult

// Read BAKERY_CODE from Cash to execute the Query by this spesific code  
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\BakeryHaveBankAccount.txt')
ExpectedResult_BAKERY_CODE = file.readLines()
println(ExpectedResult_BAKERY_CODE)

// ** Read BANK_ACC_NUMBER Cash to execute the Query by this spesific code
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\AccNumber.txt')
ExpectedResult = file.readLines()
ExpectedResult = ExpectedResult.replaceAll("[^\\d]", "" )

// Get and assert on BANK_ACC_NUMBER
Query = ((('Select BANK_ACC_NUMBER from bakery_ach_data where BAKERY_CODE = ' + '\'') + ExpectedResult_BAKERY_CODE.replaceAll("[^\\d]", "" )) + '\'')

// Assert on AccNumber
CustomKeywords.'dataBaseConnection.ExecuteOracleQueryWithExpectedResult.conectsql'('bdistribute', '12345678', Query, ExpectedResult)

//  ** Read BAKERY_NAME Cash to execute the Query by this spesific code
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\AccName.txt')
ExpectedResult = file.readLines()
ExpectedResult = ExpectedResult.replaceAll("[^\\d]", "" )

// Get and assert on BAKERY_NAME
Query = ((('Select BANK_ACC_NAME from bakery_ach_data where BAKERY_CODE = ' + '\'') + ExpectedResult_BAKERY_CODE) + '\'')

// Call the cnnection (UserName , Password , Query , The Expected Result to compare it with actual query result  )
CustomKeywords.'dataBaseConnection.ExecuteOracleQueryWithExpectedResult.conectsql'('bdistribute', '12345678', Query, ExpectedResult)

// ** Get and assert on REMITTANCE_INFO
Query = ((('Select REMITTANCE_INFO from bakery_ach_data where BAKERY_CODE = ' + '\'') + 'REMITTANCE_INFO') + '\'')

// Call the cnnection (UserName , Password , Query , The Expected Result to compare it with actual query result  )
CustomKeywords.'dataBaseConnection.ExecuteOracleQueryWithExpectedResult.conectsql'('bdistribute', '12345678', Query, 'ملاحظات')

