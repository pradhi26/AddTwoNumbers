
package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        App obj = new App();
        assertEquals(30, obj.add(10, 20));
    }
}