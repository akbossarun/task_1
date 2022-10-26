public class displayNaturalNumbers {
  public static void main(String[] args) {
    
    //getting input from the user and then storing the value into a variable
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the maximum number for num: ");
    int number = input.nextInt(); 
    
    //printing the natural numbers based on user input
    System.out.print("First "+number+" natural numbers :");
    for(int i = 1; i<=number;i++){
      System.out.print(" "+i);
    }
    
  }
}
