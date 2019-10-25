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

<<<<<<< HEAD
CustomKeywords.'utilities.SafeActions.openBrowser'(GlobalVariable.Quicksti_Url, (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Login_ Page/BUREAU_CODE'), GlobalVariable.bureau_code, 
    'Bureau code', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Login_ Page/TELLER_ID'), GlobalVariable.teller_id, 
    'Bureau code', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Login_ Page/NEXT_BUTTON'), 'Next button', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/MANUAL_ENTRY_BUTTON'), 
    'ManualEntry', (([GlobalVariable.pageLoadTime]) as int[]))

CardNumber = CustomKeywords.'pages.Quicksti.setUserPaymentDetails'(firstName, lastName, GlobalVariable.DiscoverCard)

CustomKeywords.'pages.Quicksti.setExpDate'(expMonth, expYear, securityCode)

CustomKeywords.'utilities.SafeActions.safeSelectOptionInDropdownByVisibleText'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/PAYMENT_TYPE'), 
    'Taxes', 'paymentType', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'pages.Quicksti.setPaymentAmountDetailsForSinglePayment'(paymentAmount, quantity)

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/REFRENCE_NUMBER'), 
    referenceNum, 'Reference Number', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/COMMENTS'), 'Testing', 
    'Comments', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/ADDRESS'), address, 
    'Address', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/ZIP_CODE'), GlobalVariable.zipCode, 
    'zipcode', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/TELEPHONE'), GlobalVariable.telephone, 
    'Telephone', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/EMAIL_ADDRESS'), 
    GlobalVariable.emailAddress, 'EMAIL address', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/NEXT_BUTTON'), 
    'Next', (([GlobalVariable.pageLoadTime]) as int[]))

=======
'Open certpay Quicksti appliction'
CustomKeywords.'utilities.SafeActions.openBrowser'(GlobalVariable.Quicksti_Url, (([GlobalVariable.pageLoadTime]) as int[]))

' Enter \'Bureau code\''
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Login_ Page/BUREAU_CODE'), GlobalVariable.bureau_code, 
    'Bureau code', (([GlobalVariable.pageLoadTime]) as int[]))

' Enter \'Teller Id\''
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Login_ Page/TELLER_ID'), GlobalVariable.teller_id, 
    'Bureau code', (([GlobalVariable.pageLoadTime]) as int[]))

'Click on \'Next\''
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Login_ Page/NEXT_BUTTON'), 'Next button', 
        (([GlobalVariable.pageLoadTime]) as int[]))

'Click on \'Click here to manually enter card details\''
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/MANUAL_ENTRY_BUTTON'), 
    'ManualEntry', (([GlobalVariable.pageLoadTime]) as int[]))

' Enter firstname,lastname, Discover card Number'
CardNumber = CustomKeywords.'pages.Quicksti.setUserPaymentDetails'(firstName, lastName, GlobalVariable.DiscoverCard)

'Enter exp date,security code'
CustomKeywords.'pages.Quicksti.setExpDate'(expMonth, expYear, securityCode)

'Select Payment type'
CustomKeywords.'utilities.SafeActions.safeSelectOptionInDropdownByVisibleText'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/PAYMENT_TYPE'), 
    'Taxes', 'paymentType', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter payment amount,quantity'
CustomKeywords.'pages.Quicksti.setPaymentAmountDetailsForSinglePayment'(paymentAmount, quantity)

'Enter reference num'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/REFRENCE_NUMBER'), 
    referenceNum, 'Reference Number', (([GlobalVariable.pageLoadTime]) as int[]))

amount_Value = CustomKeywords.'pages.Quicksti.getAttributeValue'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/SUB_TOTAL'))

'Enter Comments'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/COMMENTS'), 'Testing', 
    'Comments', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter Address'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/ADDRESS'), address, 
    'Address', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter zip code'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/ZIP_CODE'), GlobalVariable.zipCode, 
    'zipcode', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter telephone'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/TELEPHONE'), GlobalVariable.telephone, 
    'Telephone', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter email address'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/EMAIL_ADDRESS'), 
    GlobalVariable.emailAddress, 'EMAIL address', (([GlobalVariable.pageLoadTime]) as int[]))

'Click on \'Next\''
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/NEXT_BUTTON'), 
    'Next', (([GlobalVariable.pageLoadTime]) as int[]))

'Verify user details'
>>>>>>> temp_branch
CustomKeywords.'pages.Quicksti.verifyUserPaymentDetails'(paymentAmount, firstName, lastName, CardNumber)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('CERTPAY_QUICKSTI/Payment_Details_Verification_Page/PROCESS'), 0)

<<<<<<< HEAD
=======
'Click on \'Process\''
>>>>>>> temp_branch
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Payment_Details_Verification_Page/PROCESS'), 
    'Process', (([GlobalVariable.pageLoadTime]) as int[]))

PaymentId = CustomKeywords.'pages.Quicksti.verifyPaymentApproval'(findTestObject('CERTPAY_QUICKSTI/Payment_Details_Verification_Page/APPROVED'))

<<<<<<< HEAD
WebUI.closeBrowser()
=======
'Navigate to reports site'
WebUI.navigateToUrl(GlobalVariable.Reports_url)

' Enter username,password,access code and click Login'
CustomKeywords.'pages.Bureau_Login_Page.loginToReportsSite'(GlobalVariable.userName, GlobalVariable.password, GlobalVariable.accessCode)

WebUI.mouseOver(findTestObject('SEARCH_PAYMENT/REPORTING'))

WebUI.delay(1)

'Click on Reporting'
//CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/REPORTING'), 'Reporting', (([GlobalVariable.pageLoadTime]) as int[]))

//CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/REPORTING'), 'Reporting', (([GlobalVariable.pageLoadTime]) as int[]))

'CLick on Quick find Payment'
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/QUICK_FIND_PAYMENT'), 'Quick find payment', 
        (([GlobalVariable.pageLoadTime]) as int[]))

'Enter payment id'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('SEARCH_PAYMENT/PAYMENT_ID_INPUT_FIELD'), PaymentId, 'Payment id', 
        (([GlobalVariable.pageLoadTime]) as int[]))

'Click on search button'
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/SEARCH_BUTTON_1'), 'Search button', (([GlobalVariable.pageLoadTime]) as int[]))

'Verify card type,payment amount,id'
CustomKeywords.'pages.Search_Page.validateApprovedTransactionsInReports'(PaymentId, 'Discover', amount_Value)
>>>>>>> temp_branch

