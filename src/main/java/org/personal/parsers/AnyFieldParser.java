package org.personal.parsers;

import org.personal.fields.CronField;

import java.util.LinkedList;
import java.util.List;

public class AnyFieldParser extends BaseFieldParser {

    public AnyFieldParser(CronField cronField) {
        super(cronField);
    }

    @Override
    public List<Integer> generateValues() {
        List<Integer> list = new LinkedList<>();
        for (int i = cronField.getMin(); i <= cronField.getMax(); i++) {
            list.add(i);
        }
        return list;
    }
}
