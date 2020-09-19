package Project_Console_Calculator;

public class ArabicCalculator  {

    public  void   arabicCalculation(String firstNumber, String secondNumber, String calculator ){
         int a = Integer.parseInt(firstNumber);
         int b = Integer.parseInt(secondNumber);

            if (calculator.contains("-")) {
                System.out.print(" Input: " + "\n\n " + a + " " + " - " + " " + b);
                System.out.println("\n\n Output: " + "\n\n " + (a - b));
            }
            if (calculator.contains("+")) {
                System.out.print(" Input: " + "\n\n " + a + " " + " + " + " " + b);
                System.out.println("\n\n Output: " + "\n\n " + (a + b));
            }
            if (calculator.contains("*")) {
                System.out.print(" Input: " + "\n\n " + a + " " + " * " + " " + b);
                System.out.println("\n\n Output: " + "\n\n " + (a * b));
            }
            if (calculator.contains("/")) {
                System.out.print(" Input: " + "\n\n " + a + " " + " / " + " " + b);
                System.out.println("\n\n Output: " + "\n\n " + (a / b));
            }

        }
}
