package ru.netology.cashbackservice;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldOffer10() {
        CashbackHackService service = new CashbackHackService();
        int amount;
        int expected = 10;
        int actual = service.remain(990);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldOffer200() {
        CashbackHackService service = new CashbackHackService();
        int amount;
        int expected = 200;
        int actual = service.remain(800);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldOffer0() {
        CashbackHackService service = new CashbackHackService();
        int amount;
        int expected = 0;
        int actual = service.remain(1_000);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldOffer300() {
        CashbackHackService service = new CashbackHackService();
        int amount;
        int expected = 300;
        int actual = service.remain(700);
        Assert.assertEquals(expected, actual);
    }



}