package Day_0;

import java.util.Scanner;

public class palindrome {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number : ");
        int x= scan.nextInt();

        int rev=0;
        int temp=x;
        while(temp!=0){
            int rem=(int)(temp%10);
            rev=rev*10+rem;
            temp/=10;
        }
        if (x==rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
