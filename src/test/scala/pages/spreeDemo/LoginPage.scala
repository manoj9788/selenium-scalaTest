package pages.spreeDemo

import org.openqa.selenium.{By, WebDriver}

class LoginPage(private var driver: WebDriver) {

  private var usernameField: By = By.id("spree_user_email")

  private var passwordField: By = By.id("spree_user_password")

  private var loginButton: By = By.cssSelector("[name=commit]")

  def setUsername(username: String): Unit = {
    driver.findElement(usernameField).sendKeys(username)
  }

  def setPassword(password: String): Unit = {
    driver.findElement(passwordField).sendKeys(password)
  }

  def clickLoginButton(): Unit = {
    driver.findElement(loginButton).click()
  }

}
