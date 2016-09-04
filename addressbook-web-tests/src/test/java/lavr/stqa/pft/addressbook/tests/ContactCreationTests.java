package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("John", "Smith", null, "www.leningrad.spb.ru", "123-34-45-01", null, null, "123-34-45-03", "john@mail.com", null, null), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }

}
