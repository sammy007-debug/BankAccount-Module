package edu.samcodes.utility;


/***
 * @author samcodes
 * This is a class that models a bank account
 */

public class bankAccount {

    Double account;

    /**
     * This constructor create a default balance of 0
     */


    public bankAccount() {

        this.account = 0.0;

    }

    /**
     *
     * @param startingBalance initializes the starting for your new account
     */

    public bankAccount(Double startingBalance) {

        this.account = startingBalance;

    }

    /**
     * This will add money to your bank account
     * @param howMuch the account to add
     */

    public void deposit( Double howMuch){
        account += howMuch;
    }

    /**
     * This will add money to your bank account
     * @param dollars the amount of dollars to add
     * @param cents the ammount of cents to add
     */

    public void deposit(Integer dollars, Integer cents){
        this.account += (dollars * 1.0)+ (cents / 100.0);
    }

    /**
     * This will lower your bank account's balance
     * @param howMuch the amount to withdraw
     */

    public void withDraw( Double howMuch){

        account -= howMuch;


    }

    /**
     * This reset's the balance to 0.0
     */

    public void resetBalance(){
        this.account = 0.0;
    }

    /**
     * This will reveal your bank account's balance
     * @return the balance in your account
     */

    public Double getBalance(){

        return this.account;
    }

    /**
     * This prints out the current balance to the console
     */

    public void printBalance(){
        System.out.println("Your Account Balance is: " + account);
    }







}




