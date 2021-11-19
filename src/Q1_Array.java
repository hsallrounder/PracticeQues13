import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1_Array {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array");
            String n = sc.next();
            Integer[] arr = new Integer[Integer.parseInt(n)];
            System.out.println("Enter the elements in the array");
            for(int i=0;i<Integer.parseInt(n);i++){
                arr[i] = Integer.parseInt(sc.next());
            }
            System.out.println("Enter the index of the array element you want to access");
            String index = sc.next();
            System.out.println("The array element at index 1 = " + arr[Integer.parseInt(index)]);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }
        catch (NumberFormatException e){
            System.out.println("java.lang.NumberFormatException");
        }
    }
}
