package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class usePrinterTest {
    @Test
    public void testSomething() {
        FakePrinter fake = new FakePrinter();
        UsePrinter use = new UsePrinter();

        use.doPrint(fake);

        assertEquals("this is a test", fake.getText());
    }
}
