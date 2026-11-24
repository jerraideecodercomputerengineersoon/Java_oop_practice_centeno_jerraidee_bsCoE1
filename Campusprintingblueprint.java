/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campusprinting;

public class Campusprintingblueprint {
    private final String studentName;
    private int credits;

    public Campusprintingblueprint(String studentName, int credits) {
        this.studentName = studentName;
        this.credits = Math.max(0, credits);
    }

    public String getStudentName() {
        return this.studentName;
    }

    public int getCredits() {
        return this.credits;
    }

    public boolean addCredits(int amount) {
        if (amount <= 0 || amount > Integer.MAX_VALUE - this.credits) {
            return false;
        }

        this.credits += amount;
        return true;
    }

    public boolean printPages(int pages) {
        if (pages <= 0 || pages > this.credits) {
            return false;
        }

        this.credits -= pages;
        return true;
    }
}

