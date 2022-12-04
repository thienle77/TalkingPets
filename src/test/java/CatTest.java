import io.zipcoder.polymorphism.Cat;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void catConstructorTest(){
        Cat cat = new Cat("Orange");

        String expected = "Orange";
        String actual = cat.getName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void speakTest(){
        Cat cat = new Cat("Orange");

        String expected = "meeoow!";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
}
