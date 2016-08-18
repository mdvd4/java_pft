package lavr.stqa.pft.sandbox;

/**
 * Created by Lavr on 18.08.2016.
 * Создан  запускаемый класс,
 * вычисление расстояния между двумя точками с помощью функции distance;
 * ычисление расстояния между двумя точками с помощью метода distance, класса Point;
 */

public class МуDistanceProgram {
  public static void main(String[] args) {

    /** Примеры координат точек*/
    Point p1 = new Point(1, 0);
    Point p2 = new Point(2, 0);
    Point p3 = new Point(-1, 0);
    Point p4 = new Point(-4, 8);

    /** Расчёт растояния с помощью функции distance(Point p1, Point p2) */
    System.out.println("Расчёт растояния с помощью функции distance(Point p1, Point p2)");
    System.out.println(texttoprint(p1, p2) + distance(p1, p2));
    System.out.println(texttoprint(p1, p3) + distance(p1, p3));
    System.out.println(texttoprint(p2, p4) + distance(p2, p4));
    System.out.println(texttoprint(p2, p3) + distance(p2, p3));

    /** Расчёт растояния с помощью метода distance */
    System.out.println("Расчёт растояния с помощью метода distance ");
    System.out.println(p1.texttoprint(p2) + p1.distance(p2));
    System.out.println(p2.texttoprint(p2) + p2.distance(p2));
    System.out.println(p1.texttoprint(p3) + p1.distance(p3));
    System.out.println(p2.texttoprint(p4) + p2.distance(p4));
    System.out.println(p2.texttoprint(p3) + p2.distance(p3));

    /** объединение методов distance и texttoprint */
    System.out.println("Расчёт растояния с помощью метода textdistance ");
    System.out.println(p1.textdistance(p2));
    System.out.println(p2.textdistance(p2));
    System.out.println(p1.textdistance(p3));
    System.out.println(p2.textdistance(p4));
    System.out.println(p2.textdistance(p3));


  }


  public static String texttoprint(Point p1, Point p2) {
    /** Функция формирующая текст вида "растояние между точками [x1,y1], [x2,y2] равно"*/
    String text1 = "растояние между точками [" + p1.x + "," + p1.y + "], [" + p2.x + "," + p2.y + "] равно ";
    return text1;
  }


  public static double distance(Point p1, Point p2) {
    /** Функция вычисляющая дистанцию между двумя точками*/
    double distanse = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    return distanse;
  }
}
