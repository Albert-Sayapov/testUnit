package netology.accounts;

public class SavingsAccount extends Account {

    public SavingsAccount(String name, long balance, int minBalance) {
        super(name, balance);
        this.minBalance = minBalance;
    }
}
