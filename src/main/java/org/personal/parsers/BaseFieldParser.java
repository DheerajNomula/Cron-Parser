package org.personal.parsers;

import org.personal.fields.CronField;

import java.util.List;

public abstract class BaseFieldParser {

    protected CronField cronField;

    public BaseFieldParser(CronField cronField) {
        this.cronField = cronField;
    }

    public abstract List<Integer> generateValues();

    protected void validateExpression(List<Integer> values) {
        // todo if list is empty then validation?
        values.forEach(this::validateValue);
    }

    protected void validateValue(Integer value) {
        if (value < (int) cronField.getMin() || value > (int) cronField.getMax()) {
            throw new IllegalArgumentException("Invalid value: " + value);
        }
    }
}
