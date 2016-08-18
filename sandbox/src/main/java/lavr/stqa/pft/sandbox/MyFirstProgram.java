package lavr.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    Point point1 = new Point(1, 0);
    Point point2 = new Point(2, 0);
    Point point3 = new Point(-1, 0);
    distance(point1, point2);
    distance(point2, point3);

    hello("world");

    Square s = new Square(6);
    System.out.println("площадь квадрата со стороной " + s.l + " равна " + s.area());

    Rectangle r = new Rectangle(5, 6);
    System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

  }

  public static void distance(Point p1, Point p2) {
    /** Функция вычисляющая дистанцию между двумя точками*/
    String text1 = "растояние между точками [" + p1.x + "," + p1.y + "], [" + p2.x + "," + p2.y + "] равно ";
    double distanse = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    System.out.println(text1 + distanse);
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}