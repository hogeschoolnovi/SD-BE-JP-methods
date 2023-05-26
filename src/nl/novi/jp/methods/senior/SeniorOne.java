package nl.novi.jp.methods.senior;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;


/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 * <p>
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 */

public class SeniorOne {
    public static void main(String[] args) {
        // We maken als eerst een lege ArrayList en daaronder gebruiken we een aantal keer List.add() om items aan de lijst toe te voegen.
        List<String> customerNames = new ArrayList<>();

        customerNames.add("nick piraat");
        customerNames.add("michael jackson");
        customerNames.add("glennis grace");
        customerNames.add("dreetje hazes");
        customerNames.add("robbie williams");
        customerNames.add("michiel de ruyter");
        customerNames.add("sjaak polak");
        customerNames.add("jan van jansen");
        customerNames.add("henk den hartog");
        customerNames.add("mo el-mecky");
        customerNames.add("fredje kadetje");

        // Hier roepen we onze zelfgemaakte methode aan en loopen we door het resultaat heen om het te printen.
        List<String> transformedList = capitalizeCustomerNames(customerNames);
        for (String name : transformedList) {
            System.out.println(name);
        }
    }

    public static List<String> capitalizeCustomerNames(List<String> customerNames) {

        List<String> transformedNames = new ArrayList<>();

        // We loopen hier door de List uit de parameter, om elke naam in de lijst te kunnen transformeren.
        for (String fullName : customerNames) {

            //Hier gebruiken we de String.split() methode om de String (fullName) op specifieke plekken op te splitsen. Het resultaat is een String[] van 1 of meerdere Strings.
            // De parameter van de String.split() methode is de plek waar je de String wilt laten splitten. We geven nu een " " mee, dus bij elke spatie wordt de String gesplit.
            // Hadden we hier "banaan" meegegeven, dan zou er alleen gesplit worden wanneer er "banaan" in de String staat. Wanneer we "" meegeven, krijg je een String[] van alle losse letters.
            String[] names = fullName.split(" ");

            for (int i = 0; i < names.length; i++) {

                // Dit if-statment checkt of de substring een middelname is of een streepje bevat, zo niet, dan wordt de eerste letter van die substring een hoofdletter
                if (!isMiddleName(names[i]) && !hasHyphen(names[i])) {
                    names[i] = firstLetterToUpperCase(names[i]);
                }

                // dit if-statment checkt of de substring een streepje bevat, zo ja, dan wordt de letter na dat streepje een hoofdletter.
                if (hasHyphen(names[i])) {
                    // Array.indexOf(item) returned de eerste index (positie) van het item (parameter) in de array.
                    // Hieronder returned "names[position]" uiteindelijk dus een "-"
                    int position = names[i].indexOf("-");
                    String transformedName = names[i].toLowerCase();
                    transformedName = transformedName.substring(0, position + 1) // till hyphen
                            + transformedName.substring(position + 1, position + 2).toUpperCase() // first letter after hyphen
                            + transformedName.substring(position + 2); // the rest
                    names[i] = transformedName;
                }
            }
            // Wanneer we klaar zijn met deze opgesplitste naam, dan voegen we het toe aan de "transformedNames" List.
            // We doen dit met behulp van een Stream
            // Een Stream is in principe een kortere manier om veelgebruikte methodes te kunnen aanroepen.
            // Hier worden de Strings uit de String[] samen gevoegd tot 1 String met tussen elk item een spatie.
            transformedNames.add(Stream.of(names)
                    .collect(Collectors.joining(" ")));
        }
        return transformedNames;
    }

    //Deze methode ontvangt een String, veranderd de eerste letter van die String naar een hoofdletter en returned vervolgens de aangepaste String.
    public static String firstLetterToUpperCase(String name) {
        String transformedName = name.toLowerCase();
        transformedName = transformedName.substring(0, 1).toUpperCase() + transformedName.substring(1);

        return transformedName;
    }

    // Deze methode returned true als het aangeroepen wordt met de String "de" "van" of "den"
    public static boolean isMiddleName(String name) {
        List<String> middleNames = Arrays.asList("de", "van", "den");
        if (middleNames.contains(name)) {
            return true;
        }
        return false;
    }

    // Deze methode returned true als het aangeroepen wordt met een Sting waar een "-" in staat
    public static boolean hasHyphen(String name) {
        return name.contains("-");
    }
}
