package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupDelitionTests extends TestBase {

  @Test
  public void testGroupDelition() {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroupe(new GroupData("test1", "test2", null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
