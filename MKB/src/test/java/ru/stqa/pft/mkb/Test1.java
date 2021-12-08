package ru.stqa.pft.mkb;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1() throws Exception {
    driver.get("http://ezdoc-dev:84/#/portal/login");
    driver.findElement(By.xpath("//div[@id='login-form']/form/mat-form-field/div/div/div")).click();
    driver.findElement(By.id("mat-input-46")).clear();
    driver.findElement(By.id("mat-input-46")).sendKeys("IKrasnoborodko");
    driver.findElement(By.id("mat-input-47")).click();
    driver.findElement(By.id("mat-input-47")).clear();
    driver.findElement(By.id("mat-input-47")).sendKeys("lugoih4T");
    driver.findElement(By.xpath("//div[@id='login-form']/form/button/span")).click();
    driver.findElement(By.xpath("//div[@id='wrapper']/div/fuse-content/ng-component/div/div/mat-toolbar/div[2]/h5")).click();
    driver.findElement(By.xpath("//div[@id='mat-tab-label-4-5']/div")).click();
    driver.findElement(By.xpath("//div[@id='wrapper']/div/fuse-content/ng-component/div/div/mat-toolbar/div[3]/ez-list-btn-mkb-toolbar/create-btn/button/span")).click();
    driver.findElement(By.id("mat-input-60")).click();
    driver.findElement(By.id("mat-input-60")).clear();
    driver.findElement(By.id("mat-input-60")).sendKeys("Test1");
    driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-2']/ez-edit-book-dialog/ez-dictionary-edit-form/div/mat-horizontal-stepper/div")).click();
    driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-2']/ez-edit-book-dialog/ez-dictionary-edit-form/div/edit-entity-btn-toolbar/mat-toolbar/complete-step-btn/button/span")).click();
    driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-2']/ez-edit-book-dialog/ez-dictionary-edit-form/div/edit-entity-btn-toolbar/mat-toolbar/verification-btn/button")).click();
    driver.findElement(By.xpath("//div[4]/div")).click();
    driver.findElement(By.xpath("//div[@id='wrapper']/fuse-navbar-vertical/div[2]/fuse-navigation/div/fuse-nav-vertical-group[9]/div[2]/fuse-nav-vertical-item/a/span")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
