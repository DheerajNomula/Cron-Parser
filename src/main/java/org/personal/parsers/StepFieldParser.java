package org.personal.parsers;

import org.personal.fields.CronField;

import java.util.LinkedList;
import java.util.List;

public class StepFieldParser extends BaseFieldParser {

    public StepFieldParser(CronField cronField) {
        super(cronField);
    }

    @Override
    public List<Integer> generateValues() {
        String expression = cronField.getExpression();
        // todo need to compare step value with cron field's min and max
        int step = Integer.parseInt(expression.split("/")[1]);
        if (step == 0) {
            throw new IllegalArgumentException("Invalid step value: " + step);
        }
        List<Integer> list = new LinkedList<>();
        for (int i = cronField.getMin(); i <= cronField.getMax(); i += step) {
            list.add(i);
        }
        return list;
    }
}
