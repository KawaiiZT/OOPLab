import java.util.*;
public class Tax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wage = input.nextDouble();
        if (wage <= 50000) {
            double tax = wage * 5/100;
            System.out.println(""+ tax);
        } else {
            double tax = wage * 10/100;
            System.out.println(""+ tax);
        }
    }
}
