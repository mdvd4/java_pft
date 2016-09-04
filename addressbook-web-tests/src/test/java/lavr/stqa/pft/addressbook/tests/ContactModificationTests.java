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
    app.getContactHelper().fillContactForm(new ContactData("John_mod1", "Smith_mod1", null, "123-34-45-99", "123-34-45-02", null,null, null,"john@mail2.com",null));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }

}
