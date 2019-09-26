
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject


def static "utilities.Syn.getWaitTime"(
    	int[] optionalWaitArray	) {
    (new utilities.Syn()).getWaitTime(
        	optionalWaitArray)
}

def static "utilities.Syn.getTestCasename"() {
    (new utilities.Syn()).getTestCasename()
}

def static "pages.Quicksti.setUserPaymentDetails"(
    	String firstName	
     , 	String lastName	
     , 	String cardNum	) {
    (new pages.Quicksti()).setUserPaymentDetails(
        	firstName
         , 	lastName
         , 	cardNum)
}

def static "pages.Quicksti.setExpDate"(
    	String sExpMonth	
     , 	String sExpYear	
     , 	String securityCode	) {
    (new pages.Quicksti()).setExpDate(
        	sExpMonth
         , 	sExpYear
         , 	securityCode)
}

def static "pages.Quicksti.setPaymentAmountDetailsForSinglePayment"(
    	String amount	
     , 	String quantity	) {
    (new pages.Quicksti()).setPaymentAmountDetailsForSinglePayment(
        	amount
         , 	quantity)
}

def static "pages.Quicksti.verifyUserPaymentDetails"(
    	String paymentAmount	
     , 	String firstName	
     , 	String lastName	
     , 	String cardNumber	) {
    (new pages.Quicksti()).verifyUserPaymentDetails(
        	paymentAmount
         , 	firstName
         , 	lastName
         , 	cardNumber)
}

def static "pages.Quicksti.setAmountDetailsForMultiBureau"(
    	String index	
     , 	String paymentType	
     , 	String paymentAmount	
     , 	String sComments	
     , 	String referenceNum	
     , 	String quantity	) {
    (new pages.Quicksti()).setAmountDetailsForMultiBureau(
        	index
         , 	paymentType
         , 	paymentAmount
         , 	sComments
         , 	referenceNum
         , 	quantity)
}

def static "pages.Quicksti.verifyPaymentApproval"(
    	TestObject testObject	) {
    (new pages.Quicksti()).verifyPaymentApproval(
        	testObject)
}

def static "pages.Search_Page.enterSearchDetails"(
    	String lastName	
     , 	String last4Digits	
     , 	String last5Digits	) {
    (new pages.Search_Page()).enterSearchDetails(
        	lastName
         , 	last4Digits
         , 	last5Digits)
}

def static "pages.Search_Page.selectRadioButton"() {
    (new pages.Search_Page()).selectRadioButton()
}

def static "pages.Search_Page.switchToWindow"() {
    (new pages.Search_Page()).switchToWindow()
}

def static "pages.Bureau_Login_Page.windowSwitching"() {
    (new pages.Bureau_Login_Page()).windowSwitching()
}

def static "pages.Bureau_Login_Page.loginToBureau"(
    	String username	
     , 	String password	
     , 	String accessCode	) {
    (new pages.Bureau_Login_Page()).loginToBureau(
        	username
         , 	password
         , 	accessCode)
}

def static "pages.Bureau_Login_Page.verifyPaymentInRealTimeMonitor"(
    	TestObject object	
     , 	String referenceNum	
     , 	String lastName	
     , 	String firstName	
     , 	String paymentID	) {
    (new pages.Bureau_Login_Page()).verifyPaymentInRealTimeMonitor(
        	object
         , 	referenceNum
         , 	lastName
         , 	firstName
         , 	paymentID)
}

def static "pages.Payment_Page.setPersonalDetails"(
    	String firstname	
     , 	String last	
     , 	String telephone	) {
    (new pages.Payment_Page()).setPersonalDetails(
        	firstname
         , 	last
         , 	telephone)
}

def static "pages.Payment_Page.setLocationDetails"(
    	String address	
     , 	String zipCode	) {
    (new pages.Payment_Page()).setLocationDetails(
        	address
         , 	zipCode)
}

def static "pages.Payment_Page.setCardDetails"(
    	String cardNum	
     , 	String securityCode	
     , 	String expYear	
     , 	String expMonth	) {
    (new pages.Payment_Page()).setCardDetails(
        	cardNum
         , 	securityCode
         , 	expYear
         , 	expMonth)
}

