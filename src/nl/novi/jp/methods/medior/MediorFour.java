package nl.novi.jp.methods.medior;

import java.util.ArrayList;
import java.util.List;

/**
 * Uitdagend!
 *
 * Deze applicatie heeft als doel om een string van nummers in zijn geheel uit te schrijven:
 * "123" wordt "one-two-three"
 *
 * Twee methodes zijn al gegeven en hoef je niet meer aan te passen.
 *  - numberStringToArrayList(), neemt een String als input en geeft een List<Integer> (lees: Lijst van Integers) terug als output.
 *  De methode transformeert een String van numbers, zoals "123" naar een Lijst van Integers, zoals [1,2,3].
 *  -
 *
 * Twee methodes moet je zelf maken:
 *  - Pas numberListToStringList() zo aan dat de getallen uit de input-lijst (numbers) worden omgezet naar text en worden
 *      toegevoegd aan wordNumbers met de methode "wordnumbers.add(X)" (waar "X" de string is die je wil toevoegen aan de lijst).
 *      Deze methode heeft een for-loop nodig.
 *  - Pas printNumbers() zo aan dat de input-List (numberWords) wordt geprint met een "-" tussen de Strings.
 *      Maak eerst een lege basis-String.
 *      Gebruik daarna een for-loop om elk woord met een "-" toe te voegen aan de basis string
 *      Print uiteindelijk de basis-String.
 *  - Vervolgens kun je deze 2 methodes in de juiste volgorde aanroepen vanuit de main-methode
 *
 *
 *  Opmerking:
 *      Een List<Integer> of List<String> is niet veel anders dan een Array, zoals Integer[] of String[].
 *      Er zijn wel een antal cruciale verschillen, maar dit gaan we in een latere les nog uitgebreid behandelen.
 *
 */

public class MediorFour {

    public static void main(String[] args) {

        List<Integer> result = numberStringToArrayList("123123145");

    }

    public static List<Integer> numberStringToArrayList(String numbers) {
        List<Integer> numberList = new ArrayList<>();

        for(char character : numbers.toCharArray()) {
            numberList.add(Integer.parseInt(String.valueOf(character)));
        }
        return numberList;
    }

    //TODO: Maak deze methode af.
    public static List<String> numberListToStringList(List<Integer> numbers) {
        List<String> wordNumbers = new ArrayList<>();

        return wordNumbers;
    }

    public static String numberToWord(int number) {
        switch(number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "Unknown number";
        }
    }

    //TODO Maak deze methode af.
    public static void printNumbers(List<String> numberWords) {

    }

}
