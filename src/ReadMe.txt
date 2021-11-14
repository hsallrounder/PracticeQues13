Topic - Exception Handling

Q1. Write a program that takes as input the size of the array and the elements in the array.
The program then asks the user to enter a particular index and prints the element at that index. Index  starts from zero.

This program may generate Array Index Out Of Bounds Exception  or NumberFormatException .
Use exception handling mechanisms to handle this exception.

Sample Input and Output 1:
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
1
The array element at index 1 = 80
The array element successfully accessed


Sample Input and Output 2:
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
9
java.lang.ArrayIndexOutOfBoundsException


Sample Input and Output 3:
Enter the number of elements in the array
2
Enter the elements in the array
30
j
java.lang.NumberFormatException


Q2. Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters.
Loop through the array and obtain the sum and average of all the elements and display the result.

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.


Q3. Write a Program to take care of Number Format Exception if the user enters values other than integer for calculating the average marks of 2 students.
The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values
and values out of range (i.e. other than in the range of 0-100).
Exception Handling: Throw & User Defined Exception


Q4. A student portal provides user to register their profile.
During registration the system needs to validate the user should be located in India. If not the system should throw an exception.

Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
void registerUser(String username,String userCountry) with the below implementation
• if userCountry is not equal to  “India” throw a InvalidCountryException with the message “User Outside India  cannot be registered”
• if userCountry is equal to  “India”,  print the message “User registration done successfully”

Invoke the method registerUser from the main method with the data specified and see how the program behaves.
Example1)
i/p:Mickey,US
o/p:InvalidCountryException should be thrown.
The message should be “User Outside India  cannot be registered”

Example2)
i/p:Mini,India
o/p:User registration done successfully


Q5. Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class)
and ensure that the age entered is >=18 and < 60.
Display proper error messages.

The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)