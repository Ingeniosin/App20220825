package me.juan.learning.manager.transaction;

import me.juan.learning.entity.Account;
import me.juan.learning.entity.History;
import me.juan.learning.entity.Transaction;
import me.juan.learning.manager.Manager;
import me.juan.learning.manager.TransactionResponse;
import me.juan.learning.validator.Validator;

import java.util.stream.Collectors;

public class TransactionManager implements Manager<Transaction> {

    @Override
    public Validator<Transaction> getValidator() {
        return new TransactionValidator();
    }

    @Override
    public TransactionResponse<Transaction> beginTransaction(Transaction model) {
        TransactionResponse<Transaction> transactionResponse = Manager.super.beginTransaction(model);
        if (!transactionResponse.isSuccess()) {
            String historyDescription = "The transaction does not comply with the rules: " + transactionResponse.getValidationResponses().stream().filter(x -> !x.isValid()).map(x -> x.getRule().getName()).collect(Collectors.joining(", "));
            History transactionFailed = new History("Transaction failed", historyDescription);
            model.getHistories().add(transactionFailed);
            return transactionResponse;
        }


        Account account = model.getAccount();
        account.setBalance(account.getBalance() - model.getAmount());

        History transactionSuccess = new History("Transaction succeeded", "Transaction succeeded successfully, " + model.getAmount() + " was debited from the account");
        model.getHistories().add(transactionSuccess);

        return transactionResponse;
    }
}
