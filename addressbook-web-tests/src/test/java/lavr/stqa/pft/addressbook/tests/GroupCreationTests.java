package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().GetGroupList();
    //int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", null));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().GetGroupList();
    //int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after.size(),before.size()+1);
  }

}
