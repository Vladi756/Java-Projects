package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class School_Management_System {
    public static void main(String[] args) { 
        Teachers Naomi = new Teachers(01, "Naomi", 2900);
        Teachers Mellisa = new Teachers(02, "Mellisa", 2500);
        Teachers Mike = new Teachers(03, "Mike", 2000);
        
        List<Teachers> teacherList = new ArrayList<>();
        teacherList.add(Naomi);
        teacherList.add(Mellisa);
        teacherList.add(Mike);                             // Adding teachers to array list
       
        
        Students Josh = new Students(01, "Josh", 12);
        Students Valery = new Students(02, "Valery", 11);
        Students Michael = new Students(03, "Michael", 9);      
        
        List<Students> studentList = new ArrayList<>();
        studentList.add(Josh);
        studentList.add(Valery);
        studentList.add(Michael);                           // Adding students to array list
       
        School BSS = new School(teacherList, studentList);
        
        Valery.payFees(5000);
        Josh.payFees(15000);
        
        System.out.println("BSS has earned a total of: $" + BSS.getTotalMoneyEarned());
        
        System.out.println("----Making BSS Pay Teachers Salaries-----");
        
        Naomi.recieveSalary(Naomi.getSalary());
        
        System.out.println("BSS has spent a total of: $" +Naomi.getSalary());   // Testing all the methods
        
    }
}
