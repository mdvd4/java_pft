package lavr.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static lavr.stqa.pft.sandbox.МуDistanceProgram.distance;

/**
 * Created by Lavr on 22.08.2016.
 * Тесты проверки вычисления дистанции
 */
public class DistanceTests {

  @Test
  public void testDistanceAxisX () {
    Point p1 = new Point(0, 0);
    Point p2 = new Point(1, 0);
    Assert.assertEquals( distance(p1,p2), 1.0);
  }

  @Test
  public void testDistanceAxisY () {
    Point p1 = new Point(0, 1);
    Point p2 = new Point(0, 2);
    Assert.assertEquals( distance(p1,p2), 1.0);
  }

  @Test
  public void testDistanceAxisXY () {
    Point p1 = new Point(2, 0);
    Point p2 = new Point(-4, 8);
    Assert.assertEquals( distance(p1,p2), 10.0);
  }
}
