import netology.accounts.CreditAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAccount {
    @Test
    public void testCreditConstructor() {
        CreditAccount creditAccount = new CreditAccount("Кредитный счет", -10);
        Assertions.assertNotNull(creditAccount);
    }

    @Test
    public void testCreditAddTrue() {
        String name = "Кредитный счет";
        long balance = -10;
        long addBalance = 9;
        CreditAccount creditAccount = new CreditAccount(name, balance);
        Assertions.assertTrue(creditAccount.add(addBalance));
    }

    @Test
    public void testCreditBalance() {
        String name = "Кредитный счет";
        long balance = -10;
        CreditAccount creditAccount = new CreditAccount(name, balance);
        Assertions.assertFalse(creditAccount.add(100));

    }
}
