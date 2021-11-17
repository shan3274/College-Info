import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;
import java.io.*;
import java.io.File;

import java.awt.*;
public class SignUP extends JFrame{
    JButton btn,btn1,loginbtn,signupbtn;
    JPanel panle,panle1,panle2;
    JTextField t1,t2,t3,t6;
    JPasswordField p1,t4,t5;
    JLabel background,txt1,txt2,fb,gg,tw,user,user1,pwd,pwd1,cpwd,email,login,signup,already,wrong;

    SignUP(){

        ImageIcon img = new ImageIcon("img/bg .jpg");
        ImageIcon signUp = new ImageIcon("img/signup.png");
        ImageIcon logIn = new ImageIcon("img/login.png");
        ImageIcon google = new ImageIcon("img/gg.png");
        ImageIcon facebook = new ImageIcon("img/fb.png");
        ImageIcon twitter = new ImageIcon("img/tw.png");


        btn = new JButton(signUp);
        btn1 = new JButton(logIn);

        txt1=new JLabel("Register");
        txt1.setBounds(50,160,100,100);

        txt2=new JLabel("Login");
        txt2.setBounds(60,310,100,100);

        panle = new JPanel();
        panle1 = new JPanel();

        gg = new JLabel("",google,JLabel.CENTER);
        fb = new JLabel("",facebook,JLabel.CENTER);
        tw = new JLabel("",twitter,JLabel.CENTER);

        login = new JLabel("LOGIN");
        login.setBounds(450,100,300,50);
        login.setFont(new Font("Monospaced",Font.BOLD,60));
        login.setForeground(Color.white);

        loginbtn = new JButton("LOGIN");
        loginbtn.setBounds(400,340,300,40);
        loginbtn.setBackground(Color.white);
        loginbtn.setForeground(Color.white);
        loginbtn.setBorder(new MatteBorder(0,0,0,0,Color.white));
        loginbtn.setFont(new Font("Serif",Font.BOLD,40));
        loginbtn.setOpaque(false);

        signupbtn = new JButton("SIGNUP");
        signupbtn.setBounds(400,360,300,40);
        signupbtn.setBackground(Color.white);
        signupbtn.setForeground(Color.white);
        signupbtn.setBorder(new MatteBorder(0,0,0,0,Color.white));
        signupbtn.setFont(new Font("Serif",Font.BOLD,40));
        signupbtn.setOpaque(false);
        signupbtn.setVisible(false);

        signupbtn.addActionListener(new signupbtnp());

        signup = new JLabel("SIGNUP");
        signup.setBounds(450,70,300,50);
        signup.setFont(new Font("Monospaced",Font.BOLD,60));
        signup.setForeground(Color.white);
        signup.setVisible(false);

        t1 = new JTextField("");

        t1.setBounds(420,200,300,40);
        t1.setFont(new Font("Roboto",Font.BOLD,20));
        t1.setBackground(new Color(242, 156, 27));
        t1.setForeground(Color.white);
        t1.setOpaque(false);
        t1.setBorder(new MatteBorder(0,0,1,0,Color.white));

        user = new JLabel("Username:");
        user.setBounds(260,200,300,40);
        user.setFont(new Font("Roboto",Font.BOLD,25));
        user.setForeground(new Color(222, 133, 0));

        user1 = new JLabel("Username:");
        user1.setBounds(260,150,300,40);
        user1.setFont(new Font("Roboto",Font.BOLD,25));
        user1.setForeground(new Color(222, 133, 0));
        user1.setVisible(false);

        email = new JLabel("Email:");
        email.setBounds(260,200,300,40);
        email.setFont(new Font("Roboto",Font.BOLD,25));
        email.setForeground(new Color(222, 133, 0));
        email.setVisible(false);

        pwd1 = new JLabel("Password:");
        pwd1.setBounds(260,250,300,40);
        pwd1.setFont(new Font("Roboto",Font.BOLD,25));
        pwd1.setForeground(new Color(222, 133, 0));
        pwd1.setVisible(false);

        cpwd = new JLabel("Confirm:");
        cpwd.setBounds(260,300,300,40);
        cpwd.setFont(new Font("Roboto",Font.BOLD,25));
        cpwd.setForeground(new Color(222, 133, 0));
        cpwd.setVisible(false);

        p1 = new JPasswordField();
        p1.setBounds(420,280,300,40);
        p1.setFont(new Font("Roboto",Font.BOLD,20));
        p1.setBackground(new Color(242, 156, 27));
        p1.setForeground(Color.white);
        p1.setOpaque(false);
        p1.setBorder(new MatteBorder(0,0,1,0,Color.white));

        t2 = new JTextField();
        t2.setBounds(420,150,300,40);
        t2.setFont(new Font("Roboto",Font.BOLD,20));
        t2.setBackground(new Color(242, 156, 27));
        t2.setForeground(Color.white);
        t2.setOpaque(false);
        t2.setBorder(new MatteBorder(0,0,1,0,Color.white));
        t2.setVisible(false);

        t3 = new JTextField();
        t3.setBounds(420,200,300,40);
        t3.setFont(new Font("Roboto",Font.BOLD,20));
        t3.setBackground(new Color(242, 156, 27));
        t3.setForeground(Color.white);
        t3.setOpaque(false);
        t3.setBorder(new MatteBorder(0,0,1,0,Color.white));
        t3.setVisible(false);

        t4 = new JPasswordField();
        t4.setBounds(420,250,300,40);
        t4.setFont(new Font("Roboto",Font.BOLD,20));
        t4.setBackground(new Color(242, 156, 27));
        t4.setForeground(Color.white);
        t4.setOpaque(false);
        t4.setBorder(new MatteBorder(0,0,1,0,Color.white));
        t4.setVisible(false);

        t5 = new JPasswordField();
        t5.setBounds(420,300,300,40);
        t5.setFont(new Font("Roboto",Font.BOLD,20));
        t5.setBackground(new Color(242, 156, 27));
        t5.setForeground(Color.white);
        t5.setOpaque(false);
        t5.setBorder(new MatteBorder(0,0,1,0,Color.white));
        t5.setVisible(false);
        


        

        pwd = new JLabel("Password:");
        pwd.setBounds(260,280,300,40);
        pwd.setFont(new Font("Roboto",Font.BOLD,25));
        pwd.setForeground(new Color(222, 133, 0));

        gg.setBounds(0,400,60,60);
        fb.setBounds(40,400,60,60);
        tw.setBounds(80,400,60,60);


        

        panle.setBounds(200,50,700,400);
        panle.setLayout(null);
        panle.setVisible(true);
        panle.setBackground(new Color(0,0,0,150));

        panle1.setBounds(0,0,150,550);
        panle1.setLayout(null);
        panle1.setBackground(Color.white);

        btn.setBounds(30,100,100,100);
        btn.setBorder(new MatteBorder(0,0,0,0,Color.BLACK));
        btn.setBackground(new Color(0,0,0,150));
        btn.setOpaque(false);
        background= new JLabel("",img,JLabel.CENTER);

        btn1.setBounds(25,250,100,100);
        btn1.setBorder(new MatteBorder(0,0,0,0,Color.BLACK));
        btn1.setBackground(new Color(0,0,0,150));
        btn1.setOpaque(false);

        btn.addActionListener(new signupbtn());
        btn1.addActionListener(new loginbtn());
        loginbtn.addActionListener(new loginbtnp());

        

        already = new JLabel("user already exists:");
        already.setBounds(470,450,400,40);
        already.setFont(new Font("Roboto",Font.BOLD,15));
        already.setForeground(Color.red);
        already.setVisible(false);

        wrong = new JLabel("wrong details");
        wrong.setBounds(470,450,400,40);
        wrong.setFont(new Font("Roboto",Font.BOLD,15));
        wrong.setForeground(Color.red);
        wrong.setVisible(false);
        
        
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(p1);
        add(pwd1);
        add(cpwd);
        add(email);

        add(already);
        add(wrong);
        add(gg);
        add(signup);
        add(signupbtn);
        add(login);
        add(loginbtn);
        add(user);
        add(user1);
        add(pwd);
        add(fb);
        add(tw);
        add(btn);
        add(txt1);
        add(btn1);
        add(txt2);
        add(panle);
        add(background);
        
        setLocation(230,100);
        setResizable(false);
        setSize(950,550);
        setVisible(true);
        background.add(panle1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    class signupbtn implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           
            t4.setVisible(true);
            cpwd.setVisible(true);
            pwd1.setVisible(true);
            t5.setVisible(true);
            login.setVisible(false);
            user.setVisible(false);
            user1.setVisible(true);
            email.setVisible(true);
            pwd.setVisible(false);
            t1.setVisible(false);
            loginbtn.setVisible(false);
            p1.setVisible(false);
            t2.setVisible(true);
            signupbtn.setVisible(true);
            t3.setVisible(true);
            signup.setVisible(true);

            t1.setText("");
            p1.setText("");

            already.setVisible(false);
            wrong.setVisible(false);
            
            

        }
    }

    

