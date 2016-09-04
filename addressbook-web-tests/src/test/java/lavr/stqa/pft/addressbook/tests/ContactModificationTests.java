package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by Lavr on 04.09.2016.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification () {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("John_mod1", "Smith_mod1", "www.leningrad.spb.ru", "123-34-45-01", "123-34-45-02", "123-34-45-03", "123-34-45-03", "john@mail.com", "john2@mail.com", "john3@mail.com"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }

}
