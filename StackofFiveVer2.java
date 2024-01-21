import java.util.*;
public class StackofFiveVer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a number : ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++)
            if (i % 5 == 0){
                System.out.println("|");
            }else {
                System.out.print("|");
            }
    }
}
