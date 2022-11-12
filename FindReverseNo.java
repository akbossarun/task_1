public class FindReverseNo {

  //method for find reverse numbers
  public static void findReverseNumber(int x) {
    int reminder, result = 0; int num = x;
    while(num>0){
      reminder = num%10;
      result = (result *10)+ reminder;
      num/=10;
    }
    if(x==result)
      System.out.print(x+" ");
  }
  
  public static void main(String[] args) {
    
    //random numbers
    int rollNo[] = {123,121,343,567765,331,452,909,5434,3223};
    
    System.out.println("There are the reverse numbers : ");
    for(int num : rollNo) {//looping the values one by one
      findReverseNumber(num);
    }
  }
}