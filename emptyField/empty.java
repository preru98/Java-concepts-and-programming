import java.awt.*;
import java.awt.event.*;


class myData extends Frame {

    Button submitB;
    TextField username,password;
    Label l;

    myData(String title){
        submitB=new Button("Submit");
        username=new TextField();
        password=new TextField();
        l=new Label();

        username.setBounds(50,50,300,20);
        password.setBounds(50,100,300,20);
        submitB.setBounds(50,150,100,20);
        l.setBounds(50,200,300,20);
        Dialog D=new Dialog(this,"HEllo Peeps");
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
                    Label message=new Label("Please fill in all fields");
                    Button B=new Button("OK");
                    message.setBounds(20,50,100,20);
                    B.setBounds(20,100,100,20);

                    B.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent ev){
                            D.setVisible(false);
                        }
                    });
                    D.add(message);
                    D.add(B);
                    D.setSize(300,300);
                    D.setVisible(true);
                
                }
            }
        });

        add(username);
        add(submitB);
        add(password);
        add(l);
        
        
        setSize(500,300);
        setTitle(title);
        setLayout(null);
        setVisible(true);
    }
}
class driveClass{
    public static void main(String args[]){
        myData M=new myData("Henlo");
    }
}
class invalidField extends Exception{
    invalidField(){

    }
}