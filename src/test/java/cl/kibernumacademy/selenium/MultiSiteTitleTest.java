package cl.kibernumacademy.selenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSiteTitleTest {
  private WebDriver driver;

  @BeforeEach
  void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
  }

  @AfterEach
  void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  void validarTituloGoogle() {
    driver.get("https://www.google.com");
    assertTrue(driver.getTitle().contains("Google"));
  }

  @Test
  void validarTituloGitHub() {
    driver.get("https://www.github.com");
    assertTrue(driver.getTitle().contains("GitHub"));
  }

  @Test
  void validarTituloStackOverflow() {
    driver.get("https://stackoverflow.com");
    assertTrue(driver.getTitle().contains("Stack Overflow"));
  }

}
