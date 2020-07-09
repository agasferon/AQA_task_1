package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackServiceTest {
    CashBackService service = new CashBackService();

    @Test
    public void shouldCalculateNeedToBuyIfZero(){
        int amount = service.remain(0);
        assertEquals(amount, 1000);
    }

    @Test
    public void shouldCalculateNeedToBuy(){
        int amount = service.remain(700);
        assertEquals(amount, 300);
    }

    @Test
    public void shouldCalculateNeedToBuyIfThousand(){
        int amount = service.remain(1000);
        assertEquals(amount, 1000);
    }

    @Test
    public void shouldCalculateNeedToBuyIfOverThousand(){
        int amount = service.remain(1700);
        assertEquals(amount, 300);
    }
}