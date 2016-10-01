package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Lavr on 04.09.2016.
 */
public class ContactModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().homePage();
    if (app.contact().list().size() == 0) {
      app.contact().create(new ContactData("John", "Smith", "[none]", "www.leningrad.spb.ru", "123-34-45-01", null, null, "123-34-45-03", "john@mail.com", null, null));
    }
  }

  @Test
  public void testContactModification() {
    List<ContactData> before = app.contact().list();
    int index = before.size() - 1;
    ContactData contact = new ContactData(before.get(index).getId(), "John", "Smith_mod1", null, null, "123-34-45-99", "123-34-45-02", null, null, null, "john@mail2.com", null);
    app.contact().modify(index, contact);
    List<ContactData> after = app.contact().list();
    Assert.assertEquals(after.size(), before.size());

    before.remove(index); //редактируем последний контакт
    before.add(contact);
    Comparator<? super ContactData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }

}
