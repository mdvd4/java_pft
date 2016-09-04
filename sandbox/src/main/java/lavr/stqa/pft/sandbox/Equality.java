package lavr.stqa.pft.sandbox;

/**
 * Created by Lavr on 04.09.2016.
 */
public class Equality {

  public static void main (String[] args) {
    String s1 = "firefox";
    String s2 = s1;
    String s3 = new String(s1);

    System.out.println(s1 == s2); // Сравниваем ссылки на объекты, s1  и s2 ссылаются на один и тот же объект, компилятор присваивает s1 и s2 ссылку на один и тотже объект строка "firefox"
    System.out.println(s1.equals(s2)); // Объект один содержимое равно.
    System.out.println(s1 == s3); // Сравниваем разные обекты, ссылки на объекты разные, поскольку разные объекты,  s3 новый объект
    System.out.println(s1.equals(s3));  // Содержимое объектов одинаковое:  строка "firefox"
  }
}
