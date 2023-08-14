package nl.novi.jp.methods.junior;

/**
 * Uitdagende opdracht!
 * Een stuk van de code is uitgecommentarieerd, omdat deze pas gaat werken, wanneer de methode doTransaction afgemaakt
 * is.
 *
 * Maak doTransaction af. Deze moet twee waardes accepteren als input (bepaal zelf welke datatypes daarvoor logisch zijn).
 * - Één waarde is het banksaldo voor de transactie,
 * - de andere waarde is de waarde van de transactie.
 *
 * De andere methodes (main(), deposit() en withdraw()) hoeven niet aangepast te worden.
 *
 * Gebruik een if-statement om de logica van de methode op te schrijven:
 * - Wanneer de waarde van de transactie negatief is, gaat het om het opnemen (withdraw) van geld. Dan dient de withdraw
 * methode aangeroepen te worden.
 * - Wanneer de waarde van de transactie positief is, gaat het om geld storten (deposit). Dan dient de deposit methode
 * aangeroepen te worden.
 */

public class JuniorFour {
    public static void main(String[] args) {
        //doTransaction(1000, -200);
        //doTransaction(123, 3445);
    }

    public static void doTransaction() {

    }

    public static void deposit(int bankAccountBalance, int amount) {
        int updatedBalance = bankAccountBalance + amount;

        System.out.println("The user deposits: " + amount + " euro.");
        System.out.println("The new balance is: " + updatedBalance);
    }

    public static void withdraw(int bankAccountBalance, int amount) {

        int updatedBalance = bankAccountBalance + amount;

        System.out.println("The user withdraws " + amount + " euro.");
        System.out.println("The new balance is: " + updatedBalance);
    }

}
