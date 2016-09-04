package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Lavr on 25.08.2016.
 */
public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroupe(new GroupData("test1", "test2", null));
    }
    List<GroupData> before = app.getGroupHelper().GetGroupList();
    app.getGroupHelper().selectGroup(before.size()-1);
    app.getGroupHelper().EditSelectedGroup();
    app.getGroupHelper().fillGroupForm(new GroupData("Test_mod1", null, "Test_mod3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().GetGroupList();
    Assert.assertEquals(after.size(),before.size());
  }
}
