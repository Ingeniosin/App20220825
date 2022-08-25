package me.juan.learning.manager.transaction.rules;

import me.juan.learning.entity.Transaction;
import me.juan.learning.validator.Rule;
import me.juan.learning.validator.ValidationResponse;

import java.util.Date;

public class DateRule implements Rule<Transaction> {
    @Override
    public String getName() {
        return "Date rule";
    }

    @Override
    public ValidationResponse<Transaction> validate(Transaction model, ValidationResponse<Transaction> response) {
        long currentTime = new Date().getTime();
        long transactionTime = model.getDate().getTime();
        if (transactionTime > currentTime + 300000 || transactionTime < currentTime - 300000) {
            response.setMessage("The transaction date is not valid");
        }

        return response;
    }
}
