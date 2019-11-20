class sort{
    String[] myArray;
    public sort(String[] myArray){
        this.myArray=myArray;
        sortArrayUsingMethod();
        show();
    }
    public void sortArrayUsingMethod(){
        String temp;
        for(int i=0;i<myArray.length;i++){
            for(int j=i+1;j<myArray.length;j++){
                if(myArray[i].compareTo(myArray[j])>0){
                    temp=myArray[i];
                    myArray[i]=myArray[j];
                    myArray[j]=temp;
                }
            }
        }
    }
    public void show(){
        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
}
class Driver{
    public static void main(String args[]){
        String []array={"ACE","ABC","ADF"};
        sort A=new sort(array);
        // A.show();
    }
}