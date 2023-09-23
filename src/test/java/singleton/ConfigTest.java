package singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ConfigTest {

    @Test
    public void deveRetornarUmCanal() {
        Config config = Config.getInstance();
        config.addCanal("Canal 1");
        assertEquals(1, config.getCanais().size());
    }
}
