import io.zipcoder.polymorphism.Dog;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void dogConstructorTest(){
        Dog dog = new Dog("Cooper");

        String expected = "Cooper";
        String actual = dog.getName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void speakTest(){
        Dog dog = new Dog("Cooper");

        String expected = "woof woof!";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
}
