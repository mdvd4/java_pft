package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", null));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before+1);
  }

}
