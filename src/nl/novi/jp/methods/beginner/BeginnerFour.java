package nl.novi.jp.methods.beginner;

/**
 * Maak een methode die jump() heet en de tekst "You jumped" print.
 *
 * Roep deze methode vervolgens aan.
 */
public class BeginnerFour {
    public static void main(String[] args) {
        // Hier wordt (in main) de "jump" methode aangeroepen.
        // als je dit niet doen, wordt de "jump" methode niet uitgevoerd.
        jump();
    }

    // Hieronder staat de "jump" methode
    //
    // private static = de "acces modifier" waarmee je de beschikbaarheid van de methode reguleert. Dit komt later in de cursus nog aan bod. Je mag hier ook "public static" invullen.
    // void = de return waarde van de methode. We gebruiken "void" om aan te geven dat we niks returnen (we gebruiken het "return" keyword niet).
    // jump = de naam van de methode. Deze naam gebruiken we ook om de methode in main aan te roepen
    // () = de parameter. Dit is nu leeg, maar later in deze opdracht zullen we zien dat we hier ook wat kunnen invullen.
    // {} = de body van de methode. Hier staat wat de methode doet. In dit geval printen we "You jumped" in de console.
    private static void jump() {
        System.out.println("You jumped");
    }
}
