package nl.novi.jp.methods.medior;

/**
 * De methode calculateSum returnt een waarde. Deze waarde kun je toewijzen aan een nieuwe variabele en andere
 * berekeningen of bewerkingen mee doen. In het voorbeeld hieronder wordt de waarde aan de variabele result toegewezen.
 *
 * Zou je de waarde niet returnen, maar direct printen, dan kun je er niets meer mee doen. Nu wel, we kunnen het
 * getal in een andere methode gooien en daar weer bewerkingen mee doen.
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

        int squaredNumber = squareNumber(doubledResult);

        System.out.println(doubledResult + " in het kwadraat is: " + squaredNumber);
    }

    public static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int doubleNumber(int number) {
        return number * 2;
    }

    // De squareNumber-methode:
    // private static = de "acces modifier" waarmee je de beschikbaarheid van de methode reguleert. Dit komt later in de cursus nog aan bod. Je mag hier ook "public static" invullen.
    // int = de return waarde van de methode. We gebruiken hier "int", waarmee we aangeven dat we in deze methode het "return" keyword MOETEN gebruiken om een int te returnen.
    // squareNumber = de naam van de methode. Deze is betekenisvol, kort en beschrijft wat de methode doet.
    // (int number) = de paramter. We hebben hier 1 parameter genaamd "number" van type int.
    // {return number * number;} = de body. Hier gebruiken we de parameter (number) en vermenigvuldigen die met zichzelf. Vervolgens returnen we die (int) uitkomst m.b.v het "return" keyword.
    public static int squareNumber(int number) {
        return number * number;
    }


}
