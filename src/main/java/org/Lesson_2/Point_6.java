package org.Lesson_2;

public class Point_6 {
  public static void main(String[] Args) {
    pustMass();
  }

  public static void pustMass() {
    int[] a = new int[100];
    for (int i = 0; i < a.length; i++) {
      a[i] = i + 1;
      System.out.println(a[i]);
    }
  }
}
