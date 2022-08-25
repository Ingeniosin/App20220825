package me.juan.learning.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.juan.learning.validator.ValidationResponse;

import java.util.List;

@Data
@AllArgsConstructor
public class TransactionResponse<T> {

    private boolean isSuccess;
    private List<ValidationResponse<T>> validationResponses;

}
