package pages.google

import org.openqa.selenium.{By, WebDriver}

class SearchResultsPage(private var driver: WebDriver) {

  private var lnkSelenium: By = By.linkText("About Selenium")

  def isLnkSeleniumPresent(): Boolean = {

    driver.findElement(lnkSelenium).isDisplayed()

  }

}
