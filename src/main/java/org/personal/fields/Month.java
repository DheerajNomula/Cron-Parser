package org.personal.fields;

public class Month extends CronField {

    // todo we need day information to calculate the month
    public Month(String expression) {
        super("month", expression, 1, 12);
    }

}
