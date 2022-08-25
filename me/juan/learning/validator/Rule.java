package me.juan.learning.rules;

public interface Rule<T> {

    ValidationResponse<T> validate(T model, ValidationResponse<T> response);

}
