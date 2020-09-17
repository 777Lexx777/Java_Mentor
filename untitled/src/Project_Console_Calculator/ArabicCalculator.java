package Project_Console_Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArabicCalculator {
    private String strAr;
    private String[] subStr;
    private String cont ;
    private int a;
    private int b;

    public  void   arabicCalculation(){

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n  Введите операцию с двумя числами: a + b, a - b, a * b или a / b " +
                    "\n  ВНИМАНИЕ: числа от  1 до 10 ;");
            strAr = scanner.nextLine();

            if (strAr.contains("-")) subStr = strAr.split("-");

            if (strAr.contains("/")) subStr = strAr.split("/");

            if (strAr.contains("+")) subStr = strAr.split("\\+");

            if (strAr.contains("*")) subStr = strAr.split("\\*");

            a = Integer.parseInt(subStr[0]);
            b = Integer.parseInt(subStr[1]);

            try {
                if (a < 1 || a > 10 || b < 1 || b > 10 ) {
                    throw new Exception("Числa  должны быть от  1 до 10 ");
                }

                if (strAr.contains("-")) {
                    System.out.print(" Input: " + "\n\n " + a + " " + " - " + " " + b);
                    System.out.println("\n\n Output: " + "\n\n " + (a - b));
                }
                if (strAr.contains("+")) {
                    System.out.print(" Input: " + "\n\n " + a + " " + " + " + " " + b);
                    System.out.println("\n\n Output: " + "\n\n " + (a + b));
                }
                if (strAr.contains("*")) {
                    System.out.print(" Input: " + "\n\n " + a + " " + " + " + " " + b);
                    System.out.println("\n\n Output: " + "\n\n " + (a * b));
                }
                if (strAr.contains("/")) {
                    System.out.print(" Input: " + "\n\n " + a + " " + " / " + " " + b);
                    System.out.println("\n\n Output: " + "\n\n " + (a / b));
                }
                System.out.print("\n  Закончить вычисления нажмите - q или Q; " +
                        "\n  Для продолжения вычисления, нажмите любую другую клавишу;  ");

                cont = scanner.next();
                if (cont.equalsIgnoreCase("q")) break;

            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
