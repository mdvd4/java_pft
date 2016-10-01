package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.appmanager.ApplicationMenager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Lavr on 25.08.2016.
 * Класс предок для классов тестов
 */
public class TestBase {

  //String browser = BrowserType.FIREFOX;
  static String browser = BrowserType.CHROME;
  //String browser = BrowserType.IE;


  protected static final ApplicationMenager app = new ApplicationMenager(browser);

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
  }

  @AfterSuite
  public void tearDown() {
    app.stop();
  }


}
