package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by Lavr on 25.08.2016.
 */
public class ContactDelitionTests extends TestBase {

  @Test
  public void testContactDelition() {
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("John", "Smith", null, "www.leningrad.spb.ru", "123-34-45-01", null, null, "123-34-45-03", "john@mail.com", null, null), true);
    }
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getNavigationHelper().gotoHomePage();
  }
}
