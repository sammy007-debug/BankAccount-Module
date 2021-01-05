package edu.samcodes.utility;

import edu.samcodes.utility.bankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Accountant {

    private static final Double EPSILON = 1E-9;


    @Test
    void test() {

        bankAccount monica = new bankAccount();
        assertEquals(0.0,monica.getBalance(),EPSILON);
        monica.deposit(200.0);
        assertEquals(200.0,monica.getBalance(),EPSILON);
        monica.withDraw(150.0);
        assertEquals(50.0,monica.getBalance(),EPSILON);
        monica.resetBalance();
        assertEquals(0.0,monica.getBalance(),EPSILON);









    }

    @Test
    void test2(){


    bankAccount veronica = new bankAccount(100.0);
    veronica.deposit(150.0);

    bankAccount monica = new bankAccount(50.0);
    monica.deposit(150.0);

    Double transfer = 35.0;
    veronica.withDraw(transfer);
    monica.deposit(transfer);
    assertEquals(235.0,monica.getBalance(),EPSILON);
    assertEquals(215.0,veronica.getBalance(),EPSILON);
    veronica.getBalance();
    veronica.printBalance();
    monica.printBalance();







    }

    @Test
    void test3(){

        bankAccount sammy = new bankAccount(5000.0);
        sammy.deposit(4000,350);
        assertEquals(9003.5,sammy.getBalance(),EPSILON);



    }

    @Test
    void test4(){
        bankAccount joe = new bankAccount();
        joe.deposit(5000.0);
        joe.getBalance();

    }


}
