import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int mailboxCapacity = 50;
    private int defaultPasswordLength = 8;
    private String alternateEmail;
    private String companySuffix = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("email created for: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("You chose department: " + this.department);

        this.password = setPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("your email is: " + email);
    }

    private String setDepartment() {

        System.out.println("Choose the department:\n 1. Sales\n 2. Development\n 3. Accounting\n 0. None\n ");
        Scanner sysIn = new Scanner(System.in);
        int depChoice = sysIn.nextInt();

        if (depChoice == 1) {
            return "sales";

        } else if (depChoice == 2) {
            return "development";

        } else if (depChoice == 3) {
            return "accounting";
        } else
            return "";
    }

    private String setPassword(int length) {

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXZ0123456789@#%&";

        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getPassword() {
        return password;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
}
