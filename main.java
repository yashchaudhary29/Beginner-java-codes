//Switch case statement using Arithmatic operators: '+','-','*','/'
/*
import java.util.*;
class main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter Operatin :  '+', '-', '*', '/' ");
        char in=input.next().charAt(0);
        System.out.println("enter the value of a");
        int a=input.nextInt();
        System.out.println("enter the value of b");
        int b=input.nextInt();
        switchOperation(in,a,b);
    }
    public static void switchOperation(char in, int a, int b){
        switch(in){
            case('+'):
                System.out.println(a+b);
                break;
            case('-'):
                System.out.println(a-b);
                break;
            case('*'):
                System.out.println(a*b);
                break;
            case('/'):
               if(in=='/'){
                    try {
                        int ans = a/b;
                        System.out.println("Answer: " + ans);
                    }catch (ArithmeticException e){
                        System.out.println("Error: Division by 0!");
                    }
                } 
               break;
            default:
                System.out.println("Invalid input in operator");
                break;
        }
    }
}
*/

// Guiss the random number

/*
import java.util.*;
class main{
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

*/




