package model;

public class Student extends User{
    private int id;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                "firstName=" + super.getFirstName() +
                "secondName=" + super.getSecondName() +
                "lastName=" + super.getLastName() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
    }
}
