package me.juan.learning.validator;

import lombok.Data;

import java.util.Date;

@Data
public class ValidationResponse<T> {

    private final Date date = new Date();
    private String message;
    private Rule<T> rule;

    public ValidationResponse(Rule<T> rule) {
        this.rule = rule;
    }

    public boolean isValid() {
        return message == null;
    }

}
