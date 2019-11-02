import java.util.Scanner;
public class student extends person{
    private int roll;
    private String course;
    Scanner scan=new Scanner(System.in);
    void accept(){
        super.accept();
        System.out.print("Roll     :");
        roll=scan.nextInt(); //nextInt internally calls nextLine
        scan.nextLine(); //to consume rest of the line including new line "Enter"
        System.out.print("Course   :");
        course=scan.nextLine();
    }
    void display(){
        super.display();
        System.out.println("Roll     : "+roll);
        System.out.println("Course   : "+course);
    }
}
class employee extends person{
    private int ID;
    private String Dept;
    void accept(){
        super.accept();
        System.out.print("ID       :");
        ID=sc.nextInt();
        sc.nextLine();
        System.out.print("Dept     :");
        Dept=sc.nextLine();
    }
    void display(){
        super.display();
        System.out.println("ID     : "+ID);
        System.out.println("Dept   : "+Dept);

    }
}

class person{
    private String name;
    // private char gender;
    private String gender;
    private String address;
    private String contact;
    Scanner sc=new Scanner(System.in);
    
    void accept(){
        System.out.println("Kindly enter details :");
        
        System.out.print("Name     :");
        name=sc.nextLine();
        System.out.print("Gender   :");
        gender=sc.nextLine();
        System.out.print("Address  :");
        address=sc.nextLine();
        System.out.print("Contact  :");
        contact=sc.nextLine();
    }
    void display(){
        System.out.println("\nDetails are as follows :");
        
        System.out.println("Name     : "+name);
        System.out.println("Gender   : "+gender);
        System.out.println("Address  : "+address);
        System.out.println("Conatact : "+contact);
    }
} 
class driverClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // in.close();
        int ch=1;
        while(ch==1){

            System.out.println("Student Record");
            student C=new student();
            C.accept();
            C.display();

            System.out.println("Employee Record");
            employee E=new employee();
            E.accept();
            E.display();

            System.out.println("Press 1 to continue :)");
            ch=sc.nextInt(); 
        }
    }
} 