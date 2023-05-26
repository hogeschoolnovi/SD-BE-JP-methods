package nl.novi.jp.methods.junior;

/**
 * Uitdagende opdracht!
 * Een stuk van de code is uitgecommentarieerd, omdat deze pas gaat werken, wanneer de methode doTransaction afgemaakt
 * is.
 *
 * Maak doTransaction af. Deze moet twee waardes accepteren (welk datatype?). Een waarde is het banksaldo voor de
 * transactie, de andere waarde is de waarde van de transactie.
 *
 * Wanneer de waarde van de transactie negatief is, gaat het om het opnemen (withdraw) van geld. Deze methode dient dan
 * ook aangeroepen te worden. Wanneer deze positief is, gaat het om geld storten (deposit). Dan dient de deposit methode
 * aangeroepen te worden.
 */

public class JuniorFour {
    public static void main(String[] args) {
        doTransaction(1000, -200);
        doTransaction(123, 3445);
    }

    // We hebben deze methode 2 parameters gegeven.
    // In de main-methode wordt deze methode namelijk aangeroepen met 2 argumenten.
    // Daarbij wordt deze methode aangeroepen met nummers als argument,
    // vadaar dat we er hier voor gekozen hebben om de parameters van type int te maken.
    // De namen van de twee parameters zijn afgeleid van de "deposit" en "withdraw" methodes.
    public static void doTransaction(int currentBalance, int amount) {
        if(amount > 0) {
            // let er hier op dat je deposit (en ook withdraw) aanroept met parameter namen van "doTransaction"
            // Aangezien we alleen op deze if-branch komen als amount > 0 is,
            // betekend dit dat de waarden van (currentBalance, amount) overeen komen met de tweede call van "doTransaction" in de main-methode,
            // ofwel (currentBalance=123, amount=3445)
            deposit(currentBalance, amount);
        } else {
            // In de else-branch komen we alleen als amount < 0 is,
            // dus hier hebben we de eerste call van "doTransaction" in main.
            // Ofwel, (currentBalance=1000, amount=-200)
            withdraw(currentBalance, amount);
        }
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
