package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.appmanager.ApplicationMenager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Lavr on 25.08.2016.
 * Класс предок для классов тестов
 */
public class TestBase {

  String browser = BrowserType.FIREFOX;
  //String browser = BrowserType.CHROME;
  //String browser = BrowserType.IE;


  protected final ApplicationMenager app = new ApplicationMenager(browser);

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
