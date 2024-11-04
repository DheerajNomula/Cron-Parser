package org.personal.fields;

public class Hour extends CronFieldx {

    public Hour(String expression) {
        super("hour", expression, 0, 23);
    }

}
