package nl.novi.jp.methods.beginner;

/**
 * Deze klasse bevat al de methode met de naam hello(). Deze methode print "Goedemorgen Nederland" uit. De methode
 * goodbye() is ook al toegevoegd, maar deze doet nog niets. Zorg ervoor "Goedenavond Nederland" uitprint.
 */
public class BeginnerOne {

    // Dit is de main methode.
    // De main-methode is HET startpunt van je applicatie.
    public static void main(String[] args) {
        // Hier wordt eerste de methode "hello" aangeroepen
        // vervolgens wordt de methode "goodbye" aangeroepen
        // Als een methode niet wordt aangeroepen, wordt het ook niet uitgevoerd.
        hello();
        goodbye();
    }

    // Hieronder worden de methodes "hello" en "goodbye" gedefinieerd
    public static void hello() {
        // Hier wordt de text "Goedemorgen Nederland" geprint in de console
        System.out.println("Goedemorgen Nederland");
    }

    public static void goodbye() {
        // Hier wordt de text "Goedeavond Nederland" geprint in de console
        System.out.println("Goedeavond Nederland");
    }
}
