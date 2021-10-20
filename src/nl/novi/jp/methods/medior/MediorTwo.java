package nl.novi.jp.methods.medior;

/**
 * Gegeven een methode die true of false (boolean) teruggeeft op basis van de gegeven leeftijd.
 *
 * Roep deze methode (is oldEnough) vanuit de main-methode aan. Op basis van de return value, roep je
 * of printUnderAgeWarning() of printProceed() uit.
 */
public class MediorTwo {

    public static void main(String[] args) {

    }

    public boolean isOldEnough(int age) {
        if(age > 17) {
            return true;
        } else {
            return false;
        }
    }

    public static void printUnderAgeWarning() {
        System.out.println("You are not old enough for this activity!");
    }

    public void printProceed() {
        System.out.println("No warning!");
    }
}
