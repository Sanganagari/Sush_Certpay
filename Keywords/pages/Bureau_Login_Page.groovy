package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import utilities.SafeActions

public class Bureau_Login_Page {
	SafeActions safe=new SafeActions()
	
	
	@Keyword
	def windowSwitching(){
		WebUI.click(	findTestObject('Object Repository/MAKE_ PAYMENT/Home_ Page/BUREAU_LOGIN'))
//			int index=WebUI.getWindowIndex()
//	     String title1=WebUI.getWindowTitle()
//	        println(index)
		   WebUI.switchToWindowIndex(1)
}
	
	
	@Keyword
	def loginToBureau(String username,String password,String accessCode){

		safe.safeType(	findTestObject('Object Repository/MAKE_ PAYMENT/Home_ Page/USER_NAME'), username, 'username', (([GlobalVariable.pageLoadTime]) as int[]))

		safe.safeType(	findTestObject('Object Repository/MAKE_ PAYMENT/Home_ Page/BUREAU_PASSWORD')
				, password, 'password', (([GlobalVariable.pageLoadTime]) as int[]))
		safe.safeType(		findTestObject('Object Repository/MAKE_ PAYMENT/Home_ Page/BUREAU_ACCESS_CODE'), accessCode, 'AccessCode', (([GlobalVariable.pageLoadTime]) as int[]))

		safe.safeClick(	findTestObject('Object Repository/MAKE_ PAYMENT/Home_ Page/LOGIN_BUTTON')
				, 'LOGIN', (([GlobalVariable.pageLoadTime]) as int[]))
	}
}
