package Project_Console_Calculator;

import java.util.HashMap;
import java.util.Map;

public class ListForRomanCalculator {

    private Map<String, Integer> calculatorNumber = new HashMap<>();
    private String [] calculatorNumber2 = {"1","2","3","4","5","6","7","8","9","10"};

    public String  calculatorNumberArabicCalculator(String name){
        String numberAr = name;
        return numberAr;
    }

    public String  calculatorNumberRoman(String name){

                calculatorNumber.put("I",1);
                calculatorNumber.put("II",2);
                calculatorNumber.put("III",3);
                calculatorNumber.put("IV",4);
                calculatorNumber.put("V",5);
                calculatorNumber.put("VI",6);
                calculatorNumber.put("VII",7);
                calculatorNumber.put("VIII",8);
                calculatorNumber.put("IX",9);
                calculatorNumber.put("X",10);

        if (calculatorNumber.containsKey(name)) {

            return name;
        }else {
            return null;
        }
    }
    public Integer  calculatorNumberArabic(String name){

                calculatorNumber.put("I",1);
                calculatorNumber.put("II",2);
                calculatorNumber.put("III",3);
                calculatorNumber.put("IV",4);
                calculatorNumber.put("V",5);
                calculatorNumber.put("VI",6);
                calculatorNumber.put("VII",7);
                calculatorNumber.put("VIII",8);
                calculatorNumber.put("IX",9);
                calculatorNumber.put("X",10);

        if (calculatorNumber.containsKey(name)) {
            return calculatorNumber.get(name);
        }else {
            return null;
        }
    }
}
