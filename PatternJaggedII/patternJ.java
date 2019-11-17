import java.util.Scanner;
class jagged{
    char arr[][];
    void add(int num){
        arr=new char [num*2-1][];
        for(int i=0,k=1;i<arr.length;i++){
            if(i<num-1){
                arr[i]=new char[k];
                k+=2;
            }
            else{
                arr[i]=new char[k];
                k-=2;
            }
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