import java.util.ArrayList;

public class School {
    private String name;
     private ArrayList<Student > students;

    public School(String name ) {
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
