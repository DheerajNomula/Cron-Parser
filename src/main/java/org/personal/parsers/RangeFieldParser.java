package org.personal.parsers;

import org.personal.fields.CronField;

import java.util.LinkedList;
import java.util.List;

public class RangeFieldParser extends BaseFieldParser {

    public RangeFieldParser(CronField cronField) {
        super(cronField);
    }

    @Override
    public List<Integer> generateValues() {
        // todo throw a validation in case of start > end
        // todo need to compare start, end with cron field's min and max
        String expression = cronField.getExpression();
        int start = Integer.parseInt(expression.split("-")[0]);
        int end = Integer.parseInt(expression.split("-")[1]);
        List<Integer> list = new LinkedList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        validateExpression(list);
        return list;
    }
}
