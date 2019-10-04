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

CustomKeywords.'utilities.SafeActions.openBrowser'(GlobalVariable.Quicksti_Url, (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeCheck'(findTestObject('CERTPAY_QUICKSTI/Login_ Page/MULTI_BUREAU_CHECKBOX'), 'Multi Bureau', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Login_ Page/TELLER_ID'), GlobalVariable.teller_id, 
    'Bureau code', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Login_ Page/NEXT_BUTTON'), 'Next button', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Multi_Bureau_Page/COMMENTS'), comments, 
    'Payment Amount', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/PAYMENT_AMOUNT'), 
    paymentAmount, 'Payment Amount', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'pages.Quicksti.setAmountDetailsForMultiBureau'('0', paymentType, '0', referenceNum, quantity)

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/MANUAL_ENTRY_BUTTON'), 
    'ManualEntry', (([GlobalVariable.pageLoadTime]) as int[]))

CardNumber = CustomKeywords.'pages.Quicksti.setUserPaymentDetails'(firstName, lastName, GlobalVariable.VISA)

CustomKeywords.'pages.Quicksti.setExpDate'(expMonth, expYear, securityCode)

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

CustomKeywords.'pages.Quicksti.verifyUserPaymentDetails'(paymentAmount, firstName, lastName, CardNumber)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('CERTPAY_QUICKSTI/Payment_Details_Verification_Page/PROCESS'), 0)

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Payment_Details_Verification_Page/PROCESS'), 
    'Process', (([GlobalVariable.pageLoadTime]) as int[]))

PaymentId = CustomKeywords.'pages.Quicksti.verifyPaymentApproval'(findTestObject('CERTPAY_QUICKSTI/Payment_Details_Verification_Page/APPROVED'))

WebUI.navigateToUrl(GlobalVariable.Reports_url)

CustomKeywords.'pages.Bureau_Login_Page.loginToReportsSite'(GlobalVariable.userName, GlobalVariable.password, GlobalVariable.accessCode)

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/REPORTING'), 'Reporting', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/REPORTING'), 'Reporting', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/QUICK_FIND_PAYMENT'), 'Quick find payment', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('SEARCH_PAYMENT/PAYMENT_ID_INPUT_FIELD'), PaymentId, 'Payment id', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/SEARCH_BUTTON_1'), 'Search button', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'pages.Search_Page.validateApprovedTransactionsInReports'(PaymentId, 'Visa', paymentAmount)

