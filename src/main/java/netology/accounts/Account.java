package netology.accounts;

public class Account {
    protected long balance;
    protected String name;
    protected int minBalance;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean pay(long amount) {
        if (amount < 0) {
            return false;
        }
        long result = balance - amount;
        if (result >= minBalance) {
            balance = result;
            return true;
        } else {
            return false;
        }
    }

    public boolean add(long amount) {
        long result = balance + amount;
        if (result >= balance) {
            balance = result;
            return true;
        } else {
            return false;
        }
    }
}


