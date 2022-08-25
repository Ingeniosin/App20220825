package me.juan.learning.validator;

import java.util.List;
import java.util.stream.Collectors;

public interface Validator<T> {

    List<Rule<T>> getRules();

    default List<ValidationResponse<T>> validate(T model) {
        return getRules().stream().map(x -> x.validate(model, new ValidationResponse<T>(x))).collect(Collectors.toList());
    }

    default boolean isValid(List<ValidationResponse<T>> validationResponses) {
        return validationResponses.stream().allMatch(ValidationResponse::isValid);
    }


}
