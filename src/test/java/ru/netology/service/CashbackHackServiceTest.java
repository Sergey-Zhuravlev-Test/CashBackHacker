package ru.netology.service;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldFoundRemainder() {
        CashbackHackService service = new CashbackHackService();
        int expected = 600;
        int actual = service.remain(400);

        org.testng.Assert.assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void minOrder() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1);

        org.testng.Assert.assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void maxOrder() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);

        org.testng.Assert.assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void fullOrder() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        org.testng.Assert.assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void noOrder() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);

        org.testng.Assert.assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void severalThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 300;
        int actual = service.remain(3700);

        org.testng.Assert.assertEquals(actual, expected);

    }
}