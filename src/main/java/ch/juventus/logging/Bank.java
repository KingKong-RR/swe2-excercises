package ch.juventus.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {

    private final Logger logger = LoggerFactory.getLogger(Bank.class);
    private double balance = 1000;

    public double withdraw(double takeMoney) {
        logger.debug("Your Balance is = {}", balance);
        balance = balance - takeMoney;
        logger.debug("Withdraw {} from Bankaccount. New Balance = {}", takeMoney, balance);
        return balance;
    }

    public double deposit(double placeMoney) {
        logger.debug("Your Balance is = {}", balance);
        balance = balance + placeMoney;
        logger.debug("Place {} to Bankaccount. New Balance = {}", placeMoney, balance);
        return balance;
    }

    public double retrieveBalance() {
        logger.debug("Your Balance = {}", balance);
        return balance;
    }
}
