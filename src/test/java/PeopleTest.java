import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {
    @Test
    public void add() {
        //given
        Student saad = new Student(123L,"Saad");
        People<Person> people = new People<Person>();
        //when
        people.add(saad);
        //then
        assertTrue(people.contains(saad));
    }

    @Test
    public void remove() {
        //given
        Student saad = new Student(123L,"Saad");
        People<Person> people = new People<Person>();
        //when
        people.remove(saad);
        //then
        assertFalse(people.contains(saad));
    }

    @Test
    public void findById() {
        //given
        Student saad = new Student(123L,"Saad");

        People<Person> people = new People<Person>();

        people.add(saad);

        //when
        Person actual = people.findById(123L);
        //then

        assertEquals(saad,actual);

    }

}