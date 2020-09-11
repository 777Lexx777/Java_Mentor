package Project_Console_Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArabicCalculator {
    Scanner scanner = new Scanner(System.in);
    String operation = null;
    private int y = 0;
    private int z = 0;
    private int cont = 0;

    public  void   arabicCalculation(){

        while (true) {
              System.out.println("Введите первое число от 0 до 9 ;");
              try {
                  y = scanner.nextInt();
                  while (y < 0 || y > 9) {
                      System.out.println("Вы ввели не верное значение... ");
                      System.out.println("Введите первое число от 0 до 9 ;");
                      y = scanner.nextInt();
                  }
              } catch (NumberFormatException e) { }

              System.out.println("Введите действие: +, -, * или / ;");
                    operation = scanner.next();
                          while (! (operation.equals("+") || operation.equals("-") ||
                                    operation.equals("*") || operation.equals("/"))) {
                              System.out.println("Вы ввели не верное значение ");
                              System.out.println("Введите действие: +, -, * или / ;");
                            operation = scanner.next();
                          }

              System.out.println("Введите второе число");
                  try {
                      z = scanner.nextInt();
                          while (z < 0 || z > 9) {
                              System.out.println("Вы ввели не верное значение... ");
                              System.out.println("Введите первое число от 0 до 9 ;");
                            z = scanner.nextInt();
                          }
                  } catch (InputMismatchException e) {  }

              System.out.print(" Input: " + "\n\n " + y + " " + operation + " " + z);

              if (operation.equals("+")) {
                  System.out.println("\n\n Output: " + "\n\n " + (y + z));
              }
              if (operation.equals("-")) {
                  System.out.println("\n\n Output: " + "\n\n " + (y - z));
              }
              if (operation.equals("*")) {
                  System.out.println("\n\n Output: " + "\n\n " + (y * z));
              }
              if (operation.equals("/")) {
                  System.out.println("\n\n Output: " + "\n\n " + (y / z));
              }

              System.out.print("\n  Закончить вычисления нажмите - 2; " +
                                    "\n  Для продолжения вычисления, нажмите любую другую клавишу;  ");

              cont = scanner.nextInt();
              if (cont == 2) {break;}
        }
    }
}
