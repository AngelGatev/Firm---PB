package JavaBasics.ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());
        int daysInHours = days * 8;
        double workingHours = (daysInHours - daysInHours * 0.1) + days * 2 * employees;

        if (hoursNeeded <= workingHours) {
            System.out.printf("Yes!%.0f hours left.", workingHours-Math.floor(hoursNeeded));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hoursNeeded-Math.floor(workingHours));
        }
    }
}
