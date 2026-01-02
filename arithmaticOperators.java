//Switch case statement using Arithmatic operators: '+','-','*','/'

import java.util.*;
class arithmaticOperators{
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







