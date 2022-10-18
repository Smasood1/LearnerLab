import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<S extends Person> implements Iterable<Person> {

    private List<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        Person p1 = null;
        for (Person x : personList) {
            if (x.getId() == id){
                p1 = x;
            }
        }
        return p1;
    }

    public boolean contains(Person person){
        for (Person x : personList) {
            if (personList.contains(person)){
                return true;
            }
        }
        return false;
    }

    public void remove(Person person) {
        personList.remove(person);
    }



    public void remove(long id){
        for (Person x : personList) {
            if (x.getId() == id){
                personList.remove(x);
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Object[] toArray(){
        return personList.toArray();
    }


    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}