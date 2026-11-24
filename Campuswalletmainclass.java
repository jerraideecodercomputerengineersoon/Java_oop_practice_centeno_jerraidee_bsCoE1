/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campuswallet;

public class Campuswalletmainclass {
    public static void main(String[] args) {
        campuswalletblueprint aly = new campuswalletblueprint("Aly", 100);
        campuswalletblueprint ben = new campuswalletblueprint("Ben");

        showBalances(aly, ben);

        System.out.println("Aly sends Ben 35: " + aly.transferTo(ben, 35));
        showBalances(aly, ben);

        System.out.println("Aly tries to send Ben 70: " + aly.transferTo(ben, 70));
        showBalances(aly, ben);

        System.out.println("Aly tries to send herself 10: " + aly.transferTo(aly, 10));
        showBalances(aly, ben);

        System.out.println("Ben deposits 15: " + ben.deposit(15));
        showBalances(aly, ben);

        System.out.println("Aly sends Ben her last 65: " + aly.transferTo(ben, 65));
        showBalances(aly, ben);

        // Activity 3, Zero-credit transfer: Expect false, with Aly at 0 and Ben at 115.
        System.out.println("Ben tries to send Aly 0: " + ben.transferTo(aly, 0));
        showBalances(aly, ben);

        // Activity 3, Null recipient: Expect false, with Aly at 0 and Ben at 115.
        System.out.println("Ben tries to send 10 to null: " + ben.transferTo(null, 10));
        showBalances(aly, ben);
    }

    private static void showBalances(campuswalletblueprint first,
                                     campuswalletblueprint second) {
        System.out.println(first.getOwner() + ": " + first.getBalance()
                + ", " + second.getOwner() + ": " + second.getBalance());
    }
}
