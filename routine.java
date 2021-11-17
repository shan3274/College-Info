import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;

public class routine extends JFrame{
    JPanel panel,panel1;
    JLabel background,branchl,yearl,sectionl;
    JTextField brancht,yeart,sectiont;
    JButton submit,back,logout;
    String str;

    routine(String str1){

        ImageIcon img = new ImageIcon("img/bg .jpg");

        str = str1;
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(100,50,750,420);
        panel.setBackground(new Color(0,0,0,150));
        panel.setBorder(new MatteBorder(1,1,1,1,Color.black));
        panel.setVisible(true);

        
        background= new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,950,550);

        
        yearl = new JLabel("Enter Year :");
        yearl.setBounds(220,150,300,50);
        yearl.setFont(new Font("Roboto",Font.BOLD,20));
        yearl.setForeground(Color.white);
        yearl.setOpaque(false);

        branchl = new JLabel("Enter Branch :");
        branchl.setBounds(220,220,300,50);
        branchl.setFont(new Font("Roboto",Font.BOLD,20));
        branchl.setForeground(Color.white);
        branchl.setOpaque(false);


        sectionl = new JLabel("Enter Section :");
        sectionl.setBounds(220,290,300,50);
        sectionl.setFont(new Font("Roboto",Font.BOLD,20));
        sectionl.setForeground(Color.white);
        sectionl.setOpaque(false);
        

      
        yeart = new JTextField();
        yeart.setBounds(400,150,300,50);
        yeart.setFont(new Font("Roboto",Font.BOLD,20));
        yeart.setBackground(new Color(242, 156, 27));
        yeart.setForeground(Color.white);
        yeart.setOpaque(false);
        yeart.setBorder(new MatteBorder(0,0,1,0,Color.white));

        brancht = new JTextField();
        brancht.setBounds(400,220,300,50);
        brancht.setFont(new Font("Roboto",Font.BOLD,20));
        brancht.setBackground(new Color(242, 156, 27));
        brancht.setForeground(Color.white);
        brancht.setOpaque(false);
        brancht.setBorder(new MatteBorder(0,0,1,0,Color.white));


        sectiont = new JTextField();
        sectiont.setBounds(400,290,300,50);
        sectiont.setFont(new Font("Roboto",Font.BOLD,20));
        sectiont.setBackground(new Color(242, 156, 27));
        sectiont.setForeground(Color.white);
        sectiont.setOpaque(false);
        sectiont.setBorder(new MatteBorder(0,0,1,0,Color.white));

        submit = new JButton("Submit");
        submit.setBounds(350,360,300,50);
        submit.setFont(new Font("Roboto",Font.BOLD,35));
        submit.setBackground(new Color(242, 156, 27));
        submit.setForeground(Color.white);
        submit.setOpaque(false);
        submit.setBorder(new MatteBorder(0,0,0,0,Color.white));

        back = new JButton("Back");
        back.setBounds(80,50,100,40);
        back.setFont(new Font("Roboto",Font.BOLD,15));
        back.setBackground(new Color(242, 156, 27));
        back.setForeground(Color.white);
        back.setOpaque(false);
        back.setBorder(new MatteBorder(0,0,0,0,Color.black));

        logout = new JButton("Logout");
        logout.setBounds(760,50,100,40);
        logout.setFont(new Font("Roboto",Font.BOLD,15));
        logout.setBackground(new Color(242, 156, 27));
        logout.setForeground(Color.white);
        logout.setOpaque(false);
        logout.setBorder(new MatteBorder(0,0,0,0,Color.black));

        logout.addActionListener(new logouts());

        submit.addActionListener(new Routinec());
        back.addActionListener(new Back());



        add(submit);
        add(logout);
        add(back);
        add(yeart);
        add(yearl);
        add(branchl);
        add(sectionl);
        add(sectiont);
        add(brancht);
        add(panel);

        add(background);
        setLocation(230,100);
        setSize(950,550);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class logouts implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new SignUP();
            dispose();
            
        }
    }

    class Back implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new homepage(str);
            dispose();
        }
    }

    class Routinec implements ActionListener{
        public void actionPerformed(ActionEvent e){
        String years,branchs,sections;
        years =yeart.getText();
        branchs = brancht.getText();
        sections = sectiont.getText();

        if (years.equals("3rd") && branchs.equals("it") && sections.equals("morning")) {
            new routinefile();
            yeart.setText("");
            brancht.setText("");
            sectiont.setText("");
            
        }
            
        }
    }

    
    public static void main(String[] args) {
        String kk="";
        new routine(kk);
    }
}
