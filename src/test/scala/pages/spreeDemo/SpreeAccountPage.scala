package pages.spreeDemo

import org.openqa.selenium.{By, WebDriver}

class SpreeAccountPage(private var driver: WebDriver) {

  private var lnkSuccessMessage: By = By.cssSelector("#content > div.alert.alert-success")

  def isSuccessAlertPresent(): Boolean = {

    driver.findElement(lnkSuccessMessage).isDisplayed()

  }

}