    class loginbtn implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           

            t4.setVisible(false);
            t5.setVisible(false);
            t3.setVisible(false);
            signupbtn.setVisible(false);
            cpwd.setVisible(false);
            pwd1.setVisible(false);
            login.setVisible(true);
            email.setVisible(false);
            user.setVisible(true);
            user1.setVisible(false);
            pwd.setVisible(true);
            t1.setVisible(true);
            t2.setVisible(false);
            p1.setVisible(true);
            loginbtn.setVisible(true);
            signup.setVisible(false);

            wrong.setVisible(false);
            already.setVisible(false);

            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
           

        }
    }


    class signupbtnp implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           
            try {
                String us=t2.getText();
                String us1=t3.getText();
                char [] us2=t4.getPassword();
                char[] us3=t5.getPassword();
                boolean bool=false;
                String us22=String.valueOf(us2);
                String us33=String.valueOf(us3);
                
                File file = new File("data/"+us+".txt");
                File file2 = file.getCanonicalFile();
                bool=file2.exists();
                if(bool==false){
                FileWriter fw=new FileWriter("data/"+us+".txt");
                 
                fw.write(us+"\n");
                fw.write(us1+"\n");
                fw.write(us22+"\n");
                fw.write(us33+"\n");
                fw.close();
                wrong.setVisible(false);
                already.setVisible(false);

            t1.setText("");
            p1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
                }else{
                    already.setVisible(true);
                }
            } catch (Exception ee) {
               System.out.print(ee);
            }
        
            

        }
    }

    class loginbtnp implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            String users= t1.getText();
            char[] pwdss = new char[100];
            already.setVisible(false);
            
            
            pwdss= p1.getPassword();
            String pwds =String.valueOf(pwdss);

            char[] data = new char[100];
            try{
                FileReader rd = new FileReader("data/"+users+".txt");
                rd.read(data);
                String splt= String.valueOf(data);
                String[] sp=splt.split("\n");
                rd.close();
                if (users.equals(sp[0])&& pwds.equals(sp[2])) {
                    new homepage(users);
                    dispose();


                t1.setText("");
                p1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                }

                
                    
                
                 
            }catch(Exception ex){
                wrong.setVisible(true);
                }

            
               
        }
    }

    public static void main(String[] args) {
        new SignUP();
    }
}