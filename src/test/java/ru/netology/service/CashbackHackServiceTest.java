package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {
    @Test
    public void shouldRemainWithAmountOf999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 1;
        int actual = cashbackHackService.remain(999);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldRemainWithAmountOf1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldRemainWithAmountOf1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 999;
        int actual = cashbackHackService.remain(1001);
        Assert.assertEquals(actual, expected);
    }
}
