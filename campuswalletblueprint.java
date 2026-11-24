/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuswallet;

public class campuswalletblueprint {
    private final String owner;
    private int balance;

    public campuswalletblueprint(String owner, int balance) {
        this.owner = owner;
        this.balance = Math.max(0, balance);
    }

    public campuswalletblueprint(String owner) {
        this(owner, 0);
    }

    public String getOwner() {
        return this.owner;
    }

    public int getBalance() {
        return this.balance;
    }

    public boolean deposit(int amount) {
        if (amount <= 0 || amount > Integer.MAX_VALUE - this.balance) {
            return false;
        }

        this.balance += amount;
        return true;
    }

    public boolean transferTo(campuswalletblueprint recipient, int amount) {
        if (recipient == null || recipient == this || amount <= 0 || amount > this.balance) {
            return false;
        }

        // A rejected deposit leaves both balances as they were.
        if (!recipient.deposit(amount)) {
            return false;
        }

        this.balance -= amount;
        return true;
    }
}

