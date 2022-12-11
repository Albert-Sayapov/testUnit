package netology.accounts;

public class CreditAccount extends Account {
    public CreditAccount(String name, long balance) {
        super(name, balance);
    }

    @Override
    public boolean add(long amount) {
        long result = balance + amount;
        if (result >= balance & result <= 0) {
            balance = result;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (amount < 0) {
            return false;
        }
        long result = balance - amount;
        if (result < balance) {
            balance = result;
            return true;
        } else {
            return false;
        }
    }
}
