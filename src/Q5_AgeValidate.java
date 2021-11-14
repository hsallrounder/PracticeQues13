class InvalidAgeException extends Exception{
    public InvalidAgeException() {
        super("Age a should be 18<=a<60.");
    }
}

public class Q5_AgeValidate {
    String name;
    Integer age;

    public Q5_AgeValidate(String name, Integer age) {
        this.name = name;
        try {
            this.age = age;
            if(age<18 || age>=60){
                throw new InvalidAgeException();
            }
            else {
                System.out.println("You are not an Adult.");
            }
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Q5_AgeValidate obj = new Q5_AgeValidate(args[0],Integer.parseInt(args[1]));
    }
}
