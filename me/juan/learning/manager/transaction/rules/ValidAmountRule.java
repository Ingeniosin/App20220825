package me.juan.learning.manager.transaction.rules;

import me.juan.learning.entity.Transaction;
import me.juan.learning.validator.Rule;
import me.juan.learning.validator.ValidationResponse;

public class ValidAmountRule implements Rule<Transaction> {

    @Override
    public String getName() {
        return "Valid amount rule";
    }

    @Override
    public ValidationResponse<Transaction> validate(Transaction model, ValidationResponse<Transaction> response) {
        if (model.getAmount() <= 0) {
            response.setMessage("Amount must be greater than 0");
        }
        return response;
    }
}
