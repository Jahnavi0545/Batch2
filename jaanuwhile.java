package Batch2;

import java.util.Scanner;

public class jaanuwhile {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a starting number");
        int startingno=sc.nextInt();
        System.out.println("enter a ending number");
        int endingno=sc.nextInt();
        //int number=startingno;
        
        while(startingno<=endingno)
        {

            if(startingno%2==0)
            {
                System.out.println("even numbers is: "+startingno);
                
            }
            startingno++;
    }
    }
}
