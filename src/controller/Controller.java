package controller;

import model.*;
import service.StudentGroupService;
import service.modelService;
import view.StudentGroupView;
import view.StudentView;

public class Controller {
    private StudentGroup studentGroup;
    private final StudentGroupView studentGroupView = new StudentGroupView();
    private final modelService service = new modelService();
    private final StudentView view = new StudentView();
    private final StudentGroupService studentGroupService = new StudentGroupService();

    public Controller() {
    }

    public void createStudent(String firstName, String secondName, String lastname){
        service.create(firstName, secondName, lastname, Type.STUDENT);
    }
    public void getAllStudent(){
        for(User user: service.getAllStudent()){
            view.printConsole((Student) user);
        }
    }
    public void makeStudentGroup(Teacher teacher){
        studentGroup = studentGroupService.createStudentGroup(teacher, service.getAllStudent());
    }
    public void printGroup(){
        studentGroupView.printGroup(studentGroup);
    }
}
