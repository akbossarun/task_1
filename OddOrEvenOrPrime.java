import java.util.Scanner;

public class OddOrEvenOrPrime {

  //finding Odd number method
  public static void oddNum(int x) {
    if(x%2!=0) 
      System.out.print(x+" is a Odd number");
    else
      System.out.println(x+" is not a Odd number");
  }

  //finding even number method
  public static void evenNum(int x) {
    if(x%2==0) 
      System.out.print(x+" is a Even number");
    else
      System.out.println(x+" is not a Even number");
  }

  //finding prime number method
  public static void primeNum(int x) {
    boolean prime = true;
    for(int i=2;i<x/2;i++) {
      if(x%i==0){
        prime = false;
      }
    } 
    if(prime==true)
      System.out.println(x+" is a prime number");
    else
      System.out.println(x+" is not a prime number");
  }
  
  public static void main(String[] args) {

    System.out.println("__Checking Program Menu__");//menu
    System.out.println("1. check Odd number or not  \n"+"2. check even number or not \n"+
    "3. check prime number or not \n");
    
    System.out.print("Which one want to check : ");//user option
    Scanner input1 = new Scanner(System.in);
    int sno = input1.nextInt();//storing the choice

    if(sno>0 && sno<4) {//checking the choice was between 1 and 3

       System.out.print("Enter a number to check : ");// getting a value 
       Scanner input2 = new Scanner(System.in);
       int num = input2.nextInt();// storing the value

       switch(sno){//based on the choice the method will execute
          case 1: oddNum(num);break;
          case 2: evenNum(num);break;
          case 3: primeNum(num);break;
          default : System.out.println("!! Please enter a valid option");
        }
      }
    else
      System.out.println("!! Please enter a valid option");
  }
}