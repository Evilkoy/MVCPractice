package com.makson.mvcleaf.model;

import lombok.Data;

@Data
public class FactDto {
    private String text, type, date, year;
    private Boolean found;
    private Double number;
}
