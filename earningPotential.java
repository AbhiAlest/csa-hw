// Import 
import java.util.Scanner;  

class Main {
  public static void main(String[] args) {
    
    // input
    
    Scanner number = new Scanner(System.in);  
    System.out.println("Enter Number_of_class_members: ");
    double n = number.nextDouble();  
    System.out.println(" ");
    Scanner career = new Scanner(System.in);
    System.out.println("Enter Career_length (in years): ");
    double c = career.nextDouble();  
    System.out.println(" ");
    Scanner top = new Scanner(System.in);
    System.out.println("Enter Top_20_salary in dollars: ");
    double t = top.nextDouble();
    System.out.println(" ");
    Scanner average = new Scanner(System.in);
    System.out.println("Enter Average_salary in dollars: ");
    double a = average.nextDouble();
    System.out.println(" ");
    //logic p1
    double Individual_Annual_take_home_pay_top=(t*.55);
    double Individual_Annual_take_home_pay_average=(a*.55);
    double Individual_career_take_home_pay_top=((t*.55)*c);
    double Individual_career_take_home_pay_average=((a*.55)*c);
    double Individual_annual_state_tax_paid_top=(t*.045);
    double Individual_annual_state_tax_paid_average=(a*.045);
    double Individual_career_state_tax_paid_top=(t*.045)*c;
    double Individual_career_state_tax_paid_average=(a*.045)*c;
    //logic p2
    double Class_Annual_take_home_pay_top=(t*.55*(n*.2));
    double Class_Annual_take_home_pay_average=(a*.55*(n*.8));
    double Class_career_take_home_pay_top=(t*.55*c*(n*.2));
    double Class_career_take_home_pay_average=(a*.55*c*(n*.8));
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
