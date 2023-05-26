package nl.novi.jp.methods.medior;

/**
 * Gegeven: Een methode waarin je een string kunt stoppen. Deze methode transformeert de String op zo'n manier dat
 * alleen de eerste letter een hoofdletter is.
 *
 * De methode wordt echter nog niet gebruikt voor printName(), waardoor de namen nu allemaal rare hoofdletters hebben.
 *
 * Los dit op!
 */
public class MediorThree {

    public static void main(String[] args) {
        printName("SjAaK", "Patat");
        printName("henk","spaghetti");
        printName("Doerak", "BELL");
    }

    public static void printName(String firstName, String lastName) {

        // Als eerst transformeren we de parameters "firstName" en "lastName" tot correcte Strings die beginnen met een hoofdletter gevolgd door allemaal kleine letter.
        // We doen dat door "firstLetterToUpperCase" aan te roepen met "firstName" en "lastName" als parameters. De return waarde slaan we vervolgens op in een variabele
        String perfectFirstName = firstLetterToUpperCase(firstName);
        String perfectLastName = firstLetterToUpperCase(lastName);

        // Als laatste gebruiken we de nieuwe variabelen om de teks te printen.
        System.out.println("Naam: " + perfectFirstName + " " + perfectLastName);

    }

    public static String firstLetterToUpperCase(String name) {

        // De methode String.toLowerCase() transformeert een string (name in dit geval) tot een nieuwe String zonder hoofdletters.
        String transformedName = name.toLowerCase();

        // De methode String.substring(int begin, int end) geeft je een specifiek gedeeltje van een string. De parameters geven aan waar de substring begint en eindigd (exclusief).
        // Substring 0 tot 1 betekent dus dat je begint bij de eerste letter en door gaat tot de tweede letter, maar zonder de tweede letter, oftweel je krijg alleen de eerste letter terug.
        // De methode String.toUpperCase(), doet precies het tegenovergestelde van String.toLowerCase(), dus die transformeerd de complete String naar hoofdletters.
        // Omdat we in dit voorbeeld de "toUpperCase" methode aanroepen op de uitkomst van de "subString" methode*, wordt dus alleen de eerste letter getransformeert tot een hoofdletter.
        // * Note: Zoals je ziet kun je methodes die iets returnen aan elkaar linken. Als de uitkomst van een methode aanroep een String is, kun je achter die aanroep dus meteen een String methode als ".toUpperCase()" plakken.
        transformedName = transformedName.substring(0,1).toUpperCase() + transformedName.substring(1);

        return transformedName;
    }

}
