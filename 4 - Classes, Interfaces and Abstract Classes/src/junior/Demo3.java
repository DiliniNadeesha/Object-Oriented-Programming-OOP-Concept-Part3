package junior;

import senior.IManageStudentController;

public class Demo3 {

    public static void main(String[] args) {
        IManageStudentController ctrl = new IManageStudentController(){

            @Override
            public void addStudent() {
                System.out.println("Add Student Anon1");
            }

            @Override
            public void deleteStudent() {
                System.out.println("Delete Student Anon1");
            }

            @Override
            public void printStudent() {
                System.out.println("Print Student Anon1");
            }
        };
        ctrl.addStudent();
        ctrl.deleteStudent();
        ctrl.printStudent();

        IManageStudentController ctrl2 =new IManageStudentController(){

            @Override
            public void addStudent() {
                System.out.println("Add Student Anon2");
            }

            @Override
            public void deleteStudent() {
                System.out.println("Delete Student Anon2");
            }

            @Override
            public void printStudent() {
                System.out.println("Print Student Anon2");
            }
        };
        ctrl2.addStudent();
        ctrl2.deleteStudent();
        ctrl2.printStudent();
    }

}
