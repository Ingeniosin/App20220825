package me.juan.learning;

import me.juan.learning.entity.Account;
import me.juan.learning.entity.AccountStatus;
import me.juan.learning.entity.Transaction;
import me.juan.learning.entity.User;
import me.juan.learning.manager.transaction.TransactionManager;

public class Main {

    private static final TransactionManager transactionManager = new TransactionManager();

    public static void main(String[] args) {
        User user = new User("Juan");
        Account userAccount = new Account(user, 100.0, AccountStatus.ACTIVE);
        user.getAccounts().add(userAccount);

        Transaction transaction = new Transaction(userAccount, 1100.0);

        System.out.println(transaction);

        transactionManager.beginTransaction(transaction);

        System.out.println(transaction);
    }

}
