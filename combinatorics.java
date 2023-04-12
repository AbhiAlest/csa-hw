import java.util.Scanner;  
public class Main{
  public static int factorial(int n){
    if (n>=1 && n<=12){
      if (n == 0 || n==1){
        return 1;   
    }
      return n*factorial(n-1);
    }
   return 0;
 }

public static int numCombinations(int n, int r){
  if (r>n){
     return 0;
}
  if (r<=n){
     return factorial(n)/(factorial(n-r) * factorial (r));
}
  return 0;
}

 public static void main(String[] args)
 {
  Scanner num= new Scanner(System.in);
  System.out.println("Enter the n-value: ");
  int n=num.nextInt();
  Scanner rv= new Scanner(System.in);
  System.out.println("Enter the r-value: ");
  int r=rv.nextInt();
  System.out.println("Factorial of "+ n + " is: " + factorial(n));
  System.out.println("Combinations of " +n+ " choices and " + r+ " items is: " + numCombinations(n,r));
 }
}
