package me.juan.learning.rules;

import lombok.Getter;

import java.util.Date;

@Getter
public class ValidationResponse<T> {

    private final Date date = new Date();
    private String message;
    private Rule<T> rule;


    public boolean isValid() {
        return message == null;
    }

}
