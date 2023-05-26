package nl.novi.jp.methods.beginner;

/**
 * Onderstaande code is uitgecommentarieerd, omdat deze niet compileert. Er zit dus een fout in. Deze ga jij oplossen.
 *
 * Haal de comments eerst weg.
 *
 * Dit is de foutmelding: Cannot resolve method 'driveRight' in 'BeginnerThree'. Deze foutmelding betekent dat in de
 * klasse BeginnerThree de methode met de naam driveRight wordt aangeroepen, maar dat deze niet bestaat.
 *
 * Voeg deze methode toe en zorgt dat deze de tekst "The car turns right" uitprint.
 */
public class BeginnerThree {

    // De main methode is weer uit de comments gehaald door /* en */  te weg te halen.
    public static void main(String[] args) {
        driveLeft();
        driveRight();
    }

    // Hieronder is de methode "driveRight" gemaakt.
    // Tussen de accolades {} van de methode, schrijven we wat deze methode doet. In dit geval wordt er "The car turns right" geprint in de console.
    private static void driveRight() {
        System.out.println("The car turns right");
    }

    public static void driveLeft() {
        System.out.println("The car turns left");
    }
}
