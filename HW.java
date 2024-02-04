public class HW {
    public static void main(String[] args) {

    }

//    public static void max(int num) {
//        String s = "";
//        String[] base1 = {"", "one", "two", "", "", "", "", "", "", "nine"};
//        String[] base2 = {"", "", "twenty", "", "", "", "", "", "", "ninety"};
//        String[] base3 = {"", "eleven", "", "", "", "", "", "", "", "nineteen"};
//
//        if (num > 0 && num < 10)
//            s = base1[num];
//        else if (num > 10 && num < 20)
//            s = base3[num % 10];
//        else if (num > 19 && num < 100)
//            s = base2[num / 10] + " " + base1[num % 10];
//        else if (num > 99 && num < 1000)
//            s = base1[num / 100] + " hundred " + base2[(num % 100) / 10] + " " + base1[num % 10];
//        else if (num > 999 && num < 10000)
//            s = base1[num / 1000] + " thousand " + base1[(num % 1000) / 100] + " hundred "
//                    + base2[(num % 100) / 10] + " " + base1[num % 10];
//        else if (num > 9999 && num < 1000000)
//            s = maxHelper(num / 1000) + " thousand " + maxHelper(num % 1000);
//        else if (num > 999999 && num < 1000000000)
//            s = maxHelper(num / 1000000) + " million " + maxHelper(num % 1000000);
//
//        System.out.println(s);
//    }
//
//    private static String maxHelper(int num) {
//        String s = "";
//        String[] base1 = {"", "one", "two", "", "", "", "", "", "", "nine"};
//        String[] base2 = {"", "", "twenty", "", "", "", "", "", "", "ninety"};
//        String[] base3 = {"", "eleven", "", "", "", "", "", "", "", "nineteen"};
//
//        if (num > 0 && num < 10)
//            s = base1[num];
//        else if (num > 10 && num < 20)
//            s = base3[num % 10];
//        else if (num > 19 && num < 100)
//            s = base2[num / 10] + " " + base1[num % 10];
//        else if (num > 99 && num < 1000)
//            s = base1[num / 100] + " hundred " + base2[(num % 100) / 10] + " " + base1[num % 10];
//        else if (num > 999 && num < 10000)
//            s = base1[num / 1000] + " thousand " + base1[(num % 1000) / 100] + " hundred "
//                    + base2[(num % 100) / 10] + " " + base1[num % 10];
//        return s;
//    }
//public static void Triangle1(int n) {
//    for (int i = 0; i < n; i++) {
//        for (int j = 0; j <= i; j++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//}

//    public static void Triangle2(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    public static void Triangle2(int n) {
//        for (int i = 0; i < n; i++) {
//            int number = 1;
//            for (int j = 0; j <= i; j++) {
//                System.out.print(number + " ");
//                number = number * (i - j) / (j + 1);
//            }
//            System.out.println();
//        }
//    }
//public static void Triangle4(int height, int base) {
//    for (int i = 0; i < height; i++) {
//        for (int j = 0; j <= i * base / height; j++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//}
}


