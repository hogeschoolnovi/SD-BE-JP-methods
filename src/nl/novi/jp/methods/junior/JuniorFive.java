package nl.novi.jp.methods.junior;

/**
 * Deze klasse is helemaal leeg, je mag nu dus alles zelf doen.
 * Maak een methode die een String ontvangt en deze in HOOFDLETTERS uitprint.
 * Bedenk zelf een goede engelse naam voor de methode.
 *
 * Hoe maak je hoofdletters van een String in Java?
 * https://duckduckgo.com/?q=java+to+uppercase
 */

public class JuniorFive {
    public static void main(String[] args) {
        capitalizeWord("sjaak");
        capitalizeWord("patat");
        capitalizeWord("ajax");
        capitalizeWord("kampioen");
    }

    public static void capitalizeWord(String word) {
        System.out.println(word.toUpperCase());
    }
}
