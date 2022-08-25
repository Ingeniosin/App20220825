package me.juan.learning.validator;

public interface Rule<T> {

    String getName();

    ValidationResponse<T> validate(T model, ValidationResponse<T> response);

}
