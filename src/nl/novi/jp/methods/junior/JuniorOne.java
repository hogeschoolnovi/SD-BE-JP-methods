package nl.novi.jp.methods.junior;


/**
 * Deze klasse bevat al de methode met de naam greetName. Deze methode ontvangt ook een input-parameter. Deze
 * input-parameter moet van het datatype String zijn en we noemen deze name binnen de methode.
 *
 * sayGoodbyeToName() is ook al toegevoegd, maar de body (de code tussen de accolades) is nog niet af. Zorg ervoor dat
 * de methode 'Goodbye Henk' uitprint.
 */
public class JuniorOne {

    public static void main(String[] args) {
        greetName("Nova");
        sayGoodbyeToName("Henk");

    }

    public static void greetName(String name) {
        System.out.println("Hello " + name);
    }

    // Deze methode heeft een parameter tussen de haakjes () staan, namelijk (String name).
    // Deze parameter is opzich waardeloos, maar wanneer we de methode aanroepen in de main-methode, kunnen we er een waarde aan meegeven.
    // In dit geval zie je dat in main sayGoodByeToName("Henk") wordt aangeroepen.
    // De parameter "name" heeft dan dus de waarde "Henk" gekregen.
    // Wanneer we nog eens de methode zouden aanroepen met een andere waarden, bijvoorbeeld sayGoodByeToName("Willem Alexander")
    // dan krijgt de parameter "name" hier de waarde "Willem Alexander".
    // Je ziet dus dat de kracht van een parameter is, dat het bij elke aanroep een andere waarde kan krijgen. Ofwel, het is variabel.
    public static void sayGoodbyeToName(String name) {
        // We maken hier een print-statement, waarin we de String "Goodbye " printen, met daaraan vast geplakt de waarde van de "name" parameter.
        System.out.println("Goodbye " + name);
    }
}
