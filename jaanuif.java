package Batch2;

import java.util.Scanner;

public class jaanuif{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter age : ");
        int age=sc.nextInt();
        if (age<12){
            System.out.println("you are a child");
        }
        else if(age>12 && age<=19){
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("You are an adult");
        }
        


    }
}