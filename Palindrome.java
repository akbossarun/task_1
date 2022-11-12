import java.util.Scanner;

public class Palindrome {

  //method for finding palindrome or not
  public static void FindPalindrome(int x) {
      int reminder, result = 0; int num = x;
      while(num>0){
        reminder = num%10;
        result = (result * 10) + reminder;
        num = num /10;
      }
      if(result==x)
        System.out.println(x+" is palindrome number");
      else 
        System.out.println(x+" is not a palindrome number");
  }

  public static void main(String[] args) {

    System.out.print("Enter a number to find palindrome : ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();//getting user input
    
    FindPalindrome(num);
  }
}
