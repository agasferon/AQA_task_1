package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashBackServiceTestJunitJupiter {
    CashBackService service = new CashBackService();

    @Test
    public void shouldCalculateNeedToBuyIfZeroJUnit5(){
        int amount = service.remain(0);
        assertEquals(1000, amount);
    }

    @Test
    public void shouldCalculateNeedToBuyJUnit5(){
        int amount = service.remain(700);
        assertEquals(300, amount);
    }

    @Test
    public void shouldCalculateNeedToBuyIfThousandJUnit5(){
        int amount = service.remain(1000);
        assertEquals(0, amount);
    }

    @Test
    public void shouldCalculateNeedToBuyIfOverThousandJUnit5(){
        int amount = service.remain(1700);
        assertEquals(300, amount);
    }
}