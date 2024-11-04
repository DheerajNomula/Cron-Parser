package org.personal.fields;

public class DayOfMonth extends CronField {
    public DayOfMonth(String expression) {
        super("day of month", expression, 1, 31);
    }

}
