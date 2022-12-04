import io.zipcoder.polymorphism.Fish;
import org.junit.Assert;
import org.junit.Test;

public class FishTest {

    @Test
    public void fishConstructorTest(){
        Fish fish = new Fish("Nemo");

        String expected = "Nemo";
        String actual = fish.getName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void speakTest(){
        Fish fish = new Fish("Nemo");

        String expected = "bloop bloop!";
        String actual = fish.speak();

        Assert.assertEquals(expected, actual);
    }
}
