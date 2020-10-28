package org.wecancodeit;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagementSystemApp {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Mellisa", 700);
        Teacher Vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(Vanderhorn);

        Student stu1 = new Student(1,"Tamara",12);
        Student stu2 = new Student(2,"Rasha",10);
        Student rabbi = new Student(3,"Rabbi",5);

        List<Student> studentList = new ArrayList<>();

        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(rabbi);

        School whs = new School(teacherList,studentList);
        stu1.payfees(5000);
        stu2.payfees(6000);
        System.out.println("WHS has earned $" + whs.getTotalMoneyEarned());


        System.out.println("----------------MAKING SCHOOL PAY SALARY------------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("whs has paid " + lizzy.getName() + "" +
                " and now has $" + whs.getTotalMoneyEarned());

        System.out.println(melissa);
        System.out.println(stu1);

    }
}
