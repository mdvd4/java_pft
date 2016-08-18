package lavr.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Frodo Baggins");

    Square s = new Square(5);
    System.out.println("площадь квадрата со стороной " + s.l + " равна " + s.area());

    Rectangle r = new Rectangle(3, 4);
    System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }



}