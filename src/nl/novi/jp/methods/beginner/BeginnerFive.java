package nl.novi.jp.methods.beginner;

/**
 * Hieronder is een lege klasse. Maak hierin een methode die start() heet. Deze methode print "Power on" uit.
 *
 * Zorg ervoor dat de methode wordt aangeroepen en dat de tekst uitgeprint wordt.
 */
public class BeginnerFive {
    // Als eerst hebben we een main methode gemaakt. In intellij kan dit met een shortcut door psvm+tab te typen
    // In de body van de main methode, roepen we de "start" methode aan
    public static void main(String[] args) {
        start();
    }

    // Hieronder staat de start methode gedefinieerd.
    // In de body staat een print-statement die "Power on" in de console print.
    // Zo'n print-statement kunnen we ook met een shortcut schrijven, namelijk sout+tab
    private static void start() {
        System.out.println("Power on");
    }
}
