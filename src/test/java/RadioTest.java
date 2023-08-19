import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void Stationtest1() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Stationtest2() {
        Radio radio = new Radio();

        radio.setCurrentStation(-10);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Stationtest3() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Stationtest4() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Stationtest5() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Stationtest6() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Stationtest7() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Stationtest8() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Stationtest9() {
        Radio radio = new Radio();

        radio.setCurrentStation(25);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void nextTest1() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void nextTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void nextTest3() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void nextTest4() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void nextTest5() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prevTest1() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prevTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prevTest3() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prevTest4() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 7;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prevTest5() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int actual = radio.getCurrentVolume();
        int expected = 50;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-20);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeTest3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeTest4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeTest5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeTest6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeTest7() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeTest8() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeTest9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(120);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void increaseTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 51;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void increaseTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void increaseTest3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void increaseTest4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void increaseTest5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void reduceTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 49;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void reduceTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void reduceTest3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void reduceTest4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 98;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void reduceTest5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(actual, expected);
    }
}
