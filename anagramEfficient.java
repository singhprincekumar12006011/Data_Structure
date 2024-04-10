/***
Given two string. we have to chech the Strings are anagram or not. 
Two strings are said to be anagram, if the character of both are same their occureance are also same. 
  ***/

/*

efficient approach
...

approach:-  
1. we will create a variable of size 256. (the size character in java is 16 bit so, all the alphabet * 16 = 256)
2. we will check the size of both string. if the size is equal then proceed. else return false.
3. we will create the char array of size 256; 
4. using for loop we will iterate the loop and increament the index if element is present forfirst string . and will check if the same element is present in second string also then we will decreament the index.
5. again we will run loop till size 256. we will check every index of an array. if it is not equal to 0 return false.
6. return true.


*/
import java.util.Scanner;

public class anagramEfficient1 {
    static final int CHAR = 256; 
    public static boolean fun(String str1, String str2) {
        if(str1.length() != str2.length())
        {
            return false;
        }
        int count[] = new int[CHAR];
        for(int i=0; i<str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for(int i=0; i<CHAR; i++) 
        {
            if(count[i] != 0 )
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] Prince) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string ");
        String str2 = sc.nextLine();

        boolean s = fun(str1, str2);
        System.out.println(s);

    }
}
