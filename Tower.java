import java.util.*;
public class Tower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How tall is the Tower : ");
        int tower = input.nextInt();
        for (int i=1; i<= tower; i++ ){
            for (int j=1; j<=1; j++){
                System.out.print("#-#-#-#-#");
            }
           System.out.println();
        }
    }
}
