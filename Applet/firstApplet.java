import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class firstApplet extends Applet{
    Button submitB;
    TextField username,password;
    Label l;
    @Override
    public void init(){
        submitB=new Button("Submit");
        username=new TextField();
        password=new TextField();
        l=new Label();

        username.setBounds(50,50,300,20);
        password.setBounds(50,100,300,20);
        submitB.setBounds(50,150,100,20);
        l.setBounds(50,200,300,20);

        // Dialog D=new Dialog(this,"HEllo Peeps");
        submitB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                try{
                    if(username.getText().equals("") || password.getText().equals("")){
                        invalidField I=new invalidField();
                        throw I;
                    }
                }
                catch(invalidField exp){
                    // l.setText("Henlo");
                   username.setText("Hello");
                
                }
            }
        });
        add(username);
        add(submitB);
        add(password);
        add(l);
    }
    
} 
/*
<applet code="firstApplet" height="200" width= "200"></applet>
*/
class invalidField extends Exception{
    invalidField(){

    }
}