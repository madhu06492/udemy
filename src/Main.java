import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Address addressIasColony = new Address("sp yadav", "Ias colony", "801503");
        Address addressRps = new Address("usha niwas", "rps more", "890654");
        Address addressXyz = new Address("anil kumar", "xyz colony", "890644");

        Student studentMadhuri = new Student("madhuri", 1, 96.00, addressIasColony);
        Student studentMadhubala = new Student("madhubala", 2, 97.00, addressIasColony);
        Student studentTanu = new Student("tanu", 3, 99.0, addressXyz);

        School school = new School("krishna niketan school");

        System.out.println("school name:" + school.getName());

        System.out.println("name:" + studentMadhuri.getName());
        System.out.println("rollNumber:" + studentMadhuri.getRollNumber());
        System.out.println("marks:" + studentMadhuri.getMarks());
        System.out.println("address:" + studentMadhuri.getAddress().getOwnerName() + " "
                + studentMadhuri.getAddress().getAddress() + " "
                + studentMadhuri.getAddress().getPincode());

        ArrayList<Student> students = school.getStudents();
        students.add(studentMadhuri);
        System.out.println(students.size());

        System.out.println("name:" + studentMadhubala.getName());
        System.out.println("rollNumber:" + studentMadhubala.getRollNumber());
        System.out.println("marks:" + studentMadhubala.getMarks());
        System.out.println("address:" + studentMadhubala.getAddress().getOwnerName() + " "
                + studentMadhubala.getAddress().getAddress() + " "
                + studentMadhubala.getAddress().getPincode());

        students.add(studentMadhubala);
        System.out.println(students.size());

        System.out.println("name:" + studentTanu.getName());
        System.out.println("roll number:" + studentTanu.getRollNumber());
        System.out.println("marks:" + studentTanu.getMarks());
        System.out.println("address:" + studentTanu.getAddress().getOwnerName() + " "
                + studentTanu.getAddress().getAddress() + " "
                + studentTanu.getAddress().getPincode());
        students.add(studentTanu);
        System.out.println(students.size());


        // print the name of all the students in school
        System.out.println("Print the name of all the students in school >>> ");
        ArrayList<Student> studentArrayList = school.getStudents();
        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.println(studentArrayList.get(i).getName());
        }


    }
}
