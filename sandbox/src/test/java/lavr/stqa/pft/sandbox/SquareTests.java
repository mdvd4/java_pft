package lavr.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Lavr on 22.08.2016.
 * Создан класс тестов Square
 */
public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    //assert s.area() == 25;
    Assert.assertEquals(s.area(), 25.0); // более детальное сообщение об ошибке

  }

}
