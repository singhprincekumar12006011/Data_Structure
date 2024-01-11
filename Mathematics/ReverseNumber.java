//WAP to print the reverse of the number


import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number...........");
        int p;
        int x = p =sc.nextInt();
        int y, res =0;
        while(x>0)
        {
            y=x%10;
            res=res*10+y;
            x=x/10;
        }
        System.out.println(res);
        if(p==res)
        {
            System.out.println("The given number is palindrome number......");
        }
        else
        {
            System.out.println("Number is not palindrome number");
        }
    }
}
