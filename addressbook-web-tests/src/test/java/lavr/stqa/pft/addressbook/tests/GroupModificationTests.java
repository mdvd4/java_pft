package lavr.stqa.pft.addressbook.tests;

import lavr.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by Lavr on 25.08.2016.
 */
public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification () {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().EditSelectedGroup();
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();

  }
}
