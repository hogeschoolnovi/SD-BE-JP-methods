package nl.novi.jp.methods.senior;

import java.util.Map;
import java.util.HashMap;

/**
 * Lees eerst wat een Map is: https://www.w3schools.com/java/java_hashmap.asp
 *
 * Maak de methode af. Deze moet het Nederlandse woord teruggeven van het Engelse woord.
 * Verzin iets wanneer het Engelse woord niet beschikbaar is.
 */
public class SeniorTwo {

    public static void main(String[] args) {
        Map<String,String> englishDutchWords = new HashMap<>();

        englishDutchWords.put("bottle","fles");
        englishDutchWords.put("phone","telefoon");
        englishDutchWords.put("water","water");
        englishDutchWords.put("bread","brood");
        englishDutchWords.put("space","ruimte");
        englishDutchWords.put("flower","bloem");
        englishDutchWords.put("flour","bloem");
        englishDutchWords.put("kitchen","keuken");
        englishDutchWords.put("cup","beker");
        englishDutchWords.put("screen","scherm");

        System.out.println(translate(englishDutchWords, "cup"));
        System.out.println(translate(englishDutchWords, "DO NOT EXIST"));
    }


    public static String translate(Map<String, String> words, String word) {

        // Met dit if-statement check je of het gegevens woord wel in de woordenlijst staat,
        // zo ja, dan return je "value" die hoort bij de "key" van de gegeven Map, (map.get("bottle") returned bijvoorbeeld "fles". "bottle" is de key, "fles" is de value. Een Map bestaat uit key-value pairs)
        // zo niet, dan return je de Strig "404: NOT FOUND"
        if(words.containsKey(word)) {
            return words.get(word);
        }
        return "404: NOT FOUND";
    }

}
