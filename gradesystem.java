// student grade system
import java.util.*;
class student {
    String name;
    double grade;
    public student(String name, double grade){
        this.name=name;
        this.grade=grade;
    }
    public void display(){
        System.out.print("{ "+ name + " , " + grade+ " },");
    }
}
class gradesystem{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<student> addStudent =new ArrayList<>();
        while(true){
            System.out.println("choose any one:");
            System.out.println("1;  for entry");
            System.out.println("2; for print all student");
            System.out.println("3; for exit");
            System.out.print("enter any one : ");
            int num=input.nextInt();
            input.nextLine();
            if(num==1){
                System.out.println("enter name: ");
                String name=input.nextLine();
                System.out.println("enter grade: ");
                double grade=input.nextDouble();

                addStudent.add(new student(name, grade));
                System.out.println("student added");
            }
            else if(num==2){
                System.out.println("show all student");
                for(student s : addStudent){
                    s.display();
                }
            }
            else if(num==3) {
                System.out.println("exit");
                break;                
            }
        }
    }
} 

