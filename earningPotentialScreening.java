// Import 
import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    
    // input
    
    Scanner number = new Scanner(System.in);  
      double n;
      do {
    System.out.println("Enter POSITIVE Number_of_class_members: ");
          n = number.nextDouble();
        if (n<0){
          System.out.println("Print a POSTIVE number of class members.");
        }
        }while (n<0);


    
    System.out.println(" ");

    
    
    Scanner career = new Scanner(System.in);
    double c;
    do {
    System.out.println("Enter POSITIVE Career_length (in years)");
          c=career.nextDouble();
    if (c<0){
      System.out.println("Print a POSITIVE career length in years.");
    }
    }while (c < 0);


    
    System.out.println(" ");

    
    Scanner top = new Scanner(System.in);
    double t;
    do {
  System.out.println("Enter POSITIVE Top_20_salary in dollars: ");
          t = top.nextDouble();
      if (t<0){
        System.out.println("Print a POSITIVE salary.");
      }
} while (t < 0);

    
    
    System.out.println(" ");

    
    Scanner average = new Scanner(System.in);
    double a;
    do {
    System.out.println("Enter POSITIVE Average_salary in dollars: ");
      a=average.nextDouble();
      if (a<0){
        System.out.println("Print a POSITIVE salary.");
      }
} while (a < 0);
    
    



    
    System.out.println(" ");


    Scanner stateTax=new Scanner(System.in);
double sT;
do {
    System.out.print("Enter a state tax between .01 and .99: ");
    sT = stateTax.nextDouble();

    if (sT < .01 || sT > .99) {
        System.out.println("Invalid number input!");
    }
} while (sT < .01 || sT > .99);

System.out.println(" ");


    Scanner takeHome=new Scanner(System.in);
double tH;
do {
    System.out.print("Enter a take home pay rate between .01 and .99: ");
    tH = takeHome.nextDouble();

    if (tH < .01 || tH > .99) {
        System.out.println("Invalid number input!");
    }
} while (tH < .01 || tH > .99);
  
System.out.println(" ");
    
    //logic p1
    double Individual_Annual_take_home_pay_top=(t*sT);
    double Individual_Annual_take_home_pay_average=(a*sT);
    double Individual_career_take_home_pay_top=((t*sT)*c);
    double Individual_career_take_home_pay_average=((a*sT)*c);
    double Individual_annual_state_tax_paid_top=(t*.045);
    double Individual_annual_state_tax_paid_average=(a*.045);
    double Individual_career_state_tax_paid_top=(t*.045)*c;
    double Individual_career_state_tax_paid_average=(a*.045)*c;
    //logic p2
    double Class_Annual_take_home_pay_top=(t*sT*(n*.2));
    double Class_Annual_take_home_pay_average=(a*sT*(n*.8));
    double Class_career_take_home_pay_top=(t*sT*c*(n*.2));
    double Class_career_take_home_pay_average=(a*sT*c*(n*.8));
    double Class_annual_state_tax_paid_top=(t*.045*(n*.2));
    double Class_annual_state_tax_paid_average=(a*.045*(n*.8));
    double Class_career_state_tax_paid_top=(t*.045*c*(n*.2));
    double Class_career_state_tax_paid_average=(a*.045*c*(n*.8));
    // bunch of printing
    System.out.println("Individual_Annual_take_home_pay_top 20%: "+Individual_Annual_take_home_pay_top);
    System.out.println(" ");
    System.out.println("Individual_Annual_take_home_pay_average 80%: "+ Individual_Annual_take_home_pay_average);
    System.out.println(" ");
    System.out.println("Individual_career_take_home_pay_top 20%: "+Individual_career_take_home_pay_top);
    System.out.println(" ");
    System.out.println("Individual_career_take_home_pay_average 80%: "+Individual_career_take_home_pay_average);
    System.out.println(" ");
    System.out.println("Individual_annual_state_tax_paid_top 20%: "+Individual_annual_state_tax_paid_top);
    System.out.println(" ");
    System.out.println("Individual_annual_state_tax_paid_average 80%: "+Individual_annual_state_tax_paid_average);
    System.out.println(" ");
    System.out.println("Individual_career_state_tax_paid_top 20%: "+ Individual_career_state_tax_paid_top);
    System.out.println(" ");
    System.out.println("Individual_career_state_tax_paid_average 80%: "+Individual_career_state_tax_paid_average);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Class_Annual_take_home_pay_top 20%: "+ Class_Annual_take_home_pay_top);
    System.out.println(" ");
    System.out.println("Class_Annual_take_home_pay_average 80%: "+ Class_Annual_take_home_pay_average);
    System.out.println(" ");
    System.out.println("Class_career_take_home_pay_top 20%: "+ Class_career_take_home_pay_top);
    System.out.println(" ");
    System.out.println("Class_career_take_home_pay_average 80%: "+ Class_career_take_home_pay_average);
    System.out.println(" ");
    System.out.println("Class_annual_state_tax_paid_top 20%: "+ Class_annual_state_tax_paid_top);
    System.out.println(" ");
    System.out.println("Class_annual_state_tax_paid_average 80%: "+ Class_annual_state_tax_paid_average);
    System.out.println(" ");
    System.out.println("Class_career_state_tax_paid_top 20%: "+Class_career_state_tax_paid_top);
    System.out.println(" ");
    System.out.println("Class_career_state_tax_paid_average 80%: "+ Class_career_state_tax_paid_average);
    }
      }
        
