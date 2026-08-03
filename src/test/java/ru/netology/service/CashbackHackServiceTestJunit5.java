package ru.netology.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTestJunit5 {
    @Test
    public void shouldRemainWithAmountOf999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 1;
        int actual = cashbackHackService.remain(999);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldRemainWithAmountOf1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldRemainWithAmountOf1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 999;
        int actual = cashbackHackService.remain(1001);
        Assertions.assertEquals(expected, actual);
    }
}
