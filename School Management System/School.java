package school_management_system;
import java.util.List;

public class School {

    private List<Teachers> teachers;
    private List<Students> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teachers> teachers, List<Students> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    // Getters 
    
    public List<Teachers> getTeachers() {
        return teachers;
    }

    public List<Students> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // Setters
    
    public void addTeacher(Teachers teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Students student) {
        students.add(student);
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }      
}
