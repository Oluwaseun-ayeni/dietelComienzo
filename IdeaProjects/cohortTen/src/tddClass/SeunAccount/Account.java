package tddClass.SeunAccount;

public class Account {
    private int balance;

    public void setBalance(int amount) {
        if (amount < 0) {amount = 0;}
        balance = amount + balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setWithdraw(int cash) {
        if (cash < 0){cash = 0;}
        balance = balance - cash;}


}



