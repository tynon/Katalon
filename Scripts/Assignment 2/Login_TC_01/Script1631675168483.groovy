import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Open browser'
WebUI.openBrowser('')

'Navigate to URL'
WebUI.navigateToUrl('https://www.nopcommerce.com/en/login?returnUrl=%2Fen%2Fdemo')

'Input username'
WebUI.setText(findTestObject('Object Repository/Assignment 2/txt_username'), 'khoapham')

'Input password'
WebUI.setEncryptedText(findTestObject('Object Repository/Assignment 2/txt_password'), '/SsamLna5Js=')

'Set delay'
WebUI.delay(5)

'Capture screenshot'
WebUI.takeScreenshot()

'Click on Login'
WebUI.click(findTestObject('Object Repository/Assignment 2/btn_login'))

'Set delay'
WebUI.delay(5)

'Capture screenshot'
WebUI.takeScreenshot()

'Close browser'
WebUI.closeBrowser()