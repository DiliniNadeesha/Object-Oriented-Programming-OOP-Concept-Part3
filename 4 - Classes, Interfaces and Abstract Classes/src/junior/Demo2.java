package junior;

public class Demo2 {

    public static void main(String[] args) {
        ManageStudentControllerImpl ctrl = new ManageStudentControllerImpl();
        ctrl.addStudent();
        ctrl.deleteStudent();
        ctrl.printStudent();

        ManageStudentControllerImpl ctrl2 = new ManageStudentControllerImpl();
        ctrl2.printStudent();

        ManageStudentControllerImpl ctrl3 = new ManageStudentControllerImpl();
        ctrl3.printStudent();
    }

}
