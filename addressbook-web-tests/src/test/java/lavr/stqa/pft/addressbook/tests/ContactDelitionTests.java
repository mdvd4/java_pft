package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.appmanager.HelperBase;
import org.testng.annotations.Test;

/**
 * Created by Lavr on 25.08.2016.
 */
public class ContactDelitionTests extends TestBase {

  @Test
  public void testContactDelition() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getNavigationHelper().gotoHomePage();
  }
}
