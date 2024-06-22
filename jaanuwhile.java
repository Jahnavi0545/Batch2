package Batch2;

public class jaanuwhile {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int startingno=sc.nextInt();
        int endingno=sc.nextInt();
        int number=startingno;
        while(number<endingno){
            System.out.println("even numbers : ");
            number++;
        }
    }
}
