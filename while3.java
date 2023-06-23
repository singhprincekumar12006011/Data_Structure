import java.util.Scanner;

public class while3 {
    public static void main(String[] agrs) {
        int i=1;
        int x;
        System.out.println("Enter the number of raw and coloum :");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        while(i <= x) {
            int j=1;
            while(j<=x) {
                System.out.print(x + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
