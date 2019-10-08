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
import com.sun.xml.internal.org.jvnet.mimepull.DataFile as DataFile
import internal.GlobalVariable as GlobalVariable
import sun.swing.BakedArrayList as BakedArrayList
import org.openqa.selenium.Keys as Keys

String Query

File file

// Get Bakery Code which have bank account then save it in Bakery Have Bank Account
Query = ((((('Select * from base_bakery b inner join bakery_ach_data ach on b.BAKERY_CODE = ach.bakery_code  where b.governorate_code=90 and b.BAKERY_CODE not in(select BAKERY_CODE from REQ_BAKERY_ACH_DATA rbb,Requests r where rbb.REQ_CODE = r.REQ_CODE and r.REQ_CHANNEL=' + '\'') + 'BAKERY_ACC') + '\' and r.REQ_STATUS = ' + '\'') + 'FR_APRV') + '\'and r.APP_TYPE=1) ')
println(Query)

CustomKeywords.'dataBaseConnection.GetOracleQueryResult.conectsql'('bdistribute', '12345678', Query, 'C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\BakeryHaveBankAccount.txt')

// read  User name from CSV then save it  in cash 
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\ValidUserName.txt')

file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(1, 1))

// read  password from CSV then save it  in cash

file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\ValidPassword.txt')

file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(2, 1))


// read  Acc number  from CSV then save it  in cash

file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\AccNumber.txt')

file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(6, 1))

// read  Acc Name  from CSV then save it  in cash

file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\AccName.txt')

file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(7, 1))

// read  NID Number  from CSV then save it  in cash

file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\NIDNumber.txt')
file.write("28502063200094")
// Or get it from CSV 
//file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(8, 4))