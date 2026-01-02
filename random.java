import java.util.Scanner;

public class random {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min=0;
        int max = 100;
        int randomNum = (int)(Math.random() * (max - min + 1)) + min;
        int count=0;
        int guiss=0;
        System.out.println("I'm thinking of a number between 1 and 100........");
        while(guiss!=randomNum){
            System.out.println("guiss the number:");
            guiss=input.nextInt();
            count++;
            if(guiss<randomNum){
                System.out.println("Too low, please again");
            }
            if(guiss>randomNum){
                System.out.println("Too high, please again");
            }
        }
        System.out.println("Congratulations! you found the number in "+  count + " times");
    }
}
