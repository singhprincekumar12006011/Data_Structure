import java.util.Scanner;

public class fectorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int fec = 1;
        for(int i = x; i>0; i--)
        {
            fec = fec * i ;
        }
        System.out.println(fec);
    }
}

//time complexity is O(n)............