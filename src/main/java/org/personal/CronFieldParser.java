package org.personal;

import com.sun.deploy.util.StringUtils;
import org.personal.fields.*;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CronFieldParser {

    public void parse(String s) {

        String[] expressions = s.split(" ");

        if (expressions.length < 6) {
            throw new IllegalArgumentException("Invalid number of arguments");
        }

        List<CronField> fields = new LinkedList<>();
        fields.add(new Minute(expressions[0]));
        fields.add(new Hour(expressions[1]));
        fields.add(new DayOfMonth(expressions[2]));
        fields.add(new Month(expressions[3]));
        fields.add(new WeekDay(expressions[4]));

        for (CronField field : fields) {
            List<Integer> possibleValues = CronFieldParserFactory.getFieldParser(field).generateValues();
            System.out.printf("%-14s %s\n", field.getFieldName(), possibleValues.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" ")));
        }

        List<String> commands = new LinkedList<>();

        for (int index = 5; index < expressions.length; index++)
            commands.add(expressions[index]);
        System.out.printf("%-14s %s\n", "command", StringUtils.join(commands, " "));


        // Allow for day names in day field (Mon, Tue, Wed, Thu, Fri, Sat, Sun)
        //*/15 0 1,15 * Mon-Fri /usr/bin/find -v foo
    }
}
