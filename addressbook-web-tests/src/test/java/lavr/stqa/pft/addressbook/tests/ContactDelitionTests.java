package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Lavr on 25.08.2016.
 */
public class ContactDelitionTests extends TestBase {

  @Test
  public void testContactDelition() {
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("John", "Smith", "[none]", "www.leningrad.spb.ru", "123-34-45-01", null, null, "123-34-45-03", "john@mail.com", null, null));
    }
    List<ContactData> before = app.getContactHelper().GetContactList();
    app.goTo().gotoHomePage();
    app.getContactHelper().selectContact(before.size() - 1);
    app.getContactHelper().deleteSelectedContact();
    app.goTo().gotoHomePage();
    List<ContactData> after = app.getContactHelper().GetContactList();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() - 1);
    Assert.assertEquals(before, after);
  }
}
