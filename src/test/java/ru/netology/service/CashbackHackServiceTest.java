package ru.netology.service;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldFoundRemainder() {
        CashbackHackService service = new CashbackHackService();
        int expected = 600;
        int actual = service.remain(400);

        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void minOrder() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1);

        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void maxOrder() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);

        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void fullOrder() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void noOrder() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);

        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void severalThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 300;
        int actual = service.remain(3700);

        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void shouldFoundRemainderJA() {
        CashbackHackService service = new CashbackHackService();
        int expected = 600;
        int actual = service.remain(400);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void minOrderJA() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void maxOrderJA() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void fullOrderJA() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void noOrderJA() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void severalThousandJA() {
        CashbackHackService service = new CashbackHackService();
        int expected = 300;
        int actual = service.remain(3700);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }
}