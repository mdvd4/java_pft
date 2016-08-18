package lavr.stqa.pft.sandbox;

/**
 * Created by Lavr on 18.08.2016.
 * Класс описывающий точку на плоскости
 */

public class Point {
  public double x;
  public double y;

  public Point (double x, double y) {
    this.x=x;
    this.y=y;
    
  }

  public double distance(Point point) {
    /** метод вычисляющий дистанцию между текущей точкой и точкой point */
    return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
  }

  public String texttoprint (Point point) {
    /** метод формирующий текст вида  "растояние между текущей точкой  (x1,y1), и точкой (x2,y2) равно" */
    return "растояние между текущей точкой (" + this.x + "," + this.y + "), и точкой (" + point.x + "," + point.y + ") равно ";
  }

  public String textdistance (Point point) {
    /** метод формирующий текст вида  "растояние между текущей точкой  (x1,y1), и точкой (x2,y2) равно"  и вычисляющий расстояние между текущей точкой и точкой point*/
    return "растояние между текущей точкой (" + this.x + "," + this.y + "), и точкой (" + point.x + "," + point.y + ") равно "+  Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
  }
}
