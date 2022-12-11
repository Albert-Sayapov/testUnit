package netology.clients;

import netology.accounts.Account;

public class Clients {
    protected String name;
    protected Account[] accounts;

    public Clients(String name, int maxAccounts) {
        this.name = name;
        this.accounts = new Account[maxAccounts];

    }

    public void addAccount(Account account) {

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Превышено максимальное количество счетов ");
    }

    public boolean pay(long amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getBalance() >= amount) {
                accounts[i].pay(amount);
                System.out.println("Успешный платеж");
                return true;
            }
        }
        System.out.println("Недостаточно средств");
        return false;
    }

}
