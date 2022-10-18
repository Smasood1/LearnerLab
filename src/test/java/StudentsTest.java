import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    @Test
    public void test (){

        Assert.assertEquals("Saad", Students.getInstance().findById(1234L).getName());
        Assert.assertEquals("Masood",Students.getInstance().findById(1324L).getName());
        Assert.assertEquals("L",Students.getInstance().findById(1214L).getName());

    }
}