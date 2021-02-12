package email.application;

public class EmailApplication {                         
    public static void main(String[] args) {
        Email em1 = new Email("John", "Doe");           // Creates new object "em1" with class Email
        
        System.out.println(em1.showInfo());             // Prints out the results of the show info method. 
    }
}
