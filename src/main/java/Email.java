public class Email {

    private String password;
    private String department;
    private String alternateEmail;



    //generate random password .. call a method that return random password
    public String randomPassowrd(int length) {
        String passwordSet = "ABCDEFGHIJIKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char [length];
        for(int i = 0; i < length; i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    //set alternate email

    // change the password

}
