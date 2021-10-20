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

        List<String> transformedList = capitalizeCustomerNames(customerNames);
        for (String name : transformedList) {
            System.out.println(name);
        }
    }

    public static List<String> capitalizeCustomerNames(List<String> customerNames) {

        List<String> transformedNames = new ArrayList<>();

        for (String fullName : customerNames) {
            //Split full name in array
            String[] names = fullName.split(" ");

            for (int i = 0; i < names.length; i++) {

                if (!isMiddleName(names[i]) && !hasHyphen(names[i])) {
                    names[i] = firstLetterToUpperCase(names[i]);
                }

                if (hasHyphen(names[i])) {
                    int position = names[i].indexOf("-");
                    String transformedName = names[i].toLowerCase();
                    transformedName = transformedName.substring(0, position + 1) // till hyphen
                            + transformedName.substring(position + 1, position + 2).toUpperCase() // first letter after hyphen
                            + transformedName.substring(position + 2); // the rest
                    names[i] = transformedName;
                }
            }
            transformedNames.add(Stream.of(names)
                    .collect(Collectors.joining(" ")));
        }
        return transformedNames;
    }

    public static String firstLetterToUpperCase(String name) {
        String transformedName = name.toLowerCase();
        transformedName = transformedName.substring(0, 1).toUpperCase() + transformedName.substring(1);

        return transformedName;
    }

    public static boolean isMiddleName(String name) {
        List<String> middleNames = Arrays.asList("de", "van", "den");
        if (middleNames.contains(name)) {
            return true;
        }
        return false;
    }

    /**
     * Returns true when name has "-"
     *
     * @param name
     * @return true or false
     */
    public static boolean hasHyphen(String name) {
        return name.contains("-");
    }
}
