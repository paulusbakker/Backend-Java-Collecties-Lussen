package src;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] decimalNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] stringNumbers = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen"};
        int userInput;
        String yesOrNo;
        char antwoord;
        boolean verplichteOpdrachtBoolean;
        Translator translate = new Translator(decimalNumbers, stringNumbers);
        do {

            // geef getal in
            do {
                System.out.println("Geef een heel getal onder 10");
                Scanner in = new Scanner(System.in);
                userInput = in.nextInt();
            } while (userInput > 9 || userInput < 0);

            System.out.println(translate.translator(userInput));

            // nog een keer?
            do {
                System.out.println("Nog een vertaling (j/n)?");
                Scanner in = new Scanner(System.in);
                yesOrNo = in.nextLine();
                antwoord=yesOrNo.toLowerCase().charAt(0);
            } while (antwoord != 'j' && antwoord != 'n');
            verplichteOpdrachtBoolean = antwoord == 'j';

        } while (verplichteOpdrachtBoolean);
    }

}
