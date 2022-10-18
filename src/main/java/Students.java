public class Students extends People <Student>{
    final static Students INSTANCE = new Students();

    private Student[] studentsArray;

    private Students(){
        Student student1 = new Student(1234L,"Saad");
        Student student2 = new Student(1324L,"Masood");
        Student student3 = new Student(1214L,"L");

        studentsArray = new Student[]{student1,student2,student3};

    }

    public static Students getInstance(){
        return INSTANCE;
    }

}
