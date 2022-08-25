package me.juan.learning.manager.transaction.rules;

import me.juan.learning.entity.AccountStatus;
import me.juan.learning.entity.Transaction;
import me.juan.learning.validator.Rule;
import me.juan.learning.validator.ValidationResponse;

public class ActiveAccountRule implements Rule<Transaction> {

    @Override
    public String getName() {
        return "Active account rule";
    }

    @Override
    public ValidationResponse<Transaction> validate(Transaction model, ValidationResponse<Transaction> response) {
        if (model.getAccount().getStatus() != AccountStatus.ACTIVE) {
            response.setMessage("Account is not active");
        }
        return response;
    }

}
