package net.atos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {
    private Stock stock;

    @Before
    public void set() {
        System.out.println("Reseting");
        stock = new Stock();
    }

    @Test
    public void incrCookies() throws Exception {
        int ctr;
        ctr = stock.incrCookies();
        assertEquals(1, ctr);
        ctr = stock.incrCookies();
        assertEquals(2, ctr);
        ctr = stock.incrCookies();
        assertEquals(3, ctr);
    }

    @Test
    public void getCookies() throws Exception {
        assertEquals(0, stock.getCookies());
    }

    @Test
    public void resetCookies() throws Exception {
        stock.resetCookies();
        assertEquals(0, stock.getCookies());
        stock.incrCookies();
        stock.incrCookies();
        assertEquals(2, stock.getCookies());
        stock.resetCookies();
        assertEquals(0, stock.getCookies());
    }

}