import java.util.Scanner;

class getEmail{
String email;
Scanner sc=new Scanner(System.in);
void getData(){
try{
email=sc.nextLine();
int index=email.indexOf('@');
if(index==-1){
emailException E = new emailException("Yey! Finally an exception :)");
throw E;
}
}
catch(emailException e){
getData();
}

}
void putData(){
System.out.println("Email :"+email);
}
}
class myClass{
public static void main(String args[]){
getEmail G=new getEmail();
G.getData();
G.putData();
}

}

class emailException extends Exception{
emailException(String S){
System.out.println(S);
}
}

