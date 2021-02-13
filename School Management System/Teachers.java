package school_management_system;

/* This class keeps track of teachers and
all the information pertaining to them: 
id, name, salary. */

public class Teachers {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;
    
    // Responsible for creating a new teacher object.
    
    Teachers(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }
    
    public void setSalary(int salary) { this.salary = salary; }
    
    public int getID() {return id; }
    public String getName() {return name; }
    public int getSalary() {return salary; }     // Functions to return every field. 
    
    public void recieveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salaryEarned);
    }
}
