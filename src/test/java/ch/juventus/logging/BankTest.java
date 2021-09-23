package ch.juventus.logging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    public void testWithdraw() {
        Bank bank = new Bank();
        double result = bank.withdraw(50);
        assertEquals(950, result, "Optional failure message");
    }

    @Test
    public void testDeposit() {
        Bank bank = new Bank();
        double result = bank.deposit(100);
        assertEquals(1100, result, "Optional failure message");
    }

    @Test
    void testRetrieveBalance() {
        Bank bank = new Bank();
        double result = bank.retrieveBalance();
        assertEquals(1000, result, "Optional failure message");
    }
}