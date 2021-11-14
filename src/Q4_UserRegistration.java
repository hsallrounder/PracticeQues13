class InvalidCountryException extends Exception{
    public InvalidCountryException() {
        super("User Outside India  cannot be registered");
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}
public class Q4_UserRegistration {
    String username,userCountry;
    void registerUser(String username,String userCountry){
        this.username=username;
        try {
            this.userCountry = userCountry;
            if(userCountry.equalsIgnoreCase("india")){
                System.out.println("User registration done successfully");
            }
            else{
                throw new InvalidCountryException();
            }
        }
        catch (InvalidCountryException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Q4_UserRegistration obj = new Q4_UserRegistration();
        obj.registerUser("Mickey","US");
        obj.registerUser("Mini","India");
    }
}
