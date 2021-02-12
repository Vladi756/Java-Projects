package email.application;

public class EmailApplication {
    public static void main(String[] args) {
        Email em1 = new Email("John", "Doe");
        
        System.out.println(em1.showInfo());
    }
}
