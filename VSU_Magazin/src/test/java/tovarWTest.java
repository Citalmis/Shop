import org.junit.Test;

import static org.junit.Assert.*;

public class tovarWTest {

    @Test
    public void getQuantity() {
       Tovar tov = new tovarW("Сахар", 1, 1, 1, 4,1);
       assertEquals("1.0", Double.toString(((tovarW) tov).getQuantity()));
    }

    @Test
    public void price() {
        Tovar tov1 = new tovarW("Яблоки", 3, 4, 2, 4,1);
        assertEquals("12.0", Double.toString(((tovarW) tov1).price(3)));
    }

}