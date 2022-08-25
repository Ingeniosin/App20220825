package me.juan.learning.manager.transaction.rules;

import me.juan.learning.entity.Transaction;
import me.juan.learning.validator.Rule;
import me.juan.learning.validator.ValidationResponse;

public class SufficientFundsRule implements Rule<Transaction> {

    @Override
    public String getName() {
        return "Sufficient funds rule";
    }

    @Override
    public ValidationResponse<Transaction> validate(Transaction model, ValidationResponse<Transaction> response) {
        if (model.getAmount() > model.getAccount().getBalance()) {
            response.setMessage("Insufficient funds");
        }
        return response;
    }

}
