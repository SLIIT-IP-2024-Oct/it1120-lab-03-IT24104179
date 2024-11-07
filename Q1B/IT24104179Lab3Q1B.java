import java.util.Scanner;

public class IT24104179Lab3Q1B{
    public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the price of 1kg of rice :");
       double price = input.nextDouble();

       System.out.print("Enter the number of kilograms you want to buy :");
       double kilograms = input.nextDouble();

       double amount = price * kilograms;
       double last_amout = amount * (90.0/100);
       System.out.println("The total amount with 10% discount is: "+last_amout);
  }
}