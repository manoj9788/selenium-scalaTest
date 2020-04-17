package pages.google

import org.openqa.selenium.{By, Keys, WebDriver}

class GoogleSearchPage(private var driver: WebDriver) {

  private var searchField: By = By.name("q")

  def searchFor(searchTerm: String): Unit ={

    driver.findElement(searchField).sendKeys(searchTerm + Keys.RETURN)
  }




}
