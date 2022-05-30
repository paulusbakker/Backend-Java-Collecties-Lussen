package src;

import java.util.HashMap;

public class Translator {
    int[] decimalNumbers;
    String[] stringNumbers;

    // Constructor
    Translator(int[] decimalNumbers, String[] stringNumbers) {
        this.decimalNumbers = decimalNumbers;
        this.stringNumbers = stringNumbers;
    }

    // Method
    public String translator(int userInput) {
        HashMap<Integer, String> list = new HashMap<>();

        for (int number : this.decimalNumbers) {
            list.put(number, this.stringNumbers[number - 1]);
        }
        return list.get(userInput);
    }
}
