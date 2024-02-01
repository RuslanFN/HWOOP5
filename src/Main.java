import controller.Controller;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Teacher teacher = new Teacher("AAAA", "BBBB", "CCCC");
        controller.createStudent("Ruslan", "Fatkulin", "Nurgalievich");
        controller.createStudent("Denis", "Panov", "Dmitrievich");
        controller.createStudent("Ildus", "Shaigardanov", "Ildarovich");
        controller.createStudent("Aleksey", "Potapkov", "Alekseevich");
        //controller.getAllStudent();
        controller.makeStudentGroup(teacher);
        controller.printGroup();

    }
}