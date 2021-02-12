package email.application;
import java.util.Scanner;

public class Email {                                                // Class "email".
    private String firstName;
    private String lastName; 
    private String password;
    private String department;
    private String alternativeEmail;
    private String email;
    private String companySuffix = "company.com";
    private int defaultPasswordLength = 10;
    private int mailboxCapacity = 500;                              // Initializing and/or declaring all variables. 
    
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        department = setDepartment(); 
        
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }
    
    private String setDepartment() {                                                                                                // Function to find users department.
        System.out.println("New worker " + firstName + " " +lastName + " Enter your department code:\n 1. for Sales \n "
                                             + "2. for Development\n "
                                             + "3. for Accounting \n "
                                             + "0. for none.");
        System.out.println("Enter your department code:");
        Scanner in = new Scanner(System.in);
        int dptChoice = in.nextInt();
        
        switch (dptChoice) {
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            default:
                return "N/A";
        }
    }
    private String randomPassword(int length) {                                                 // Generates random password.
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        char[]pass = new char[length];
        
        for(int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            pass[i] = passwordSet.charAt(rand);
        }
        return new String(pass);
    }
    
    public void setMailboxCapacity(int capacity) {  
        this.mailboxCapacity = capacity;
    }
    public void setAlternativeEmail(String altEmail) {
        this.alternativeEmail = altEmail;
    }
    public void changePassword(String password) {
        this.password = password;
    }
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternativeEmail() {
        return alternativeEmail;
    }
    public String getPassword() {
        return password;
    }                                                               // Simple, one line functions designed to either change something, or simply retrieve something.
    
    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName +
               ".\nCompany Email: " + email + 
               ".\nMailbox Capacity: " + mailboxCapacity + "mb.";
    }
}                                                                  // Shows all the generated information about the user.
