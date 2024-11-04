import org.junit.Before;
import org.junit.Test;
import org.personal.fields.CronField;
import org.personal.fields.Minute;
import org.personal.parsers.AnyFieldParser;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnyFieldParserTest {

    private AnyFieldParser anyFieldParser;
    private CronField cronField;

    @Before
    public void setUp() {
        cronField = new Minute("*"); // Assuming CronField takes min and max values
        anyFieldParser = new AnyFieldParser(cronField);
    }

    @Test
    public void testGenerateValues() {
        List<Integer> values = anyFieldParser.generateValues();
        assertEquals(60, values.size()); // Expecting 60 values from 0 to 59
        for (int i = 0; i < 60; i++) {
            assertEquals(Integer.valueOf(i), values.get(i));
        }
    }
}