import org.junit.Test;

import static org.junit.Assert.*;

public class tovarPTest {

    @Test
    public void getQuantity() {
        Tovar tov1 = new tovarP("Хлеб", 12, 13, 8, 12, 13);
        assertEquals("13", String.valueOf(((tovarP) tov1).getQuantity()));
    }

    @Test
    public void price() {
        Tovar tov2 = new tovarP("Бутылка воды", 5, 7, 3, 12, 3);
        assertEquals("28.0", String.valueOf(((tovarP) tov2).price(4)));
    }

}