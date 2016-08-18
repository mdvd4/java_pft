package lavr.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Frodo Baggins");

    double l = 6;
    System.out.println("площадь квадрата со стороной " + l + " равна " + area(l));

    double a = 3;
    double b = 4;
    System.out.println("площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area(a, b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }

}