import static org.junit.Assert.*;

public class BuyerTest {

    @org.junit.Test
    public void getName() {
        Buyer b1 = new Buyer("Иван", 100, 15 );
        assertEquals("Иван", b1.getName());
    }

    @org.junit.Test
    public void getMoney() {
        Buyer b2 = new Buyer("Петр", 150, 20 );
        assertEquals("150.0", String.valueOf(b2.getMoney()));
    }


    @org.junit.Test
    public void getAge() {
        Buyer b3 = new Buyer("Мария", 200, 30 );
        assertEquals("old", b3.getAge().toString());
    }
}