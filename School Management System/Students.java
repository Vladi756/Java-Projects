package school_management_system;

    /* This class is resonsible for keeping track of student fees, name, 
    id, grade, fees total, paid. 
    */

public class Students {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
    
    /* Constructor to specify the creation of a new student object by initializing values. 
    Fees for every student is $30,000/year.
    Fees paid initially = 0.
    id = unique student number 
    name = student's given name 
    grade = the grade the student is in.
    */
    Students(int id, String name, int grade) {
        feesPaid = 0;
        feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    
    // Not going to alter student's name or student's ID.
    
    // Used to update the student's grade. 
    public void setGrade(int grade) {
        this.grade = grade;
    }
    /* Add the fees to the fees paid. 
    The school will recieve the funds. 
    Keep adding the fees into fees paid field.
    */
    public void payFees(int fees) {
        this.feesPaid += fees; 
        School.updateTotalMoneyEarned(feesPaid);
    }
    
    public int getID() { return id; }
    public String getName() { return name; }
    public int getGrade() { return grade; }
    public int getFeesPaid() { return feesPaid; }
    public int geetFeesTotal() { return feesTotal; }
    
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }
}