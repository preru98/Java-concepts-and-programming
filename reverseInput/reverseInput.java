import java.io.*;
// import java.io.BufferedReader; 
// import java.io.IOException; 
// import java.io.InputStreamReader; 

class Input{    
    public static void main(String args[]) throws IOException, FileNotFoundException{
        //read-> To read from user
        System.out.println("Please Enter String");
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        String k=read.readLine();
        char array[]=k.toCharArray();
        char arrayRev[]=new char[array.length];

        for (int j=array.length-1,i=0;j>=0;j--,i++){
            arrayRev[i]=array[j];
        }
        String S=new String(arrayRev);
        
        System.out.println("\nYou entered this data (Reversed) to be inputted in file");
        System.out.println(S);
        //fRead-> To read from file
        FileInputStream fRead;
        //fWrite-> To write to file
        FileOutputStream fWrite;
        //File -> File 
        File F;
        F=new File("E:\\MCA JIMS\\Practical\\Java\\Prerna\\reverseInput\\","Pi.doc");
        fWrite = new FileOutputStream(F,true);
        fRead = new FileInputStream(F);
        System.out.println("\n\nWriting in file ...");
        //Writng in file
        byte c[] = S.getBytes();
        for(int i=0;i<c.length;i++){
	    fWrite.write(c[i]);
        }
        fWrite.close();
        System.out.println("\nContents of the file are as follows ->");
        //Reading from file
        int t_bytes = fRead.available();
        for(int i=0;i<t_bytes;i++)
            {
            char d=(char)fRead.read();
                System.out.print(d);
            }
        fWrite.close();
        System.out.println("\nThankyou have a nice week!");
    }   
}