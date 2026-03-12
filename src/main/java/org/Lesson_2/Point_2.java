package org.Lesson_2;


public class Point_2 {
  public static void main(String[] Args) {
    plusMinus();
  }

  public static void plusMinus() {
    int a = -50;
    String b;
    if (a >= 0) {
      b = "положительное";
    } else
      b = "отрицательное";
    System.out.println(b);
  }
}
