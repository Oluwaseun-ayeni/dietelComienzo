package tddClass;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AccountTest {

    @Test
    public void depositTest() {

        Account funmiAccount = new Account();

        funmiAccount.deposit(100);


        assertEquals(100, funmiAccount.getBalance());
    }

    @Test
    public void depositTwiceTest() {

        Account funmiAccount = new Account();

        funmiAccount.deposit(500);
        funmiAccount.deposit(400);

        assertEquals(500 + 400, funmiAccount.getBalance());
    }

    @Test

    public void negativeDepositTest() {

        Account funmiAccount = new Account();

        funmiAccount.deposit(1000);
        funmiAccount.deposit(-400);

        assertEquals(1000, funmiAccount.getBalance());
    }


}