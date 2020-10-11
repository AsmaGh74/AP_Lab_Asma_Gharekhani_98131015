import java.util.*;
public class CoPrime {
    public static void main(String[] args){
        int temporaryVariable;
        int remainder = -1;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first number please:    ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number please:    ");
        int number2 = sc.nextInt();
        if (number2 > number1){
            temporaryVariable = number2;
            number2 = number1;
            number1 = temporaryVariable;
        }
        while (remainder!=0){
            remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }
        if (number1 == 1){
            System.out.println("The numbers are coprime.");
        } else
            System.out.println("The numbers are not coprime!");
    }
}


