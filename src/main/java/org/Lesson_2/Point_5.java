package org.Lesson_2;

public class Point_5 {
  public static void main(String[] Args) {
    massiv();
  }

  public static void massiv() {
    int[] a = {0, 1, 1, 0, 0, 1, 1, 0};
    for (int i = 0; i < a.length; i++) {
      if (a[i] == 0) {
        a[i] = 1;
      } else {
        a[i] = 0;
      }
    }
  }
}
