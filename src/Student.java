public class Student {
    private String name;
    private int rollNumber;
    private Double Marks;
    private Address address;

    public Student(String name, int rollNumber, Double marks, Address address) {
        this.name = name;
        this.rollNumber = rollNumber;
        Marks = marks;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public Double getMarks() {
        return Marks;
    }

    public Address getAddress() {
        return address;
    }
}
