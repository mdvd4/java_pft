package lavr.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static lavr.stqa.pft.sandbox.МуDistanceProgram.distance;

/**
 * Created by Lavr on 22.08.2016.
 * Тесты проверки вычисления дистанции
 */
public class DistanceTests {

  Point p1 = new Point(0, 0);
  Point p2 = new Point(2, 0);
  Point p3 = new Point(0, 2);
  Point p4 = new Point(-4, 8);

  @Test
  public void testDistanceAxisX () {
    Assert.assertEquals( distance(p1,p2), 2.0);
  }

  @Test
  public void testDistanceAxisY () {
    Assert.assertEquals( distance(p1,p3), 2.0);
  }

  @Test
  public void testDistanceAxisXY () {
    Assert.assertEquals( distance(p2,p4), 10.0);
  }
}
