public class Q2_MathOperation {
    public static void main(String[] args) {
        Integer[] arr=new Integer[5];
            try {
                for (int i = 0; i < args.length; i++) {
                    arr[i] = Integer.parseInt(args[i]);
                }
                Integer sum=0;
                for (int i=0;i<arr.length;i++){
                    sum+=arr[i];
                }
                System.out.println("Sum = "+sum);
                System.out.println("Average = "+sum/arr.length);
            }
            catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            }
    }
}
