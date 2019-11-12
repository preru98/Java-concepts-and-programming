import java.awt.*;
import java.awt.event.*;
import java.net.*;



class application extends Frame implements ActionListener{
    
    Label  usernameLabel, passwordLabel;
    TextField userFill,passwordFill;
    Button checkIP;
    InetAddress I;
    application(String title){
        
        usernameLabel=new Label("User Name");
        passwordLabel=new Label("Password");
        // IP=new Label();

        userFill=new TextField();
        passwordFill=new TextField();

        checkIP=new Button("Check IP");
        try{
            I=InetAddress.getLocalHost();
        }
        catch(UnknownHostException exp){

        }
       
        usernameLabel.setBounds(20,50,200,30);
        passwordLabel.setBounds(20,100,200,30);
        userFill.setBounds(300,50,300,30);
        passwordFill.setBounds(300,100,300,30);
        checkIP.setBounds(200,200,50,50);

        // IP.setBounds(20,150,200,30);
        // application A=this;
        
        Dialog showMessage=new Dialog(this,"Host Address");
        checkIP.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev) {
                // Dialog showMessage=new Dialog(A,"Host Address");
                Label textIP=new Label(I.toString());
                Button ok=new Button("OK");
                
                textIP.setBounds(50,50,200,20);
                ok.setBounds(50,100,100,20);

                showMessage.add(textIP);
                showMessage.add(ok);

                
                
                ok.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent ev){
                        showMessage.setVisible(false);
                    }
                });

                showMessage.setLayout(null);
                showMessage.setSize(300,300);
                showMessage.setVisible(true);
                
                // IP.setText(I.toString());
            }
        });
        // checkIP.addActionListener(this);

        add(passwordLabel);
        add(userFill);
        add(passwordFill);
        add(checkIP);
        // add(IP);
        add(usernameLabel);

        setSize(500,300);
        setTitle(title);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ev) {
        
    }
} 
public class ApplicationIP{
    public static void main(String args[]) throws UnknownHostException{
        // InetAddress I;
        // I=InetAddress.getLocalHost();
        // String S=I.toString();
        application A=new application("Hello");
    }
}