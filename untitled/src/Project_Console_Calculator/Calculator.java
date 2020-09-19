package Project_Console_Calculator;

import java.util.Scanner;

public class Calculator {
    private String[] subStr;
    protected String a;
    protected String b;
    protected String calculator;
    private String continueCalculating ;

    public void calculator(){

        ListForRomanCalculator listForRomanCalculator = new ListForRomanCalculator();
        ArabicCalculator arabicCalculator = new ArabicCalculator();
        RomanCalculator romanCalculator = new RomanCalculator();

        while (true) {

            System.out.println("\n  Введите операцию с двумя числами: a+b, a-b, a*b или a/b " +
                    "\n  ВНИМАНИЕ: \n" +
                    "  1.Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.\n" +
                    "  2.Калькулятор принимает на вход числа от 1 до 10 включительно,  \n" +
                    "    либо римские от I <-(эта буква I) до X (ВСЕ БУКВЫ ЗАГЛАВНЫЕ),не более. \n" +
                    "  3.Калькулятор умеет работать только с целыми числами.\n" +
                    "  4.Калькулятор умеет работать только с арабскими или  только римскими цифрами одновременно,\n " +
                    "    при вводе строки вроде 3 + II будет ошибка.\n");

            Scanner scanner = new Scanner(System.in);

            calculator = scanner.nextLine();

            if (calculator.contains("-")) subStr = calculator.split("-");

            if (calculator.contains("/")) subStr = calculator.split("/");

            if (calculator.contains("+")) subStr = calculator.split("\\+");

            if (calculator.contains("*")) subStr = calculator.split("\\*");

            a = subStr[0];
            b = subStr[1];

            try {

                if  (((a.equals(listForRomanCalculator.calculatorNumberRoman(a)))) &&
                        ((b.equals(listForRomanCalculator.calculatorNumberRoman(b))))) {
                          romanCalculator.romanCalculation(a,b,calculator);

                } else if((a.equals(listForRomanCalculator.calculatorNumberArabicCalculator(a)) &&
                             (b.equals(listForRomanCalculator.calculatorNumberArabicCalculator(b))))){
                               arabicCalculator.arabicCalculation(a,b,calculator);
            }else {
                  throw new Exception("Числa  должны быть от  'I'<-(эта буква I) до 'X' (ВСЕ БУКВЫ ЗАГЛАВНЫЕ) ");
                  }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }

            System.out.print("\n  Закончить вычисления нажмите - q или Q; " +
                    "\n  Для продолжения вычисления, нажмите любую другую клавишу;  ");

            continueCalculating = scanner.next();
            if (continueCalculating.equalsIgnoreCase("q")) break;
        }
    }
}
