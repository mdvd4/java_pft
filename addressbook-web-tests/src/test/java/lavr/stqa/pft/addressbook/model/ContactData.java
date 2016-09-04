package lavr.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private String group;
  private final String address;
  private final String fhonehome;
  private final String fhonemobile;
  private final String fonework;
  private final String fhonefax;
  private final String email;
  private final String email2;
  private final String email3;

  public ContactData(String firstname, String lastname, String group, String address, String fhonehome, String fhonemobile, String fonework, String fhonefax, String emal, String email2, String email3) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.group = group;
    this.address = address;
    this.fhonehome = fhonehome;
    this.fhonemobile = fhonemobile;
    this.fonework = fonework;
    this.fhonefax = fhonefax;
    this.email = emal;
    this.email2 = email2;
    this.email3 = email3;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getFhonehome() {
    return fhonehome;
  }

  public String getFhonemobile() {
    return fhonemobile;
  }

  public String getFonework() {
    return fonework;
  }

  public String getFhonefax() {
    return fhonefax;
  }

  public String getEmail() {
    return email;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getGroup() {
    return group;
  }
}
