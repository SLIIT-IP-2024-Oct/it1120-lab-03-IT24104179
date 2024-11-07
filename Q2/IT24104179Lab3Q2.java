import java.util.Scanner;

public class IT24104179Lab3Q2{
    public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the monthly salary :");
       double monthly_saraly = input.nextDouble();

       System.out.print("Enter the number of OT hours :");
       double number_of_ot_hours = input.nextDouble();

       System.out.print("Enter the OT hourly rate :");
       double ot_hourly_rate = input.nextDouble();

       double ot_amount = number_of_ot_hours * ot_hourly_rate;
       double total_salary = monthly_saraly+ot_amount;

       
       System.out.println("The total salary including OT is: "+total_salary);
  }
}