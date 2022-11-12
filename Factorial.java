import java.util.Scanner;

public class Factorial {

  //finding factorial number method
  public static void findFactorial(int x) {
    int fact =1;
    if(x>0){//checking a valid parameter or not
      for (int i = 1; i <= x; i++){
        fact = fact *i;
      }
      System.out.println("Factorial of "+x+" is : "+fact);
    }
    else
      System.out.println("Please enter a valid number");
  }

  public static void main(String[] args) {

    System.out.print("Enter a number to find factorial value : ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();// getting user input

    findFactorial(num);

  }
}