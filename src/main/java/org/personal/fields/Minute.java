package org.personal.fields;

public class Minute extends CronField {
    public Minute(String expression) {
        super("minute", expression, 0, 59);
    }

}
