import java.util.Scanner;

class InvalidValueException extends Exception{
    public InvalidValueException() {
        super("Invalid Value. The number should be between 0 to 100.");
    }
}

public class Q3_Marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[3];
        for(int j=0;j<2;j++) {
            System.out.println("Enter the name of student");
            String name = sc.next();
            System.out.println("Enter the marks of student");
            Integer sum = 0;
            for (int i = 0; i < 3; i++) {
                try {
                    arr[i] = Integer.parseInt(sc.next());
                    if (arr[i] < 0 || arr[i] > 100) {
                        throw new InvalidValueException();
                    }
                }
                catch (InvalidValueException e) {
                    System.out.println(e.getMessage());
                }
                sum += arr[i];
            }
            System.out.println("Average marks of student " + name + " = " + sum / arr.length);
            System.out.println();
        }
        sc.close();
    }
}
