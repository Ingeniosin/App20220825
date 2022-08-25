package me.juan.learning.manager.transaction;

import me.juan.learning.entity.Transaction;
import me.juan.learning.manager.transaction.rules.ActiveAccountRule;
import me.juan.learning.manager.transaction.rules.DateRule;
import me.juan.learning.manager.transaction.rules.SufficientFundsRule;
import me.juan.learning.manager.transaction.rules.ValidAmountRule;
import me.juan.learning.validator.Rule;
import me.juan.learning.validator.Validator;

import java.util.List;

public class TransactionValidator implements Validator<Transaction> {

    @Override
    public List<Rule<Transaction>> getRules() {
        return List.of(
                new ValidAmountRule(),
                new ActiveAccountRule(),
                new SufficientFundsRule(),
                new DateRule()
        );
    }

}
