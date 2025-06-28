import java.util.*;
public class Simple_calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator [+,-,*,/,%]: ");
        char operator = sc.next().charAt(0);
        
        if(operator == '+'){
            System.out.println("\n" + num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if(operator == '-'){
            System.out.println("\n" + num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if(operator == '*'){
            System.out.println("\n" + num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if(operator == '/'){
            if(num2 == 0 ){
                System.out.println("\nCannot be divided by 0....");
            }
            else{
                System.out.println("\n" + num1 + " / " + num2 + " = " + (num1 / num2));
            }
        }
        else if(operator == '%'){
            System.out.println("\n" + num1 + " % " + num2 + " = " + (num1 % num2));
        }
        else{
            System.out.println("\nWrong choice. Please try again........");
        }
    }
}
