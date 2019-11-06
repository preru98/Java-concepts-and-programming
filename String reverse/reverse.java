import java.io.*;
// import java.io.BufferedReader; 
// import java.io.IOException; 
// import java.io.InputStreamReader; 

class Input{    
    public static void main(String args[]) throws IOException{
        //read-> To read from user
        System.out.println("Please Enter String");
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        String k=read.readLine();
        char array[]=k.toCharArray();
        char arrayRev[]=new char[array.length];

        for (int j=array.length-1,i=0;j>=0;j--,i++){
            arrayRev[i]=array[j];
            System.out.println(arrayRev[i]);
        }
        String S=new String(arrayRev);
        System.out.println("\nYou entered this data to be inputted in file");
        System.out.println(S);
        
    }   
}