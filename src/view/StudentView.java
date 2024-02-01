package view;

import model.Student;

public class StudentView {
    public void printConsole(Student student){
        System.out.println(student.toString());
    }
    public void printInGroup(Student student){
        System.out.println(student.getSecondName() + " " + student.getFirstName() + " " + student.getLastName());
    }
}
