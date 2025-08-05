package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {
    @Test
    public void PurchaseLessThan1000() {
        CashbackHackService cervice = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = cervice.remain(amount);


        assertEquals(expected, actual);
    }

    @Test
    public void purchaseForExactly1000() {
        CashbackHackService cervice = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = cervice.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void PurchaseOfMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1700;

        int expected = 300;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
  
}