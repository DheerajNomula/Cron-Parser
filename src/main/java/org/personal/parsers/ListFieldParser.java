package org.personal.parsers;

import org.personal.fields.CronField;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFieldParser extends BaseFieldParser {

    public ListFieldParser(CronField cronField) {
        super(cronField);
    }

    @Override
    public List<Integer> generateValues() {
        String expression = cronField.getExpression();
        List<Integer> values = Arrays.stream(expression.split(","))
                .map(Integer::parseInt).collect(Collectors.toList());
        validateExpression(values);
        return values;
    }
}
