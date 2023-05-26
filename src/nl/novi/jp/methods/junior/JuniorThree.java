package nl.novi.jp.methods.junior;

/**
 * Deze klasse bevat al de methode negativeNumberChecker. Beantwoord voor jezelf wat deze methode doet.
 *
 * Roep de methode een paar keer aan om zijn gedrag in de praktijk te zien.
 */

public class JuniorThree {
    public static void main(String[] args) {

        // Hier testen we het aanroepen van de "negativeNumberChecker" methode.
        // Je kunt willekeurige nummers kiezen om aan te roepen,
        // maar een meer methodische aanpak is om de zogenaamde "edge cases" aan te roepen.
        // Aangezien we willen checken of een getal hoger of lager is dan 0,
        // zijn er 3 belangrijke edge case, namelijk: -1 (vlak onder de edge), 1 (vlak boven de edge) en 0 (de edge).
        // Voor de zekerheid kunnen we ook andere inputs testen.
        // Bonusvraag: Wat gebeurd er als we 47399572578 als input willen gebruiken?
        negativeNumberChecker(1);
        negativeNumberChecker(0);
        negativeNumberChecker(-1);
        negativeNumberChecker(444);
        negativeNumberChecker(-185);

    }

    public static void negativeNumberChecker(int number) {
        if(number > 0) {
            System.out.println(number + " is een positief getal.");
        } else {
            System.out.println(number + " is een negatief getal.");
        }
    }
}
