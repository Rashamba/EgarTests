package ru.stqa.pft.mkb;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("http://ezdoc-dev:84/#/portal/login");
    driver.findElement(By.xpath("//div[@id='login-form']/form/mat-form-field/div/div/div")).click();
    driver.findElement(By.id("mat-input-42")).clear();
    driver.findElement(By.id("mat-input-42")).sendKeys("IKrasnoborodko");
    driver.findElement(By.id("mat-input-43")).click();
    driver.findElement(By.id("mat-input-43")).clear();
    driver.findElement(By.id("mat-input-43")).sendKeys("lugoih4T");
    driver.findElement(By.xpath("//div[@id='login-form']/form/button")).click();
    driver.findElement(By.xpath("//div[@id='wrapper']/div/fuse-content/ng-component/div/div/mat-toolbar/div[2]/h5")).click();
    driver.findElement(By.xpath("//div[@id='wrapper']/div/fuse-content/ng-component/div/div/mat-toolbar/div[3]/ez-list-btn-mkb-toolbar/create-btn/button/span")).click();
    driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-2']/ez-edit-book-dialog/ez-dictionary-edit-form/div/edit-entity-btn-toolbar/mat-toolbar/run-process-btn/button/span")).click();
    driver.findElement(By.id("mat-input-56")).click();
    driver.findElement(By.id("mat-input-56")).clear();
    driver.findElement(By.id("mat-input-56")).sendKeys("1");
    driver.findElement(By.id("mat-input-58")).click();
    driver.findElement(By.id("mat-input-58")).clear();
    driver.findElement(By.id("mat-input-58")).sendKeys("3");
    driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-2']/ez-edit-book-dialog/ez-dictionary-edit-form/div/edit-entity-btn-toolbar/mat-toolbar")).click();
    driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-2']/ez-edit-book-dialog/ez-dictionary-edit-form/div/edit-entity-btn-toolbar/mat-toolbar/complete-step-btn/button/span")).click();
    driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-2']/ez-edit-book-dialog/ez-dictionary-edit-form/div/edit-entity-btn-toolbar/mat-toolbar/verification-btn/button/span")).click();
    driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-16']/span/mat-panel-title")).click();
    driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-2']/ez-edit-book-dialog/ez-dictionary-edit-form/div/edit-entity-btn-toolbar/mat-toolbar/close-btn/button/span")).click();
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
