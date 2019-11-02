// import java.math.*;
import java.util.Scanner;
class driverClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ch=1,num1,num2,sel;

        // in.close();
        while(ch==1){
            System.out.println("Enter First Operand");
            num1=sc.nextInt();
            System.out.println("Enter Second Operand");
            num2=sc.nextInt();

            arithmetic C=new arithmetic(num1,num2);

            System.out.println("Select your choice Accordingly");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Remainder");
            sel=sc.nextInt();
            switch(sel){
                case 1: System.out.println(C.Add());break;
                case 2: System.out.println(C.Sub());break;
                case 3: System.out.println(C.Mul());break;
                case 4: System.out.println(C.Div());break;
                case 5: System.out.println(C.Mod());break;
                default:System.out.println("Wrong Choice :( ");
            }
            System.out.println("Press 1 to continue :)");
            ch=sc.nextInt();
        }
    }
} 
public class arithmetic{
    private int number1;
    private int number2;

    public arithmetic(int num1,int num2)
    {
        number1 = num1;
        number2 = num2;
    }
    public int Add()
    {
        return number1+number2;
    }
    public int Sub()
    {
        return number1-number2;
    }
    public int Mul()
    {
        return number1*number2;
    }
    public int Div()
    {
        return number1/number2;
    }
    public int Mod()
    {
        return number1%number2;
    }
    
}


