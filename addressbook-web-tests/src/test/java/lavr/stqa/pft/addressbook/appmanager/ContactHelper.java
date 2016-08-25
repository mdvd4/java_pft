package lavr.stqa.pft.addressbook.appmanager;

import lavr.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Lavr on 25.08.2016.
 * Возможно нужно перенести метод returnToHomePage в NavigationHelper
 */
public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getFhonehome());
    type(By.name("mobile"), contactData.getFhonemobile());
    type(By.name("work"), contactData.getFonework());
    type(By.name("fax"), contactData.getFhonefax());
    type(By.name("email"), contactData.getEmail());
    type(By.name("email2"), contactData.getEmail2());
    type(By.name("email3"), contactData.getEmail3());
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }
}
