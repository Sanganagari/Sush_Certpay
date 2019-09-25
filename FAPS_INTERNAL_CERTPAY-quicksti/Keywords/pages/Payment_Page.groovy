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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import utilities.SafeActions

public class Payment_Page {
	SafeActions safe=new SafeActions()
	String cardNumber=null;
	String last4Digits=null;
	String last5Digits=null;
	String paymentID= null;
	String referenceNumber=null;
	@Keyword
	def setPersonalDetails(String first,String last,String telephone){
		safe.safeType(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/FIRST_NAME')

				, first, "FirstName", (([GlobalVariable.pageLoadTime]) as int[]))
		safe.highLightElement(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/LAST_NAME'), 10)

		safe.safeType(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/LAST_NAME')

				, last, "LastName", (([GlobalVariable.pageLoadTime]) as int[]))
		safe.safeType(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/TELEPHONE')


				, telephone, "Telephone", (([GlobalVariable.pageLoadTime]) as int[]))

		String firstName = WebUI.getAttribute(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/FIRST_NAME')
				, 'value')
		WebUI.verifyMatch(first, firstName, true)
	}

	@Keyword
	def setLocationDetails(String address,String zipCode){
		safe.safeType(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/ADDRESS'),address, "Address",  (([GlobalVariable.pageLoadTime]) as int[]))

		safe.safeType( findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/ZIP_CODE'),zipCode, "ZipCode",  (([GlobalVariable.pageLoadTime]) as int[]))
	}

	@Keyword
	def setCardDetails(String cardNum,String securityCode,String expYear,String expMonth){
		safe.safeType(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/CARD_NUM'),cardNum, "CardNum",  (([GlobalVariable.pageLoadTime]) as int[]))

		safe.safeSelectOptionInDropdownByVisibleText(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/EXP_MONTH'), expMonth, 'Month', (([GlobalVariable.pageLoadTime]) as int[]))
		safe.safeSelectOptionInDropdownByVisibleText(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/EXP_YEAR'), expYear, 'year', (([GlobalVariable.pageLoadTime]) as int[]))
		safe.safeType(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/SECURITY_CODE'),securityCode, "SecurityCode",  (([GlobalVariable.pageLoadTime]) as int[]))

		cardNumber= WebUI.getAttribute(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/CARD_NUM'), 'value')
		//WebUI.verifyMatch(cardNum, cardNum, true)
		last4Digits= cardNumber.substring(12);
		last5Digits= cardNumber.substring(11)
	}
	@Keyword
	def getcardLastNumbers(){
		//String cardNumber=810000009999123
		last4Digits= cardNumber.substring(12);
		last5Digits= cardNumber.substring(11)
		println("CardNumber is :" +cardNumber, last4Digits,last5Digits)
		return last4Digits;
		return last5Digits;

	}

	// Entering amount,reference number,comments
	@Keyword
	def setAmount(String index,String paymentAmount,String comments,String referenceNum){
		//Payment amount

		String amountXpath="//input[@id='ctl00_mainContent_AdditionalPayment_"+index+"_txtPaymentAmount']";
		TestObject amount=new TestObject()
		amount.addProperty("xpath", ConditionType.EQUALS, amountXpath)
		safe.safeType(amount, paymentAmount, 'Amount', (([GlobalVariable.pageLoadTime]) as int[]))

		//Reference Number
		String refXpath="//input[@id='ctl00_mainContent_AdditionalPayment_"+index+"_txtTaxID']"
		TestObject referenceNumber=new TestObject()
		referenceNumber.addProperty("xpath", ConditionType.EQUALS, refXpath)
		safe.safeType(referenceNumber, referenceNum, 'Amount', (([GlobalVariable.pageLoadTime]) as int[]))

		// Comments
		String commentXpath="//input[@id='ctl00_mainContent_AdditionalPayment_"+index+"_txtComments']";
		TestObject comment=new TestObject()
		comment.addProperty("xpath", ConditionType.EQUALS, commentXpath)
		safe.safeType(comment, comments, 'Comments', (([GlobalVariable.pageLoadTime]) as int[]))

	}

	@Keyword
	def verifyUserDetails(String firstName,String lastName,String emailAddress,String cardType,String accountType){
		WebUI.scrollToElement(findTestObject('MAKE_ PAYMENT/Verification_ Details/FIRST_NAME'), 0)
		String sfirstName=WebUI.getText(findTestObject('MAKE_ PAYMENT/Verification_ Details/FIRST_NAME'))
		//safe.highLightElement(findTestObject('MAKE_ PAYMENT/Verification_ Details/FIRST_NAME'), 0)
		WebUI.verifyMatch(firstName, sfirstName, true, FailureHandling.STOP_ON_FAILURE)

		String sLastName=WebUI.getText(	findTestObject('MAKE_ PAYMENT/Verification_ Details/LAST_NAME'))
		//safe.highLightElement(findTestObject('MAKE_ PAYMENT/Verification_ Details/LAST_NAME'), 0)
		WebUI.verifyMatch(lastName, sLastName, true, FailureHandling.STOP_ON_FAILURE)
		Thread.sleep(2000);

		String email=WebUI.getText(	findTestObject('MAKE_ PAYMENT/Verification_ Details/EMAIL_ADDRESS'))
		WebUI.verifyMatch(emailAddress, email, true, FailureHandling.STOP_ON_FAILURE)

		if(cardType.empty){
			String accType=WebUI.getText(findTestObject('Object Repository/MAKE_ PAYMENT/Verification_ Details/ACH_ACC_TYPE'))
			//safe.highLightElement(findTestObject('Object Repository/MAKE_ PAYMENT/Verification_ Details/ACH_ACC_TYPE'), 0)
			WebUI.verifyMatch(accountType,accType,true,FailureHandling.STOP_ON_FAILURE)
			Thread.sleep(1000);

		}
		//else if(accountType.empty){
		else{
			String cardType1=WebUI.getText(findTestObject('MAKE_ PAYMENT/Verification_ Details/CARD_TYPE'))

			WebUI.verifyMatch(cardType, cardType1, true, FailureHandling.STOP_ON_FAILURE)
		}
		//		else
		//		println "Verification Failed"
	}

	// Payment Verifications
	@Keyword
	def verifyCardPaymentApproval(String referenceNum){
		String paymentID=WebUI.getText( findTestObject('MAKE_ PAYMENT/Verification_ Details/PAY_ID_CARD'))
		Thread.sleep(3000);
		referenceNumber =WebUI.getText(findTestObject('MAKE_ PAYMENT/Verification_ Details/REFERENCE_NUM'))
		if(referenceNumber.equals(referenceNum))
			println('Payment successfull with Payment ID :'+paymentID)
		return paymentID;
	}
	@Keyword
	def verifyECheckPaymentApproval(String referenceNum)
	{
		String paymentID=WebUI.getText(findTestObject('Object Repository/MAKE_ PAYMENT/Verification_ Details/PAY_ID_ELECTRIC_CHECK'))
		Thread.sleep(2000);
		referenceNumber=WebUI.getText(	findTestObject('Object Repository/MAKE_ PAYMENT/Verification_ Details/REF_NUM_E_CHECK'))

		if(referenceNumber.equals(referenceNum))
			println('Payment successfull with Payment ID :'+paymentID)
		return paymentID;
	}



	@Keyword
	def verifyPaymentDetailsInReceipt(String paymentId){
		boolean bFlag=true;
		String referenceNum=WebUI.getText(findTestObject('Object Repository/SEARCH_PAYMENT/REFERNCE_NUM'))
		String sPaymentId=WebUI.getText(findTestObject('Object Repository/SEARCH_PAYMENT/PAYMENT_ID'))
		if(referenceNum.equals(referenceNumber)){


			assert WebUI.verifyMatch(sPaymentId,paymentId,  true, FailureHandling.STOP_ON_FAILURE)
			Thread.sleep(2000);
			return bFlag;
		}
		else {
			println(" PaymentID do not matched ")

		}
		println referenceNum;
		println sPaymentId;
	}
	@Keyword
	def setElectronicCheckInformation(TestObject testObject,TestObject testObject2,String routingNumber,String checkingAccNum){

		safe.safeType(		findTestObject('Object Repository/MAKE_ PAYMENT/Consumer_Personal_ Details/ROUTING_NUMBER')
				, routingNumber, 'RoutingNumber', (([GlobalVariable.pageLoadTime]) as int[]))

		if(WebUI.verifyElementPresent(testObject, 0)){


			safe.safeType(	testObject, checkingAccNum, 'CheckAccNum', (([GlobalVariable.pageLoadTime]) as int[]))

			safe.safeType(	testObject2, checkingAccNum, 'ConfirmCheckAccNum', (([GlobalVariable.pageLoadTime]) as int[]))
		}
	}
}