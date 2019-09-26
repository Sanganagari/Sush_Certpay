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

not_run: CustomKeywords.'utilities.SafeActions.openBrowser'(GlobalVariable.certpay_url, (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('MAKE_ PAYMENT/Home_ Page/BUREAU_CODE'), bureauCode, 'Bureau code', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/BEGIN_PAYMENT'), 'Begin payment', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/CONTINUE'), 'Continue', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeCheck'(findTestObject('MAKE_ PAYMENT/Home_ Page/BANK_CARD'), 'Bank card', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'pages.Payment_Page.setAmount'('1', paymentAmount, 'testing', referenceNum)

WebUI.waitForPageLoad(0)

CustomKeywords.'utilities.SafeActions.safeSelectOptionInDropdownByVisibleText'(findTestObject('MAKE_ PAYMENT/Home_ Page/CARD_TYPE'), 
    CardType, 'CardType', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeSelectOptionInDropdownByVisibleText'(findTestObject('MAKE_ PAYMENT/Home_ Page/PAYMENT_TYPE'), 
    paymentType, 'Payment Type', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/NEXT_BUTTON'), 'Continue', (([
            GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'pages.Payment_Page.setPersonalDetails'(firstName, lastName, telephone)

CustomKeywords.'pages.Payment_Page.setLocationDetails'(address, zipCode)

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/CONTINUE'), 'Continue', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeCheck'(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/CheckBox'), 'Billing CheckBox', 
        (([GlobalVariable.pageLoadTime]) as int[]))

WebUI.waitForPageLoad(0)

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/CONTINUE'), 'Continue', (([GlobalVariable.pageLoadTime]) as int[]))

WebUI.delay(GlobalVariable.mediumWait)

CustomKeywords.'pages.Payment_Page.setCardDetails'(cardNum, securityCode, expYear, expMonth)

CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/EMAIL_ADDRESS'), 
    emailAddress, 'EmailAddress', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Home_ Page/CONTINUE'), 'Continue', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Consumer_Personal_ Details/I_AGREE'), 'I agree', 
        (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'pages.Payment_Page.verifyUserDetails'(firstName, lastName, emailAddress, CardType, '')

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Verification_ Details/PROCESS_PAYMENT'), 
    'Process Payment', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('MAKE_ PAYMENT/Verification_ Details/YES_BUTTON'), 'yes button', 
        (([GlobalVariable.pageLoadTime]) as int[]))

WebUI.verifyElementPresent(findTestObject('MAKE_ PAYMENT/Verification_ Details/APPROVED'), 0)

PaymentId = CustomKeywords.'pages.Payment_Page.verifyCardPaymentApproval'(referenceNum)

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/SEARCH_PAYMENT'), 'Search Payment', (([GlobalVariable.pageLoadTime]) as int[]))

WebUI.waitForPageLoad(10)

CustomKeywords.'pages.Search_Page.switchToWindow'()

CustomKeywords.'utilities.SafeActions.safeCheck'(findTestObject('SEARCH_PAYMENT/CREDIT_OR_DEBIT_CARD'), 'Credit card', (([
            GlobalVariable.mediumWait]) as int[]))

CustomKeywords.'pages.Search_Page.enterSearchDetails'(lastName, last4Digits, '')

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/SEARCH_BUTTON'), 'Search', (([GlobalVariable.pageLoadTime]) as int[]))

CustomKeywords.'pages.Payment_Page.verifyPaymentDetailsInReceipt'(PaymentId)

CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/SEARCH_ ICON'), 'SearchIcon', (([GlobalVariable.pageLoadTime]) as int[]))

WebUI.delay(2)
