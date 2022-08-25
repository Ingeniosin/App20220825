package me.juan.learning.manager;

import me.juan.learning.validator.ValidationResponse;
import me.juan.learning.validator.Validator;

import java.util.List;

public interface Manager<T> {

    Validator<T> getValidator();

    default TransactionResponse<T> beginTransaction(T model) {
        Validator<T> validator = getValidator();
        List<ValidationResponse<T>> validationResponses = validator.validate(model);
        return new TransactionResponse<>(validator.isValid(validationResponses), validationResponses);
    }

}
