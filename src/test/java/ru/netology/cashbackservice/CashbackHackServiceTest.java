package ru.netology.cashbackservice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldOffer1() {
        CashbackHackService service = new CashbackHackService();
        int amount;
        int expected = 1;
        int actual = service.remain(999);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldOffer999() {
        CashbackHackService service = new CashbackHackService();
        int amount;
        int expected = 999;
        int actual = service.remain(1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldOffer0() {
        CashbackHackService service = new CashbackHackService();
        int amount;
        int expected = 0;
        int actual = service.remain(1_000);
        Assert.assertEquals(actual, expected);
    }

    
}