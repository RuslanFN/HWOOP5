package service;

import model.Student;
import model.StudentGroup;
import model.Teacher;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class StudentGroupService {
    public StudentGroup createStudentGroup(Teacher teacher, List<User> studentList){
        List<Student> students = new ArrayList<>();
        for (User user:studentList) {students.add((Student) user);}
        return new StudentGroup(teacher, students);
    }


}
