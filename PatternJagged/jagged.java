import java.util.Scanner;
public class jagged{
    char arr[][];
    void add(int num){
        arr=new char [num][];
        for(int i=0;i<arr.length;i++){
            arr[i]=new char[i+1];
            for(int j=0;j<arr[i].length;j++){
                // System.out.println(" * ");
                arr[i][j]='*';
            }
        }
    }
    void show(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

class driverClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ch=1;

        // in.close();
        while(ch==1){
            System.out.println("Enter Number :");
            int temp=sc.nextInt();
            jagged C=new jagged();
            C.add(temp);
            C.show();
            System.out.println("Press 1 to continue :)");
            ch=sc.nextInt();
        }
    }
} 