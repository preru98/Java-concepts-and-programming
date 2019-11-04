import java.util.Scanner;
class sort{
    
    private int number[];
    Scanner sc=new Scanner(System.in);

    public sort(int len ){
        number=new int[len];
    }
    public void add(){
        try{
            System.out.println("Enter Elements");
            for(int i=0;i<=number.length;i++){
                number[i]=sc.nextInt();     
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You have just added an extra element.\nException Raised. It won't be counted!");
            System.out.println(e.getClass());
            System.out.println();
            System.out.println(e.getStackTrace());
            System.out.println();
        }
    }
    public void convert(int ch){
        int temp;
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                if(ch==1){
                    if(number[i]>number[j]){
                        temp=number[i];
                        number[i]=number[j];
                        number[j]=temp;
                    }
                }
                else if(ch==2){
                    if(number[i]<number[j]){
                        temp=number[i];
                        number[i]=number[j];
                        number[j]=temp;
                    }

                }

            }
        }
    }
    public void show(){
        for(int i=0;i<number.length;i++){
                System.out.print(number[i] + " | ");
        }
    }
}
class driverClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // in.close();
        int ch,temp;
        System.out.println("Select your choice Accordingly");
        System.out.println("1.Ascending Order");
        System.out.println("2.Descending Order");
        ch=sc.nextInt();
        System.out.println("Enter Length :");
        temp=sc.nextInt();
        sort C=new sort(temp);
        C.add();
        C.convert(ch);
        System.out.println("Sorted Array is as follows :)");  
        C.show();
    }
}
 