def static "pages.Payment_Page.setAmount"(
    	String index	
     , 	String paymentAmount	
     , 	String comments	
     , 	String referenceNum	) {
    (new pages.Payment_Page()).setAmount(
        	index
         , 	paymentAmount
         , 	comments
         , 	referenceNum)
}

def static "pages.Payment_Page.verifyUserDetails"(
    	String firstName	
     , 	String lastName	
     , 	String emailAddress	
     , 	String cardType	
     , 	String accountType	) {
    (new pages.Payment_Page()).verifyUserDetails(
        	firstName
         , 	lastName
         , 	emailAddress
         , 	cardType
         , 	accountType)
}

def static "pages.Payment_Page.verifyCardPaymentApproval"(
    	String referenceNum	) {
    (new pages.Payment_Page()).verifyCardPaymentApproval(
        	referenceNum)
}

def static "pages.Payment_Page.verifyECheckPaymentApproval"(
    	String referenceNum	) {
    (new pages.Payment_Page()).verifyECheckPaymentApproval(
        	referenceNum)
}

def static "pages.Payment_Page.verifyPaymentDetailsInReceipt"(
    	String paymentId	) {
    (new pages.Payment_Page()).verifyPaymentDetailsInReceipt(
        	paymentId)
}

def static "pages.Payment_Page.setElectronicCheckInformation"(
    	TestObject testObject	
     , 	TestObject testObject2	
     , 	String routingNumber	
     , 	String checkingAccNum	) {
    (new pages.Payment_Page()).setElectronicCheckInformation(
        	testObject
         , 	testObject2
         , 	routingNumber
         , 	checkingAccNum)
}

def static "utilities.SafeActions.openBrowser"(
    	String url	
     , 	int[] optionWaitTime	) {
    (new utilities.SafeActions()).openBrowser(
        	url
         , 	optionWaitTime)
}

def static "utilities.SafeActions.highLightElement"(
    	TestObject testObject	
     , 	int timeout	) {
    (new utilities.SafeActions()).highLightElement(
        	testObject
         , 	timeout)
}

def static "utilities.SafeActions.safeCheck"(
    	TestObject testObject	
     , 	String friendlyWebElementName	
     , 	int[] optionWaitTime	) {
    (new utilities.SafeActions()).safeCheck(
        	testObject
         , 	friendlyWebElementName
         , 	optionWaitTime)
}

def static "utilities.SafeActions.safeType"(
    	TestObject testObject	
     , 	String text	
     , 	String friendlyWebElementName	
     , 	int[] optionWaitTime	) {
    (new utilities.SafeActions()).safeType(
        	testObject
         , 	text
         , 	friendlyWebElementName
         , 	optionWaitTime)
}

def static "utilities.SafeActions.safeClick"(
    	TestObject testObject	
     , 	String friendlyWebElementName	
     , 	int[] optionWaitTime	) {
    (new utilities.SafeActions()).safeClick(
        	testObject
         , 	friendlyWebElementName
         , 	optionWaitTime)
}

def static "utilities.SafeActions.safeGetText"(
    	TestObject testObject	
     , 	String friendlyWebElementName	
     , 	int[] optionWaitTime	) {
    (new utilities.SafeActions()).safeGetText(
        	testObject
         , 	friendlyWebElementName
         , 	optionWaitTime)
}

def static "utilities.SafeActions.safeSelectOptionInDropdownByVisibleText"(
    	TestObject testObject	
     , 	String sVisibleTextOptionToSelect	
     , 	String friendlyWebElementName	
     , 	int[] optionWaitTime	) {
    (new utilities.SafeActions()).safeSelectOptionInDropdownByVisibleText(
        	testObject
         , 	sVisibleTextOptionToSelect
         , 	friendlyWebElementName
         , 	optionWaitTime)
}

def static "utilities.SafeActions.GetAttributeValue"(
    	TestObject testObject	
     , 	String attribute	
     , 	String friendlyWebElementName	
     , 	int[] optionWaitTime	) {
    (new utilities.SafeActions()).GetAttributeValue(
        	testObject
         , 	attribute
         , 	friendlyWebElementName
         , 	optionWaitTime)
}
