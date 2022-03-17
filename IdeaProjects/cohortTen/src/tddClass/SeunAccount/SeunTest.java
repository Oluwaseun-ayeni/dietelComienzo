package tddClass.SeunAccount;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class SeunTest {
    @Test
    public void accountSeun(){
        Account seun = new Account();
        assertNotNull(seun);

    }
@Test
    public void accountCanDeposit (){
        Account seun = new Account ();
        seun.setBalance (100);
        assertEquals(100, seun.getBalance());
}
@Test
    public void accountCannotDepositNegative(){
        Account seun = new Account();
        seun.setBalance(1000);
        seun.setBalance(-300);
        assertEquals(1000, seun.getBalance());
}

@Test
    public void accountCanWithdraw(){
        Account seun = new Account();
        seun.setBalance(2000);
        seun.setWithdraw(1000);
        assertEquals(1000, seun.getBalance());
}

@Test
public void accountCannotWithdrawNegative(){
        Account seun = new Account();
        seun.setBalance(4000);
        seun.setWithdraw(-1000);
        assertEquals(4000,seun.getBalance());

}
}
