package nl.novi.jp.methods.medior;

/**
 * Gegeven: Een methode die true of false (boolean) teruggeeft op basis van de gegeven leeftijd.
 *
 * Roep deze methode (is oldEnough) vanuit de main-methode aan. Op basis van de return value, roep je
 * of printUnderAgeWarning() of printProceed() uit.
 */
public class MediorTwo {

    public static void main(String[] args) {
        // De parameter van een if-statement heeft een boolean nodig. De return waarde van de isOldEnough-methode is een boolean.
        // We kunnen daarom direct de isOldEnough-methode gebruiken als argument van het if-statement.
        // Probeer hier zelf de "edge cases" te bepalen (en in te vullen) en kijk wat er gebeurt.
        if(isOldEnough(18)) {
            printProceed();
        } else {
            printUnderAgeWarning();
        }
    }

    public static boolean isOldEnough(int age) {
        if(age > 17) {
            return true;
        } else {
            return false;
        }
    }

    public static void printUnderAgeWarning() {
        System.out.println("You are not old enough for this activity!");
    }

    public static void printProceed() {
        System.out.println("No warning!");
    }
}
