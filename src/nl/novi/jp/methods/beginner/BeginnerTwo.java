package nl.novi.jp.methods.beginner;

/**
 * Een ander woord voor een methode uitvoeren is aanroepen. Je kunt in Java dus een methode schrijven zonder deze uit
 * te voeren. Dat is in deze opdracht ook gebeurd.
 *
 * De methode printFact() wordt al uitgevoerd. Zorg ervoor dat printAnotherFact() ook wordt uitgevoerd.
 *
 * Je kunt in BeginnerOne kijken hoe twee methodes na elkaar worden aangeroepen. Wat zie je in IntelliJ veranderen aan
 * de kleur van printAnotherFact()?
 */
public class BeginnerTwo {
    public static void main(String[] args) {
        printFact();
        printAnotherFact();
    }

    public static void printFact() {
        System.out.println("Alle access modifiers zetten we voor het gemak op public");
    }

    public static void printAnotherFact() {
        System.out.println("Je kunt System.out.println versneld typen door 'sout' + 'Enter' te typen");
    }
}
