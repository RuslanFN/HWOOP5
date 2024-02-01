package service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class modelService {
    private List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }
    public List<User> getAllStudent(){
        List<User> resultList = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Student){
                resultList.add(user);
            }
        }
        return resultList;
    }

    public void create(String firstName, String secondName, String lastName, Type type){
        if (type == Type.STUDENT){
            Student student = new Student(firstName, secondName, lastName);
            student.setId(getMaxId(type));
            userList.add(student);
        }
        if (type == Type.TEACHER){
            Teacher teacher = new Teacher(firstName, secondName, lastName);
            teacher.setId(getMaxId(type));
            userList.add(teacher);
        }
    }
    private int getMaxId(Type type){
        boolean isStudent = Type.STUDENT == type;
        int lastId = 1;

        for (User user : userList){
            if (user instanceof Teacher && !isStudent){
                lastId = ((Teacher) user).getId() + 1;
            }
            if (user instanceof Student && isStudent){
                lastId = ((Student) user).getId() + 1;
            }

        }
        return lastId;
    }
}
