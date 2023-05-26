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

        // In de main methode bepalen we hier de aanroepvolgorde van onze methodes.
        // Omdat we telkens de uitkomst van de een gebruiken als

        List<Integer> result = numberStringToArrayList("123123145");
        List<String> resultWords = numberListToStringList(result);

        printNumbers(resultWords);

    }

    // Deze methode vraagt om een String in de parameter en returned een List van Integers
    public static List<Integer> numberStringToArrayList(String numbers) {
        // Als eerst maken we een lege ArrayList, zodat we die zo kunnen gaan vullen.
        List<Integer> numberList = new ArrayList<>();

        // In deze for-loop loopen we door de String uit de parameter en pakken we daaruit elke afzonderlijke Character (char)
        //
        // Note: Zoals je misschien al hebt geconcludeerd (zo niet, dan is dat ook goed), bestaat een String in de diepste basis uit een array van chars.
        // Gelukkig hoeven we daar normaliter geen rekening mee te houden en kunnen we gewoon String gebruiken.
        for(char character : numbers.toCharArray()) {
            // We gebruiken String.valueOf() om de character naar een String te vertalen, dus 'a' wordt "a" (of beter gezegd, '1' wordt "1")
            // Daarna gebruiken we Integer.parseInt() om die String te vertalen naar een Integer, dus "1" wordt 1
            // Als laatste gebruiken we de List.add() methode (numberList.add() in dit geval, omdat we onze List zo hebben genoemd) om die Integer aan de lijst toe te voegen.
            //
            // Note: Dit soort "nested" method calls (een methode aanroep in de parameter van een andere methode aanroep), lees je altijd van binnen naar buiten, niet van links naar recht (zoals we dat in de Nederlandse taal normaal wel doen)
            // het meest binnenste is hier "character" en het meest buitenste is "numberList.add"
            numberList.add(Integer.parseInt(String.valueOf(character)));
        }
        // Uiteindelijk, nadat we door alle Characters van de String hebben geloopt, returnen we de List.
        return numberList;
    }

    // Deze methode vraagt om een List van Integers in de parameter en returned een List van Strings
    public static List<String> numberListToStringList(List<Integer> numbers) {
        // Als eerst maken we wederom een lege ArrayList, zodat we die zo kunnen gaan vullen
        List<String> wordNumbers = new ArrayList<>();

        // In deze for-loop loopen we door de lijst van Integers (die uit de parameter) en we pakken daaruit
        for(int number : numbers)  {
            // We gebruiken hier de numberToWord-methode om het nummer naar een uitgeschreven String te vertalen
            // Vervolgens voegen we die uitgeschreven String toe aan de lijst
            wordNumbers.add(numberToWord(number));
        }

        // Als laatste returnen we de (gevulde) lijst.
        return wordNumbers;
    }

    //Dit switch-statement returned aan de hand van een gegeven integer tussen 0 en 10 (excl.), het bijbehorende nummer in String vorm, uitgeschreven in letters.
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

    // De methode verwacht een List van Strings in de parameter en returned niks (want we gaan in deze methode printen)
    public static void printNumbers(List<String> numberWords) {
        // We gebruiken de List.size() methode om in de "arraySize" variable op te slaan hoe lang onze lijst is.
        // daarna maken we een lege String waaraan we zo (met concatenation) tekst kunnen toevoegen.
        int arraySize = numberWords.size();
        String finalString = "";


        // Deze for-loop loopt door de numberWords List heen (dit is een klassieke for-loop, geen "enhanced" for-loop)
        for (int i = 0; i < numberWords.size(); i++) {
            // In donderstaant statement wordt elke i-ste item uit de lijst aans de finalString toegevoegd (geconcatineerd).
            finalString = finalString + numberWords.get(i);

            // Dit if-statement zorgt dat de laatste iteratie van de loop (wanneer i gelijk is aan de arraySize-1) er geen streepje wordt toegevoegd aan de finalString. Bij alle andere iteraties wel.
            if(i + 1 != arraySize) {
                finalString = finalString + "-";
            }
        }

        // Als allerlaatste wordt nu de opgebouwde finalString geprint
        System.out.println(finalString);
    }

}
