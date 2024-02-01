package view;


import model.Student;
import model.StudentGroup;

public class StudentGroupView {
    private final StudentView studentView = new StudentView();
    public void printGroup(StudentGroup studentGroup){
        System.out.println(studentGroup.getTeacher());
        for(Student student:studentGroup.getStudentList()){
            studentView.printInGroup(student);
        }
    }
}
