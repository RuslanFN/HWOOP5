package model;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int index;
    private final List<Student> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        studentList = studentGroup.getStudentList();
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size() - 1;
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }
}
