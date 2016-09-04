package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDelitionTests extends TestBase {

  @Test
  public void testGroupDelition() {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroupe(new GroupData("test1", "test2", null));
    }
    List<GroupData> before = app.getGroupHelper().GetGroupList();
    app.getGroupHelper().selectGroup(0);
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().GetGroupList();
    Assert.assertEquals(after.size(),before.size()-1);
  }

}
