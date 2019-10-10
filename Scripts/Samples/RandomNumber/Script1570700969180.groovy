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
import random
import randrange

int randomInt = Random().randrange(10)
int random

//new Random().nextInt(9999 - 10 + 1) + 10

println(randomInt)

int randomInt = new Random().nextInt(9999 - 10 + 1) + 10

println(randomInt)

import random
print(random.randint(0,9))


print(randrange(10))

from random import randrange
print(randrange(10))


//random.randrange() with only one argument
print("Random number between 0 and 10 : ", random.randrange(10))

//random.randrange() with two arguments
print("Random number between 20 and 40 : ", random.randrange(20, 40))

//random.randrange() with three argument
print("Random number between 0 and 60 : ", random.randrange(0, 60, 6))
