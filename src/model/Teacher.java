package model;

public class Teacher extends User{
    private int id;

    @Override
    public String toString() {
        return "Teacher{" +
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

    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
    }
}
