package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import utilities.SafeActions

public class Search_Page {
	SafeActions safe=new SafeActions()

	Payment_Page payment=new Payment_Page()


	@Keyword
	def enterSearchDetails(String lastName,String last4Digits,String last5Digits){
		String last4=payment.last4Digits;
		String last5=payment.last5Digits;
	
		safe.highLightElement(findTestObject('Object Repository/SEARCH_PAYMENT/BILLING_LAST_NAME'), 0)
		safe.safeType(findTestObject('Object Repository/SEARCH_PAYMENT/BILLING_LAST_NAME'), lastName, 'LastName', (([GlobalVariable.pageLoadTime]) as int[]))

		//		if(WebUI.verifyElementPresent(findTestObject('Object Repository/SEARCH_PAYMENT/LAST_4_DIGITS_LABEL'), 0)) {
		//if(WebUI.verifyElementChecked(	findTestObject('Object Repository/SEARCH_PAYMENT/CREDIT_OR_DEBIT_CARD')	)){
		if(last5Digits.empty){
			safe.safeType( findTestObject('Object Repository/SEARCH_PAYMENT/LAST_4_DIGITS_CARD_NUMBER') ,last4Digits , 'Last4Digits',  (([GlobalVariable.pageLoadTime]) as int[]))
		}
		else {
			safe.safeType( 	findTestObject('Object Repository/SEARCH_PAYMENT/LAST_5_DIGITS'), last5Digits, 'Last5Digits',  (([GlobalVariable.pageLoadTime]) as int[]))
		}
	}
	@Keyword
	def selectRadioButton(){

		WebElement element=WebUiCommonHelper.findWebElement(findTestObject('Object Repository/SEARCH_PAYMENT/CREDIT_OR_DEBIT_CARD'),30)
		//WebUI.executeJavaScript("arguments[0].click",Arrays.asList(element))
		WebUI.executeJavaScript("arguments[0].click();", element)
	}

	//Switch to Another Window
	@Keyword
	def switchToWindow(){
		WebUI.click(findTestObject('Object Repository/SEARCH_PAYMENT/SEARCH_PAYMENT'))
		//		int index=WebUI.getWindowIndex()
		//		String title1=WebUI.getWindowTitle()
		//		println(title1)
		WebUI.switchToWindowIndex(1)
		
	}

	
}