import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewTest {
    @Test
    void newTest() {
        int i = 42+10;
        System.out.println("This is the best test");
        Assertions.assertTrue(i > 2);
    }
}
