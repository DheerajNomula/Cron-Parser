package org.personal;

import lombok.Setter;
import org.personal.fields.CronField;
import org.personal.parsers.*;

@Setter
public class CronFieldParserFactory {
    public static BaseFieldParser getFieldParser(CronField cronField) {
        // todo regex matching and get exact field, mix of fields are also valid, 1-5/2
        String expression = cronField.getExpression();
        if (expression.equals("*"))
            return new AnyFieldParser(cronField);
        else if (expression.contains("/"))
            return new StepFieldParser(cronField);
        else if (expression.contains("-"))
            return new RangeFieldParser(cronField);
        else if (expression.contains(","))
            return new ListFieldParser(cronField);
        else
            return new ExactFieldParser(cronField);// todo match number else throw exception
    }
}
