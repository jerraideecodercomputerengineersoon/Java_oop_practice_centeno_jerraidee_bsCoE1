/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campusprinting;

public class CampusorintingMainclass {
    public static void main(String[] args) {
        Campusprintingblueprint mia = new Campusprintingblueprint("Mia", 10);
        Campusprintingblueprint luis = new Campusprintingblueprint("Luis", -4);

        showCredits(mia, luis);

        System.out.println("Mia prints 4 pages: " + mia.printPages(4));
        showCredits(mia, luis);

        System.out.println("Mia prints 7 pages: " + mia.printPages(7));
        showCredits(mia, luis);

        System.out.println("Mia adds -3 credits: " + mia.addCredits(-3));
        showCredits(mia, luis);

        System.out.println("Mia adds 4 credits: " + mia.addCredits(4));
        showCredits(mia, luis);
    }

    private static void showCredits(Campusprintingblueprint first,
                                    Campusprintingblueprint second) {
        System.out.println(first.getStudentName() + ": " + first.getCredits()
                + ", " + second.getStudentName() + ": " + second.getCredits());
    }
}

