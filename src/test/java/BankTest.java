import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test

    void testAddAccountToClient(){
        Client client = new Client("Diogo", 26, 15000 , 0);
        Account account1 = new Account(1,15);
        Account account2 = new Account(2,30);
        assertAll (
                () -> assertTrue (client.addAccount(account1, account2)),
                () -> assertTrue(client.getBankAccounts (). contains (account1)),
                () -> assertTrue(client.getBankAccounts().contains(account2)),
                () -> assertThrows (ArrayStoreException.class , ()-> client.addAccount ( account1))
        );


    }

    @Test
    void testCreditApproval () {
        Client client = new Client( "DIOGO", 18, 0, 0);
        CreditAsseccement creditAsseccement = new CreditAsseccement();
        assertTrue( creditAsseccement.assess (client));
    }


}
