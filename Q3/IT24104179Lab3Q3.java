import java.util.Scanner;

public class IT24104179Lab3Q3{
    public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the Rupee amount :");
       int amount = input.nextInt();

       int five_thousand_notes = amount/5000;
       int remainder1 = amount % 5000;

       int thousand_notes = remainder1/1000;
       int remainder2 = remainder1 % 1000;

       int five_hundren_notes = remainder2/500;
       int remainder3 = remainder2 % 500;

       int two_hundren_notes = remainder3/200;
       int remainder4 = remainder3 % 200;

       int hundren_notes = remainder4/100;
       int remainder5 = remainder4 % 100;

       int fifty_notes = remainder5/50;
       int remainder6 = remainder5 % 50;

       int twenty_notes = remainder6/20;
       int remainder7 = remainder6 % 20;

       int ten_coins = remainder7/10;
       int remainder8 = remainder7 % 10;

       int five_coins = remainder8/5;
       int remainder9 = remainder8 % 5;

       int two_coins = remainder9/2;
       int remainder10 = remainder9 % 2;

       int one_coins = remainder10/1;
       int remainder11 = remainder10 % 1;
       
       System.out.println("5000 Notes - "+five_thousand_notes);
       System.out.println("1000 Notes - "+thousand_notes);
       System.out.println("500 Notes - "+five_hundren_notes);
       System.out.println("200 Notes - "+two_hundren_notes);
       System.out.println("100 Notes - "+hundren_notes);
       System.out.println("50 Notes - "+fifty_notes);
       System.out.println("20 Notes - "+twenty_notes);
       System.out.println("10 Coins - "+ten_coins);
       System.out.println("05 Coins - "+five_coins);
       System.out.println("02 Coins - "+two_coins);
       System.out.println("01 Coins - "+one_coins);
  }
}