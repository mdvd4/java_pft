package lavr.stqa.pft.addressbook.appmanager;

import lavr.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lavr on 25.08.2016.
 * Возможно нужно перенести метод returnToHomePage в NavigationHelper
 */
public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  // метод  заполняющий форму контакта с Select  и проверкой: Форма создания или редактирования
  public void fillContactForm(ContactData contactData, boolean creation) {
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


    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void initCreation() {
    click(By.linkText("add new"));
  }

  private void deleteSelectedContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    alertAccept();
  }

  private void selectContact(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  private void editContact(int index) {
    wd.findElements(By.xpath("//img[@src='icons/pencil.png']")).get(index).click(); // дай мне все "карандашики" (icons/pencil.png), кликни на нужный (index) мне
  }

  private void submitContactModification() {
    click(By.xpath("//div[@id='content']/form[1]/input[22]"));
  }

  public void create(ContactData contact) {
    initCreation();
    fillContactForm(contact, true);
    submitContactCreation();
    returnToHomePage();
  }

  public void modify(int index, ContactData contact) {
    editContact(index);
    fillContactForm(contact, false);
    submitContactModification();
    returnToHomePage();
  }

  public void delete(int index) {
    selectContact(index);
    deleteSelectedContact();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public List<ContactData> list() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.cssSelector("tr[name=entry]"));
    for (WebElement element : elements) {
      String lastname = element.findElement(By.xpath("td[2]")).getText();
      String firstname = element.findElement(By.xpath("td[3]")).getText();
      int id = Integer.parseInt(element.findElement(By.xpath("td/input")).getAttribute("value"));
      ContactData contact = new ContactData(id, firstname, lastname, null, null, null, null, null, null, null, null, null);
      contacts.add(contact);
    }
    return contacts;
  }
}
