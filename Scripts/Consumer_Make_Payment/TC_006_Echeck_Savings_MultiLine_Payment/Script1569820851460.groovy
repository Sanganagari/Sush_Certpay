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

CustomKeywords.'utilities.SafeActions.openBrowser'(GlobalVariable.certpay_url, (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('MAKE_ PAYMENT/Home_ Page/BUREAU_CODE'), bureauCode, 'Bureau code', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/BEGIN_PAYMENT'), 'Begin payment', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/NEXT_BUTTON'), 'Continue', (([
            GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeCheck'(findTestObject('MAKE_ PAYMENT/Home_ Page/ELECTRONIC_CHECK'), 'Electronic check', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'pages.Payment_Page.setAmount'('1', paymentAmount, 'testing', referenceNum)

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/ADD_ANOTHER_PROPERTY'), 'Multi-Payment', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'pages.Payment_Page.setAmount'('2', paymentAmount2, 'Payment for testing', referenceNum)

CustomKeywords.'utilities.SafeActions.safeSelectOptionInDropdownByVisibleText'(findTestObject('MAKE_ PAYMENT/Home_ Page/PAYMENT_TYPE'), 
    paymentType, 'Payment Type', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/CONTINUE'), 'Continue', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'pages.Payment_Page.setPersonalDetails'(firstName, lastName, telephone)

CustomKeywords.'pages.Payment_Page.setLocationDetails'(address, zipCode)

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/CONTINUE'), 'Continue', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeCheck'(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/CheckBox'), 'Billing CheckBox', 
        (([GlobalVariable.pageLoadTime]) as int[]))

WebUI.waitForPageLoad(2)

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/CONTINUE'), 'Continue', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeCheck'(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/ACC_TYPE_SAVINGS'), 
    'Checking', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'pages.Payment_Page.setElectronicCheckInformation'(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/CHECKING_ACCOUNT_NUMBER'), 
    findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/CONFIRM_CHECKING_ACC_NUM'), routingNum, checkingAccNum)

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/EMAIL_ADDRESS'), 
    emailAddress, 'EmailAddress', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/SIGNATURE'), firstName, 
    'EmailAddress', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/AGREEMENT'), 'Yes', 
    'Agreement', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/CHECK_CONTINUE'), 'Continue', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/CONTINUE'), 'Continue', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/I_AGREE'), 'I agree', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'pages.Payment_Page.verifyUserDetails'(firstName, lastName, emailAddress, '', 'Savings')

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Verification_ Details/PROCESS_PAYMENT'), 
    'Process Payment', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Verification_ Details/YES_BUTTON'), 'yes button', 
        (([GlobalVariable.pageLoadTime]) as int[]))

WebUI.verifyElementPresent(findTestObject('MAKE_ PAYMENT/Verification_ Details/PENDING'), GlobalVariable.pageLoadTime)

PaymentID = CustomKeywords.'pages.Payment_Page.verifyECheckPaymentApproval'(referenceNum)

CustomKeywords.'pages.Bureau_Login_Page.windowSwitching'()

WebUI.waitForPageLoad(2)

CustomKeywords.'pages.Bureau_Login_Page.loginToBureau'(GlobalVariable.userName, GlobalVariable.password, GlobalVariable.accessCode)

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/REPORTING'), 'Reporting', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/REPORTING'), 'Reporting', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/REAL_TIME_MONITOR'), 'RealTimeMonitor', 
        (([GlobalVariable.pageLoadTime]) as int[]))

WebUI.delay(2)

CustomKeywords.'pages.Bureau_Login_Page.verifyPaymentInRealTimeMonitor'(findTestObject('BUREAU_LOGIN/SECOND_ID'), referenceNum, 
    lastName, firstName, PaymentID)

WebUI.closeBrowser()

