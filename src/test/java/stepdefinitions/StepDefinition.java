package stepdefinitions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.PropertiesReader;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.TestRunner;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.Map;


public class StepDefinition extends TestRunner{

	static WebElement element;
    JavascriptExecutor js = (JavascriptExecutor)driver;
    WebDriverWait wait = new WebDriverWait(driver,10);

	@Given("^I access URL \"([^\"]*)\"$")
	public void I_access_URL(String url) throws Exception {
		driver.get(PropertiesReader.test_Data_Values(url));
	}

	 @When("^I click on \"([^\"]*)\"$")
	 public void i_click_on_the_element(String locator) throws IOException, InterruptedException  {
	 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(PropertiesReader.locator_Values(locator)))));
	 driver.findElement(By.xpath(PropertiesReader.locator_Values(locator))).click();
	  }

    @When("^I select \"([^\"]*)\" in \"([^\"]*)\"$")
    public void i_select_element(String val, String locator) throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(PropertiesReader.locator_Values(locator)))));
        Select ele=new Select(driver.findElement(By.xpath(PropertiesReader.locator_Values(locator))));
        ele.selectByValue(PropertiesReader.test_Data_Values(val));
    }

    @Then("^I should see \"([^\"]*)\"$")
	 public void i_should_see_element(String locator) throws IOException, InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(PropertiesReader.locator_Values(locator)))));
		 element=driver.findElement(By.xpath(PropertiesReader.locator_Values(locator)));
		 Assert.assertTrue(element.isDisplayed());
	 }

	@Then("^I should not see \"([^\"]*)\"$")
	public void i_should_not_see_element(String locator) throws IOException {

		try {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(PropertiesReader.locator_Values(locator)))));
			element=driver.findElement(By.xpath(PropertiesReader.locator_Values(locator)));
			Assert.assertFalse(element.isDisplayed());
		} catch (NoSuchElementException e) {
			Assert.assertFalse(false);
		}

	}


	 @When("^I enter \"([^\"]*)\" in \"([^\"]*)\"$")
	 public void i_enter_text(String val, String locator) throws Exception {
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(PropertiesReader.locator_Values(locator)))));
		 driver.findElement(By.xpath(PropertiesReader.locator_Values(locator))).sendKeys(PropertiesReader.test_Data_Values(val));
	 }

	@Then("^I should verify \"([^\"]*)\" in \"([^\"]*)\"$")
	public void i_should_verify(String expectedText, String locator) throws IOException {
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		String actualText=driver.findElement(By.xpath(PropertiesReader.locator_Values(locator))).getText();
		Assert.assertEquals(actualText,String.valueOf(expectedText));
	}

	@Then("^I choose category as \"([^\"]*)\" from \"([^\"]*)\"$")
	public void i_choose_category(String category, String locator) throws Exception {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(PropertiesReader.locator_Values(locator)))));
		driver.findElement(By.xpath(PropertiesReader.locator_Values(locator))).sendKeys(PropertiesReader.test_Data_Values(category));
		Actions action= new Actions(driver);
		driver.findElement(By.xpath(PropertiesReader.locator_Values(locator))).click();
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

	}
	}



