package org.personal.parsers;

import org.personal.fields.CronField;

import java.util.Collections;
import java.util.List;

public class ExactFieldParser extends BaseFieldParser {

    public ExactFieldParser(CronField cronField) {
        super(cronField);
    }

    @Override
    public List<Integer> generateValues() {
        return Collections.singletonList(Integer.parseInt(cronField.getExpression()));
    }
}
