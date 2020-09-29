import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IdiotTest {

    private Idiot idiot;

    @BeforeEach
    public void setup()
    {
        idiot = new Idiot();
    }


    @Test
    void testIdiot() {
        assert (idiot.text().equals("Idiot"));
    }

    @Test
    void testFail() {
        assert (!idiot.text().equals("Fail"));
    }
}
