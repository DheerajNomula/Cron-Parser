import org.junit.Before;
import org.junit.Test;
import org.personal.CronFieldParser;


public class CronFieldParserTest {

    private CronFieldParser parser;

    @Before
    public void setUp() {
        parser = new CronFieldParser();
    }

    @Test
    public void testValidInput() {
        String cronExpression = "*/15 0 1,15 * MON-FRI /usr/bin/find -v foo";
        parser.parse(cronExpression);
        // Add assertions to verify the output if necessary
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInputTooFewArguments() {
        String cronExpression = "*/15 0 1,15 * 1-5";
        parser.parse(cronExpression);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInputTooManyArguments() {
        String cronExpression = "*/15 0 1,15 * 1-5 /usr/bin/find extra";
        parser.parse(cronExpression);
    }

}