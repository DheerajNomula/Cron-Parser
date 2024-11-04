package org.personal.fields;

import lombok.Getter;

@Getter
public abstract class CronField {
    protected int min;
    protected int max;
    private String fieldName;
    protected String expression;

    public CronField(String fieldName, String expression, int min, int max) {
        this.fieldName = fieldName;
        this.expression = expression;
        this.min = min;
        this.max = max;
    }

}
