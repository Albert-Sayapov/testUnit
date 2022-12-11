import netology.accounts.CheckingAccount;
import netology.accounts.CreditAccount;
import netology.accounts.SavingsAccount;
import netology.clients.Clients;

public class Main {
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount("Накопительный счет", 11, 1);

        CheckingAccount account1 = new CheckingAccount("Расчетный счет", 9);

        CreditAccount account2 = new CreditAccount("Кредитный счет", -10);


        Clients clients = new Clients("Альберт", 5);
        clients.addAccount(account);
        clients.addAccount(account1);
        clients.addAccount(account2);
        clients.addAccount(account);

        clients.pay(9);


    }
}
