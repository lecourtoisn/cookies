package net.atos;

public class Stock {
    private int cookies = 0;

    /**
     * Increments the number of cookies
     * @return the new number of cookies
     */
    public int incrCookies() {
        cookies += 1;
        return cookies;
    }

    public int getCookies() {
        return cookies;
    }

    public void resetCookies() {
        cookies = 0;
    }
}
