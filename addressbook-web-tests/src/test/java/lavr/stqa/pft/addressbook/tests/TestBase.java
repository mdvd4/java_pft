package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.appmanager.ApplicationMenager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Lavr on 25.08.2016.
 * Класс предок для классов тестов
 */
public class TestBase {

  protected final ApplicationMenager app = new ApplicationMenager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
