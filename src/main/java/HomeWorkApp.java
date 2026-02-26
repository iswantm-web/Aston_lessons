public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        String a = "Banana";
        String b = "Orange";
        String c = "Apple";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void checkSumSign() {
        int a = -7;
        int b = 6;
        int c = a + b;
        if (c > 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }

    public static void printColor() {
        int p = 50;
        if (p <= 0) {
            System.out.println("красный");
        }
        if (p > 0 && p <= 100) {
            System.out.println("желтый");
        }
        if (p > 100) {
            System.out.println("зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 50;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("b > a");
        }
    }
}
