/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labgrade;

import java.util.Locale;

public class Labgrade {
    public static void main(String[] args) {
        Labgradeblueprint ana = new Labgradeblueprint("Ana", 80, 90);
        Labgradeblueprint ben = new Labgradeblueprint("Ben", 101, 85);

        showGrade(ana);
        showGrade(ben);

        System.out.println("Update Ana to 95 and 101: " + ana.updateScores(95, 101));
        showGrade(ana);

        System.out.println("Update Ana to 74 and 75: " + ana.updateScores(74, 75));
        showGrade(ana);

        System.out.println("Update Ana to 75 and 75: " + ana.updateScores(75, 75));
        showGrade(ana);

        showGrade(ben);
    }

    private static void showGrade(Labgradeblueprint record) {
        String status = record.isPassing() ? "passing" : "not passing";
        System.out.printf(Locale.US, "%s: %.1f (%s)%n",
                record.getStudentName(), record.getFinalGrade(), status);
    }

    // Activity 2, Validate both scores first:
    // If either new score is invalid, the entire update must fail.
    // Checking both before assigning keeps the original pair intact.
}

