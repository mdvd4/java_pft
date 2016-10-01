package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Lavr on 04.09.2016.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("John", "Smith2", "[none]", "www.leningrad.spb.ru", "123-34-45-01", null, null, "123-34-45-03", "john@mail.com", null, null));
    }
    List<ContactData> before = app.getContactHelper().GetContactList();
    app.getContactHelper().editContact();
    // попоробовать исправитьть добавить ID
    ContactData contact = new ContactData("John", "Smith_mod1", null, null, "123-34-45-99", "123-34-45-02", null, null, null, "john@mail2.com", null);
    app.getContactHelper().fillContactForm(contact, false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().GetContactList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(0); //редактируем всегда первый контакт
    before.add(contact);
    Comparator<? super ContactData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }

}
