package nl.novi.jp.methods.medior;

import java.util.ArrayList;
import java.util.List;

/**
 * Uitdagend!
 * Gegeven: Een methode die string per character in een List stopt (numberStringToArrayList).
 * Gegeven: Een methode die een getal ontvangt en deze vertaalt naar een String (numberListToStringList).
 * Gegeven: Twee methodes die afgemaakt moeten worden door jou!
 *
 * Deze applicatie heeft als doel om een string van nummer in zijn geheel uit te schrijven:
 * "123" wordt "one-two-three"
 *
 *  Twee methodes zijn al gegeven, twee moet je zelf maken en je dient ze vervolgens in de juiste volgorde aan te roepen
 *  vanuit de main-methode.
 * Pas numberListToStringList() zo aan dat de getallen uit de list worden omgezet naar text en worden toegevoegd aan:
 * wordNumbers
 *
 * Pas printNumbers() zo aan dat de List wordt geprint met een "-" tussen de Strings.
 */

public class MediorFour {

    public static void main(String[] args) {

        List<Integer> result = numberStringToArrayList("123123145");
        List<String> resultWords = numberListToStringList(result);

        printNumbers(resultWords);

    }

    public static List<Integer> numberStringToArrayList(String numbers) {
        List<Integer> numberList = new ArrayList<>();

        for(char character : numbers.toCharArray()) {
            numberList.add(Integer.parseInt(String.valueOf(character)));
        }
        return numberList;
    }

    public static List<String> numberListToStringList(List<Integer> numbers) {
        List<String> wordNumbers = new ArrayList<>();

        for(int number : numbers)  {
            wordNumbers.add(numberToWord(number));
        }

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

    public static void printNumbers(List<String> numberWords) {
        int arraySize = numberWords.size();
        String finalString = "";

        for (int i = 0; i < numberWords.size(); i++) {
            finalString = finalString + numberWords.get(i);

            // Only add an hyphen when it is not the last one!
            if(i + 1 != arraySize) {
                finalString = finalString + "-";
            }
        }
        System.out.println(finalString);
    }

}
