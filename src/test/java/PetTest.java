import io.zipcoder.polymorphism.Pet;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void petConstructorTest(){
        Pet pet  = new Pet("Buddy");

        String expected = "Buddy";
        String actual = pet.getName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void speakTest(){
        Pet pet = new Pet("Buddy");

        String expected = "";
        String actual = pet.speak();

        Assert.assertEquals(expected, actual);
    }

}
