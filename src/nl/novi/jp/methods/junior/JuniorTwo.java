package nl.novi.jp.methods.junior;


/**
 * Deze klasse bevat al de methode met de naam doubleIt. Deze methode ontvangt een integer, verdubbelt deze en print
 * deze vervolgens uit.
 *
 * Maak deze klasse af door de methode squareTheNumber af te maken. Deze methode ontvangt een integer en moet deze
 * kwadrateren en uitprinten.
 */
public class JuniorTwo {

    public static void main(String[] args) {
        doubleIt(33);
        squareTheNumber(12);
    }

    public static void doubleIt(int number) {
        int doubledNumber = number + number;
        System.out.println("Het getal " + number + " is verdubbeld: " + doubledNumber);
    }

    // Deze methode krijgt een parameter van type int
    public static void squareTheNumber(int number) {
        // We vermenigvuldigen de parameter met zichzelf (dat is wat kwadrateren is)
        // en we slaan het product van die vermenigvuldiging op in een variabele.
        int squared = number * number;
        // Vervolgens printen we het product uit.
        // We maken hier een mooi zinnetje door verschillende Strings en variabelen aan elkaar te knopen met +
        // dit "Strings aan elkaar knopen met +" noemen we concatenation

        // Sidenote: De variabelen number en squared worden hier automatische geinterpreteerd als String, omdat ze in een concatenatie met Strings staan.
        // String + String = String; -> ("Hallo" + "wereld" = "Hallo wereld")
        // String + nummer = String; -> ("Chanel nummer " + 5 = "Chanel nummer 5")
        // nummer + nummer = nummer; -> (5 + 3 = 8)
        System.out.println("Het getal " + number + " is in het kwadraat: " + squared);
    }
}
