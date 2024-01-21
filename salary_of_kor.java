import java.util.*;
public class salary_of_kor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = 0;
        double salaryb = 0;
        /* if don't salary = 0 or salaryb = 0 it will be initialized 
        initialized mean setting the defalut number of value*/
        
        System.out.println("Please insert your name : ");
        String name = input.nextLine();
        
        System.out.println("Please insert your age : ");
        int age = input.nextInt();
        
        System.out.println("Please insert number of working days : ");
        int workdays = input.nextInt();
        
        System.out.println("Please insert number of absent days : ");
        int absentdays = input.nextInt();
        
        System.out.println("Please insert your body weight : ");
        double weight = input.nextDouble();
        
        System.out.println("Hi, "+name);

        if (age > 20 && age <= 30) {
            salary = (workdays * 300) - (absentdays * 50);
        } else if (age > 30 && age <= 40) {
            salary = (workdays * 300) - (absentdays * 50);
        } else if (age > 40 && age <= 50) {
            salary = (workdays * 1000) - (absentdays * 25);
        } else if (age > 51 && age <= 60) {
            salary = (workdays * 3000);
        }
        if (weight >= 10 && weight <= 60){
            salaryb = salary + 5000;
        } else if (weight >= 61 && weight <= 90){
            salaryb = salary + (5000 - ((weight) * 10));
        }
        System.out.println("Your salary is "+ salary + " Baht");
        System.out.println("Your salary and bonus is "+salaryb+" Baht");
        
}}

