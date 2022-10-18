import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void testImplementation(){
        //given
        Student student = new Student(12345,"Saad",4.0);

        //then
        Assert.assertTrue(student instanceof Learner);
    }


    @Test
    public void testInheritance(){
        //given
        Student student = new Student(12345,"Saad",5.0);

        //then
        Assert.assertTrue(student instanceof Person);

    }

    @Test
    public void testLearn(){
        //given
        Student student = new Student(12345,"Saad",0.0);
        Double expected = 10.0;
        //when
        student.learn(expected);
        //then
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual);
    }

}