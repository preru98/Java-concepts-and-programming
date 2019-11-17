// import java.math.*;
import java.util.Scanner;
class driverClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ch=1; 
        // in.close();
        while(ch==1){
            Grade C=new Grade();
            C.getMarks();
            C.check();
            System.out.println("Press 1 to continue :)");
            ch=sc.nextInt();
        }
    }
} 
class Grade
{
    private int number;
    Scanner sc=new Scanner(System.in);
    public Grade(){}
    public void getMarks(){
        try{
            System.out.println("Enter Marks :");
            number=sc.nextInt();
            if(number>100 || number<0){
                illegalGradeException I=new illegalGradeException();
                throw I;
            }
        }
        catch(illegalGradeException e){
            System.out.println("Kindly enter valid marks i.e (0-100) only.");
            System.out.println(e.getClass());
            System.out.println(e.getStackTrace());
            System.out.println();
            getMarks();
        }
    }
    
    
    public void check()
    {
      String Result;
       
        if (number>=80 && number<=100)
            Result = "A";
        else if(number>=60 && number<=79)
            Result = "B";
        else if(number>=40 && number<=59)
            Result = "C";
        else 
            Result="F";    
        System.out.println(Result);
    } 
}
class illegalGradeException extends Exception{

}
