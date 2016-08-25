package lavr.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation () {
      initContactCreation();
      fillContactForm(new ContactData("John", "Smith", "www.leningrad.spb.ru", "123-34-45-01", "123-34-45-02", "123-34-45-03", "123-34-45-03", "john@mail.com", "john2@mail.com", "john3@mail.com"));
      submitContactCreation();
      returnToHomePage();
    }

}
