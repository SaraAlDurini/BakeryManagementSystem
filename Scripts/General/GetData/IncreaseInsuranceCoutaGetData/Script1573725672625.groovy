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

// Query to get backery code not stopped , not have request under review in Governorate_code=03
Query = ((((('Select * from base_bakery b inner join bakery_ach_data ach on b.BAKERY_CODE = ach.bakery_code  where b.governorate_code=03 and b.status=1 and b.BAKERY_CODE not in(select BAKERY_CODE from REQ_BAKERY_ACH_DATA rbb,Requests r where rbb.REQ_CODE = r.REQ_CODE and r.REQ_CHANNEL=' + '\'') + 'BAKERY_ACC') + '\' and r.REQ_STATUS = ' + '\'') + 'FR_APRV') + '\'and r.APP_TYPE=1) ')
println(Query)

// Call the connection (UserName , Password , Query , The cash file to save the query result on it )
CustomKeywords.'dataBaseConnection.GetOracleQueryResult.conectsql'('bdistribute', '12345678', Query, 'C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem\\Cash\\GetBackeryCode.txt')

// read  User name from CSV then save it  in cash
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem\\Cash\\ValidUserName.txt')

file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(11, 1))

// read  password from CSV then save it  in cash

file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem\\Cash\\ValidPassword.txt')

file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(12, 1))