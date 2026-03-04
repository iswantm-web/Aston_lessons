package org.Lesson_2;


public class Point_1
{
    public static void main( String[] args )

    {
        summ10_20();
    }
    public static void summ10_20() {
        int a = 10;
        int b = 5;
        boolean c;
        if (a + b >= 10 && a + b <= 20) {
            c = true;
        } else
            c = false;

        System.out.println(c);
    }
}

