package tests

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.scalatest._
import org.scalatestplus.selenium.WebBrowser
import org.scalatest.matchers.should.Matchers
import pages.google.{GoogleSearchPage, SearchResultsPage}

class GoogleSearchTest extends FeatureSpec with GivenWhenThen with Matchers with WebBrowser
  with BeforeAndAfterAll with BeforeAndAfterEach  {

  implicit val driver: WebDriver = new ChromeDriver()

  val baseUrl = "https://www.google.com/"
  lazy val googleSearchPage = new GoogleSearchPage(driver)
  lazy val searchResultsPage = new SearchResultsPage(driver)

  override def beforeEach() = {
    go to (baseUrl)
  }

  override def afterAll() = {
    quit()
  }

  Feature("Google Search SpreeDemoSiteTest") {
    Scenario("Verify Title") {
      Given("I am on the Google Search Page")

      Then("Page title should be Google")
      pageTitle should be("Google")
    }

    Scenario("Search for Selenium") {
      Given("I am on the Google Search Page")

      When("I Search for Selenium")
      googleSearchPage.searchFor("Selenium")

      Then("Search results should contain Selenium Result")
      assert(searchResultsPage.isLnkSeleniumPresent())
    }
  }

}
