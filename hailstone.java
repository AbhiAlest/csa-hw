import java.util.Scanner;
public class Main{ //In the FRQ, it is public class Hailstone
	public static int hailstoneLength(int n){
		int counter=1; //if n=1, the sequence terminates
		while (n>1){ //other than 1, also keeps looping until the end 
			counter++; //counter is length
			if (n%2==0) //even follows n/2
				n/=2;
			else //odd follows 3n+1
				n=3*n+1;
		}
		return counter;
	}
	public static boolean isLongSeq(int n){
		if ((hailstoneLength(n))>n) //use hailstoneLength function to determine if it is greater than n (the first digit)
			return true; //islongSeq
		return false; //isnotlongSeq
	}
	public static double propLong(int n){
		int aCounter=0; //amount of "long" sequences
		for (int j=1; j<=n; ++j) //preincrement
			if (isLongSeq(j))
				aCounter++;
		return (1.0*aCounter)/n;
	}
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
    System.out.println("Enter the first value of the hailstone sequence (n): ");
    int n=input.nextInt();
    System.out.println("Hailstone length is: "+ hailstoneLength(n));
    System.out.println("Hailstone is long (True/False): "+ isLongSeq(n));
    System.out.println("Proportion of long hailstone sequences: "+ propLong(n));
	}
}
