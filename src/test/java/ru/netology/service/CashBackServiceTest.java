package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackServiceTest {
    CashBackService service = new CashBackService();

    @org.junit.Test
    public void shouldCalculateNeedToBuyIfZero(){
        int amount = service.remain(0);
        assertEquals(1000, amount);
    }

    @org.junit.Test
    public void shouldCalculateNeedToBuy(){
        int amount = service.remain(700);
        assertEquals(300, amount);
    }

    @org.junit.Test
    public void shouldCalculateNeedToBuyIfThousand(){
        int amount = service.remain(1000);
        assertEquals(0, amount);
    }

    @org.junit.Test
    public void shouldCalculateNeedToBuyIfOverThousand(){
        int amount = service.remain(1700);
        assertEquals(300, amount);
    }
}