package org.personal.fields;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//minute, hour, day of month, month, and day of week
public class WeekDay extends CronField {

    private static final Map<String, Integer> weekDayMap;

    static {
        Map<String, Integer> aMap = new HashMap<>();
        aMap.put("SUN", 1);
        aMap.put("MON", 2);
        aMap.put("TUE", 3);
        aMap.put("WED", 4);
        aMap.put("THU", 5);
        aMap.put("FRI", 6);
        aMap.put("SAT", 7);
        weekDayMap = Collections.unmodifiableMap(aMap);
    }

//    private static String convert(String expression) {
//        String s = expression;
//        for (Map.Entry<String, Integer> entry : weekDayMap.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            s = s.replace(key, String.valueOf(value));
//        }
//        return s;
//    }

    public WeekDay(String expression) {
        super("day of week", expression, 1, 7);
        String s = this.expression;

        for (Map.Entry<String, Integer> entry : weekDayMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            s = s.replace(key, String.valueOf(value));
        }
        this.expression = s;
    }

}
