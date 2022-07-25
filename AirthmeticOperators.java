import java.util.Scanner;
public class AirthmeticOperators 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number = ");
        int a = sc.nextInt();
        System.out.println("Enter second number = ");
        int b = sc.nextInt();
        int add = a + b;
        System.out.println("Addition of two numbers = "+add);
        int sub = a - b;
        System.out.println("Substraction of two numbers = "+sub);
        int mul = a * b;
        System.out.println("Multiplication of two numbers = "+mul);
        int div = a / b;
        System.out.println("Division of two numbers = "+div);
    }
}
/*Program to add , substract , multiply and divide two numbers*/
