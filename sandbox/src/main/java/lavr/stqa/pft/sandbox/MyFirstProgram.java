package lavr.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    hello("world");

    Square s = new Square(6);
    System.out.println("площадь квадрата со стороной " + s.l + " равна " + s.area());

    Rectangle r = new Rectangle(5, 6);
    System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

  }


  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}