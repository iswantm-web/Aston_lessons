package org.Lesson_2;

public class Point_8 {
  public static void main(String[] Args) {
    quatr();
  }

  public static void quatr() {
    int n = 5;
    int[][] table = new int[n][n];
    for (int i = 0; i < n; i++) {
      table[i][i] = 1;
    }
    for (int i = 0; i < n; i++) {

      table[i][n - 1 - i] = 1;
    }

    System.out.println("Получившийся массив:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(table[i][j] + "  ");
      }
      System.out.println();
    }
  }
}
