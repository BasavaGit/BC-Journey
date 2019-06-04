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

WebUI.openBrowser('http://dev-bo-bc.svakarma.net/')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input_Username..._ku-text-user'), 
    '2001')

WebUI.sendKeys(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input_Enter Password..._ku-tex'), 
    'svakarma123')

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/span_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/div_New Lead'))

WebUI.sendKeys(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input_concat(Applicant  s PAN'), 
    'EEKPM2329C')

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input__ku-text-firstName'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input__ku-text-firstName'), 
    'Gopal')

WebUI.sendKeys(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input__ku-text-lastName'), 'Verma')

WebUI.delay(3)

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input__radio-group-gender'))

WebUI.sendKeys(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input__ku-text-fathersName'), 
    'Viajy')

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input__ku-datepicker-dob'))

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/span_30'))

WebUI.sendKeys(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input__ku-text-rAddressLine1'), 
    '#39,10th Cross, Near to Forum Mall, Maharshtra')

WebUI.sendKeys(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input_Please enter a Pincode f'), 
    '440032')

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input_State_ku-checkbox-curren'))

WebUI.delay(3)

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input_State_ku-checkbox-curren'))

WebUI.sendKeys(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input__ku-text-mobile1'), '9876363728')

WebUI.delay(2)

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input_Is there a Co-applicant_'))

WebUI.sendKeys(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input__ku-text-numberCoApplica'), 
    '2')

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input_Is there a Guarantor_ku-'))

WebUI.sendKeys(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input__ku-text-numberOfguarant'), 
    '2')

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input_Customer Consent for Bur'))

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/input_Email Id_ku-checkbox-coA'))

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/span_Next'))

not_run: WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/span_Next'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/input_PAN_ku-text-panCoApplica'), 
    'EEKPM2329C')

WebUI.click(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/input__ku-text-firstNameCoAppl'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/input__ku-text-firstNameCoAppl'), 
    'Vijay')

WebUI.sendKeys(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/input__ku-text-lastNameCoAppli'), 
    'Dingi')

WebUI.click(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/input__radio-group-genderCoApp'))

WebUI.sendKeys(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/input__ku-text-coApplicantFath'), 
    'Kunal')

WebUI.click(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/input__ku-datepicker-dobCoAppl'))

WebUI.click(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/span_30'))

WebUI.sendKeys(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/input__ku-text-coApplicantAddr'), 
    '#39,10th cross Mumbai')

WebUI.sendKeys(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/input_Please enter a Pincode f'), 
    '440032')

WebUI.click(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/input__ku-text-coApplicantMobi'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/input__ku-text-coApplicantMobi'), 
    '9876543210')

WebUI.click(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/span_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/span_Next'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Borrower Details/Gurantoor_Objects/input_concat(Guarantor  s PAN)'), 'EEKPM2329C')

WebUI.click(findTestObject('Borrower Details/Gurantoor_Objects/input__ku-text-guarantorFirstN'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Borrower Details/Gurantoor_Objects/input__ku-text-guarantorFirstN'), 'Vijay')

WebUI.sendKeys(findTestObject('Borrower Details/Gurantoor_Objects/input__ku-text-guarantorLastNa'), 'Dingi')

WebUI.click(findTestObject('Borrower Details/Gurantoor_Objects/input__radio-group-guarantorGe'))

WebUI.sendKeys(findTestObject('Borrower Details/Gurantoor_Objects/input_concat(Father  s Name)_k'), 'Kunal')

WebUI.click(findTestObject('Borrower Details/Gurantoor_Objects/input__radio-group-guarantorMa'))

WebUI.click(findTestObject('Borrower Details/Gurantoor_Objects/input__ku-datepicker-guarantor'))

WebUI.click(findTestObject('Borrower Details/Gurantoor_Objects/span_2'))

WebUI.sendKeys(findTestObject('Borrower Details/Gurantoor_Objects/input__ku-text-guarantorAddres'), '#39,10th cross Mumbai')

WebUI.sendKeys(findTestObject('Borrower Details/Gurantoor_Objects/input_Please enter a Pincode f_Gurantoor'), '440032')

WebUI.click(findTestObject('Borrower Details/Gurantoor_Objects/input__ku-text-guarantorMobile'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Borrower Details/Gurantoor_Objects/input__ku-text-guarantorMobile'), '9876543210')

WebUI.click(findTestObject('Borrower Details/Filling_Co_Applicant/Page_BackOffice  Login/span_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Borrower Details/Page_BackOffice  Login and Business Details/span_Next'))

WebUI.sendKeys(findTestObject('Business_Details/input__ku-text-enterpriseName'), 'asa')

WebUI.sendKeys(findTestObject('Business_Details/input__ku-text-shopIdGstin'), 'ass')

WebUI.click(findTestObject('Business_Details/div'))

WebUI.delay(2)

WebUI.click(findTestObject('Business_Details/div_Private Ltd.'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Business_Details/input__ku-text-addressLine1'), '#39,10th cross')

WebUI.sendKeys(findTestObject('Business_Details/input_Please enter a Pincode f'), '440032')

WebUI.click(findTestObject('Business_Details/div_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Business_Details/div_Next'))

