package junior;

import senior.IManageStudentController;

public class ManageStudentControllerImpl implements IManageStudentController {
    @Override
    public void addStudent() {
        System.out.println("Add Student");
    }

    @Override
    public void deleteStudent() {
        System.out.println("Delete Student");
    }

    @Override
    public void printStudent() {
        System.out.println("Print Student");
    }
}
