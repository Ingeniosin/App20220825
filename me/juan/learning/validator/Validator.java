package me.juan.learning;

import me.juan.learning.rules.Rule;
import me.juan.learning.rules.ValidationResponse;

import java.util.List;
import java.util.stream.Collectors;

public interface Validator<T> {

    List<Rule<T>> getRules();

    default List<ValidationResponse<T>> validate(T model){
        return getRules().stream().map(x -> x.validate(model, new ValidationResponse<T>())).collect(Collectors.toList());
    }


}
