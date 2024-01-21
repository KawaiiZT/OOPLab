import java.util.*;
public class bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = input.nextDouble();
        System.out.print("Input your account type(please take A B C or X in Uppercase : ");
        char type = input.next().charAt(0);
        switch (type) {
            case 'A':
                {
                    double before = money * 1.5/100;
                    double total = before + money;
                    System.out.println("Your total money in one year = "+ total);
                    break;
                }
            case 'B':
                {
                    double before = money * 2/100;
                    double total = before + money;
                    System.out.println("Your total money in one year = "+ total);
                    break;
                }
            case 'C':
                {
                    double before = money * 1.5/100;
                    double total = before + money;
                    System.out.println("Your total money in one year = "+ total);
                    break;
                }
            case 'X':
                {
                    double before = money * 5/100;
                    double total = before + money;
                    System.out.println("Your total money in one year = "+ total);
                    break;
                }
        }
    
    }
}
