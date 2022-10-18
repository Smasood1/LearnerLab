import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testConstructor(){

        //given

        Long expectedId = 1234L;
        String expectedName = "Saad";


        //when

        Person person = new Person(expectedId,expectedName);

        //then
        Long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actualName);
    }






    @Test
    public void testSetName(){

        //given
        Person person = new Person(1234L,"");
        String expectedName = "Saad";
        //when

        person.setName(expectedName);
        //then

        String actualName = person.getName();
        Assert.assertEquals(expectedName,actualName);



    }

}