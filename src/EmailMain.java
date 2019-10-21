public class EmailMain {

    public static void main(String[] args) {
        Email email1 = new Email("fn", "ln");
        email1.setAlternateEmail("fomo");
        System.out.println("Your alternate email is " + email1.getAlternateEmail());
        System.out.println(email1.showInfo());

    }
}
