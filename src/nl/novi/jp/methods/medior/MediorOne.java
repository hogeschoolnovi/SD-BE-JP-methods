package nl.novi.jp.methods.medior;

/**
 * De methode calculateSum returnt een waarde. Deze waarde kun je toewijzen aan een nieuwe variabele en andere
 * berekeningen of bewerkingen mee doen. In het voorbeeld hieronder wordt de waarde aan de variabele result toegewezen.
 *
 * Zou je de waarde niet returnen, maar direct uit printen, dan kun je er niets meer mee doen. Nu wel, we kunnen het
 * getal in een andere methode gooien en ddaar weer bewerkingen mee doen.
 *
 * Kun je een methode schrijven die het getal kwadrateert en deze returnt als integer?
 *
 * Roep deze vervolgens aan vanuit de main-methode.
 */

public class MediorOne {

    public static void main(String[] args) {
        int result = calculateSum(10, 22);

        System.out.println("De som van 10 en 12 is: " + result);

        int doubledResult = doubleNumber(result);

        System.out.println(result + " verdubbeld is: " + doubledResult);
    }

    public static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int doubleNumber(int number) {
        return number * 2;
    }


}
