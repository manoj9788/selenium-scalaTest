package tests

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.scalatest._
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.selenium.WebBrowser
import pages.spreeDemo.{LoginPage, SpreeAccountPage}

class SpreeDemoSiteTest extends FeatureSpec with GivenWhenThen with Matchers with WebBrowser
  with BeforeAndAfterAll with BeforeAndAfterEach  {

  implicit val driver: WebDriver = new FirefoxDriver()

  val baseUrl = "https://spree-vapasi.herokuapp.com/login"
  lazy val loginPage = new LoginPage(driver)
  lazy val spreeAccountPage = new SpreeAccountPage(driver)

  override def beforeEach() = {
    go to (baseUrl)
  }

  override def afterAll() = {
    quit()
  }

  Feature("Spree Automation Login") {
    Scenario("Verify Home Page Element") {
      Given("I am on the Spree Vapsi Page")

      Then("Page title should be Spree Demo Site")
      pageTitle should be("Login - Spree Demo Site")
    }

    Scenario("Login with valid Credentials") {
      Given("I am on the Spree Demo Login Page")

      When("I enter valid credentials for Spree Demo page")
      loginPage.setUsername("scala@scalatest.com")
      loginPage.setPassword("password")
      loginPage.clickLoginButton()

      Then("I should be able to Login Successfully")
      assert(spreeAccountPage.isSuccessAlertPresent())

    }
  }

}
