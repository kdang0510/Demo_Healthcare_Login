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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://uat-zurich-iom-plan-retirement.360f.com/authen/callback?grant_type=token&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzZXNzaW9uSWQiOiIwMTUxZDY0Mi0wNjkwLTQwMzMtYThhZS02N2QwOWQwMjg0N2EiLCJpc3MiOiIzNjBmLmNvbSIsImlhdCI6MTY2NjY4NjU4MCwiZXhwIjoxNjY5Mjc4NTgwLCJhdWQiOiJadXJpY2ggSU9NIn0.8FkmTET4cD1QIxShlvKdkedVVh85bfguNCwg1XFXOlA')

WebUI.click(findTestObject('Object Repository/Page_Retirement Planner Tool/ddCountry'))

WebUI.click(findTestObject('Page_Retirement Planner Tool/liCountry', [('Country') : CountryName]))

