import static org.junit.jupiter.api.Assertions.*;


import org.junit.Assert;
import org.junit.Test;

class InstructorTest {

    @Test
    public void testImplementation(){
        //given
        Instructor instructor = new Instructor(2345,"Saad");
        //when
        //then
        Assert.assertTrue(instructor instanceof Teacher);

    }

    @Test
    public void testInheritance(){
        //given
        Instructor instructor = new Instructor(15512,"Saad");
        //when

        //then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        //given
        Instructor instructor = new Instructor(13551,"Saad");
        Learner learner = new Student(12412,"Mems",10.0);
        Double expected = 20.0;
        //when
        instructor.teach(learner,10.0);
        //then
        Double actual = learner.getTotalStudyTime();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testLecture(){

        //given
        Instructor instructor = new Instructor(12451,"Mikaila");

        Student student1 = new Student(1234,5);
        Student student2 = new Student(1345,5);
        Student student3 = new Student(1512,5);


        Student[] students = {student1,student2,student3};

        Double expected = 10.0;

        //when

        instructor.lecture(students,15);

        //then

        Double actual1 = student1.getTotalStudyTime();
        Double actual2 = student2.getTotalStudyTime();
        Double actual3 = student3.getTotalStudyTime();

        Assert.assertEquals(expected,actual1);
        Assert.assertEquals(expected,actual2);
        Assert.assertEquals(expected,actual3);

    }

}