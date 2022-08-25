package me.juan.learning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
public class History {

    private final Date date = new Date();
    private String title;
    private String description;

}
