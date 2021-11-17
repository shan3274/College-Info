import java.awt.Color;
import java.awt.*;
import javax.swing.border.MatteBorder;
import javax.swing.*;
import java.awt.event.*;



public class homepage extends JFrame{
    JLabel background,logoutl,user,studentSec,studentSecl,facultySec,facultySecl,adminPan,adminPanl;
    JLabel routinel,holidaysl,syllabusl,tinfol,exam,sinfol,slist;
    String str1;
    JPanel panle,panle1;
    JButton sInfo,holidays,routine,syllabus,examdetail,tInfo,slistb;
    homepage(String Name){

        str1 = Name;

        ImageIcon teacher = new ImageIcon("img/teacher.png");
        ImageIcon student = new ImageIcon("img/student.png");
        ImageIcon admin = new ImageIcon("img/admin.png");
        
        
        JButton btn = new JButton(student);
        JButton btn1 = new JButton(teacher);
        JButton btn2 = new JButton(admin);
        ImageIcon logoutbtn = new ImageIcon("img/logout.png");
        JButton logout = new JButton(logoutbtn);
        JTextField t1= new JTextField("text goes here");

        ImageIcon img = new ImageIcon("img/bg .jpg");
        ImageIcon rtn = new ImageIcon("img/routine.png");
        ImageIcon holi = new ImageIcon("img/holidays.png");
        ImageIcon syl = new ImageIcon("img/syllabus.png");
        ImageIcon ti = new ImageIcon("img/teacherinfo.png");
        ImageIcon si = new ImageIcon("img/studentinfo.png");
        ImageIcon ed = new ImageIcon("img/examdetails.png");
        ImageIcon slist = new ImageIcon("img/list.png");


        routinel = new JLabel("Routine");
        routinel.setBounds(255,190,350,50);
        routinel.setVisible(true);
        routinel.setFont(new Font("Serif",Font.BOLD,20));
        routinel.setForeground(Color.black);


        holidaysl = new JLabel("Holidays");
        holidaysl.setBounds(500,190,350,50);
        holidaysl.setVisible(true);
        holidaysl.setFont(new Font("Serif",Font.BOLD,20));
        holidaysl.setForeground(Color.black);



        syllabusl = new JLabel("Syllabus");
        syllabusl.setBounds(755,190,350,50);
        syllabusl.setVisible(true);
        syllabusl.setFont(new Font("Serif",Font.BOLD,20));
        syllabusl.setForeground(Color.black);



        tinfol = new JLabel("Teacher info");
        tinfol.setBounds(240,410,350,50);
        tinfol.setVisible(true);
        tinfol.setFont(new Font("Serif",Font.BOLD,20));
        tinfol.setForeground(Color.black);



        exam = new JLabel("Exam Details");
        exam.setBounds(485,410,350,50);
        exam.setVisible(true);
        exam.setFont(new Font("Serif",Font.BOLD,20));
        exam.setForeground(Color.black);


        sinfol = new JLabel("Student Info");
        sinfol.setBounds(740,410,350,50);
        sinfol.setVisible(true);
        sinfol.setFont(new Font("Serif",Font.BOLD,20));
        sinfol.setForeground(Color.black);
        
        
        routine = new JButton(rtn);
        routine.setBounds(250,90,100,100);
        routine.setBorder(new MatteBorder(0,0,0,0,Color.gray));
        routine.setBackground(new Color(0,0,0));
        routine.setOpaque(false);
        routine.setBorder(new MatteBorder(0,0,0,0,Color.white));
        routine.setFont(new Font("Serif",Font.BOLD,30));
        routine.setForeground(Color.BLACK);
        
        routine.addActionListener(new Routine());

        holidays = new JButton(holi);
        holidays.setBounds(500,90,100,100);
        holidays.setBorder(new MatteBorder(0,0,0,0,Color.gray));
        holidays.setBackground(new Color(0,0,0));
        holidays.setOpaque(false);
        holidays.setBorder(new MatteBorder(0,0,0,0,Color.white));
        holidays.setFont(new Font("Serif",Font.BOLD,30));
        holidays.setForeground(Color.BLACK);

        holidays.addActionListener(new Holi());

        syllabus = new JButton(syl);
        syllabus.setBounds(750,90,100,100);
        syllabus.setBorder(new MatteBorder(0,0,0,0,Color.gray));
        syllabus.setBackground(new Color(0,0,0));
        syllabus.setOpaque(false);
        syllabus.setBorder(new MatteBorder(0,0,0,0,Color.white));
        syllabus.setFont(new Font("Serif",Font.BOLD,30));
        syllabus.setForeground(Color.BLACK);


        syllabus.addActionListener(new Syllabusm());


        tInfo = new JButton(ti);
        tInfo.setBounds(250,320,100,100);
        tInfo.setBorder(new MatteBorder(0,0,0,0,Color.gray));
        tInfo.setBackground(new Color(0,0,0));
        tInfo.setOpaque(false);
        tInfo.setBorder(new MatteBorder(0,0,0,0,Color.white));
        tInfo.setFont(new Font("Serif",Font.BOLD,30));
        tInfo.setForeground(Color.BLACK);
        

        examdetail = new JButton(ed);
        examdetail.setBounds(500,320,100,100);
        examdetail.setBorder(new MatteBorder(0,0,0,0,Color.gray));
        examdetail.setBackground(new Color(0,0,0));
        examdetail.setOpaque(false);
        examdetail.setBorder(new MatteBorder(0,0,0,0,Color.white));
        examdetail.setFont(new Font("Serif",Font.BOLD,30));
        examdetail.setForeground(Color.BLACK);

        sInfo = new JButton(si);
        sInfo.setBounds(750,320,100,100);
        sInfo.setBorder(new MatteBorder(0,0,0,0,Color.gray));
        sInfo.setBackground(new Color(0,0,0));
        sInfo.setOpaque(false);
        sInfo.setBorder(new MatteBorder(0,0,0,0,Color.white));
        sInfo.setFont(new Font("Serif",Font.BOLD,30));
        sInfo.setForeground(Color.BLACK);


        slistb = new JButton(slist);
        slistb.setBounds(350,150,100,100);
        slistb.setBorder(new MatteBorder(0,0,0,0,Color.gray));
        slistb.setBackground(new Color(0,0,0));
        slistb.setOpaque(false);
        slistb.setBorder(new MatteBorder(0,0,0,0,Color.white));
        slistb.setFont(new Font("Serif",Font.BOLD,30));
        slistb.setForeground(Color.BLACK);
        slistb.setVisible(false);
        
        
        
        logoutl = new JLabel("logout");
        logoutl.setBounds(45,22,100,20);
        logoutl.setFont(new Font("Serif",Font.BOLD,15));
        logoutl.setForeground(Color.BLACK);

        t1.setBounds(50,100,300,40);
        t1.setFont(new Font("Serif", Font.BOLD, 20));
        
        background= new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,950,550);
        
        panle = new JPanel();
        panle1 = new JPanel();
        


        studentSec= new JLabel("Student Section");
        studentSec.setBounds(380,20,350,50);
        studentSec.setVisible(true);
        studentSec.setFont(new Font("Serif",Font.BOLD,35));
        studentSec.setForeground(Color.black);


        studentSecl= new JLabel("Student Section");
        studentSecl.setBounds(10,150,350,50);
        studentSecl.setVisible(true);
        studentSecl.setFont(new Font("Serif",Font.BOLD,15));
        studentSecl.setForeground(Color.black);

        facultySecl= new JLabel("Faculty Section");
        facultySecl.setBounds(10,290,350,50);
        facultySecl.setVisible(true);
        facultySecl.setFont(new Font("Serif",Font.BOLD,15));
        facultySecl.setForeground(Color.black);

        adminPanl= new JLabel("Admin Panel");
        adminPanl.setBounds(15,440,350,50);
        adminPanl.setVisible(true);
        adminPanl.setFont(new Font("Serif",Font.BOLD,15));
        adminPanl.setForeground(Color.black);

        facultySec= new JLabel("Faculty Section");
        facultySec.setBounds(380,20,350,50);
        facultySec.setFont(new Font("Serif",Font.BOLD,35));
        facultySec.setForeground(Color.black);


        adminPan= new JLabel("Admin Panel");
        adminPan.setBounds(380,20,350,50);
        adminPan.setFont(new Font("Serif",Font.BOLD,35));
        adminPan.setForeground(Color.black);

        facultySec.setVisible(false);
        adminPan.setVisible(false);
        

        panle.setLayout(null);
        panle.setBounds(160,20,772,480);
        panle.setBackground(Color.white);
        panle.setVisible(true);

        panle1.setLayout(null);
        panle1.setBounds(0,0,150,550);
        panle1.setBackground(Color.white);
        panle1.setVisible(true);
    

        logout.setBounds(20,5,100,20);
        logout.setBorder(new MatteBorder(0,0,0,0,Color.gray));
        logout.setBackground(new Color(0,0,0));
        logout.setBorder(new MatteBorder(0,0,0,0,Color.white));
        logout.setFont(new Font("Serif",Font.BOLD,15));
        logout.setForeground(Color.BLACK);
        logout.setOpaque(false);

        logout.addActionListener(new logouts());
        
        
       
        btn.setBounds(23,60,100,100);
        btn.setBorder(new MatteBorder(0,0,0,0,Color.gray));
        btn.setBackground(new Color(0,0,0));
        btn.setBorder(new MatteBorder(0,0,0,0,Color.white));
        btn.setFont(new Font("Serif",Font.BOLD,30));
        btn.setForeground(Color.BLACK);
        btn.setOpaque(false);

        btn.addActionListener(new Studenpage());

        btn1.setBounds(20,200,100,100);
        btn1.setBorder(new MatteBorder(0,0,0,0,Color.gray));
        btn1.setBackground(new Color(0,0,0));
        btn1.setBorder(new MatteBorder(0,0,0,0,Color.white));
        btn1.setFont(new Font("Serif",Font.BOLD,30));
        btn1.setForeground(Color.BLACK);
        btn1.setOpaque(false);

        btn1.addActionListener(new facultypage());

        btn2.setBounds(25,350,100,100);
        btn2.setBorder(new MatteBorder(0,0,0,0,Color.gray));
        btn2.setBackground(new Color(0,0,0));
        btn2.setBorder(new MatteBorder(0,0,0,0,Color.white));
        btn2.setFont(new Font("Serif",Font.BOLD,30));
        btn2.setForeground(Color.BLACK);
        btn2.setOpaque(false);

        btn2.addActionListener(new adminpage());



        user= new JLabel("Welcome "+Name);
        user.setBounds(25,470,200,50);
        user.setVisible(true);
        user.setFont(new Font("Serif",Font.BOLD,10));
        user.setForeground(Color.BLACK);


        add(btn);
        add(btn1);
        add(btn2);
        add(tInfo);
        add(sInfo);
        add(examdetail);
        add(logout);
        add(logoutl);
        add(user);
        add(studentSec);
        add(facultySec);
        add(adminPan);
        add(routine);
        add(holidays);
        add(syllabus);
        add(studentSecl);
        add(facultySecl);
        add(adminPanl);
        add(routinel);
        add(tinfol);
        add(holidaysl);
        add(syllabusl);
        add(exam);
        add(sinfol);
        add(slistb);


        add(panle);
        add(panle1);
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


    class Syllabusm implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new Syllabus(str1);
            dispose();
            
        }
    }

    class Holi implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new holidays();
        }
    }


    class Routine implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new routine(str1);
            dispose();
            
        }
    }

    class Studenpage implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            studentSec.setVisible(true);
            facultySec.setVisible(false);
            adminPan.setVisible(false);
            sInfo.setVisible(true);
            holidays.setVisible(true);
            routine.setVisible(true);
            syllabus.setVisible(true);
            examdetail.setVisible(true);
            tInfo.setVisible(true);

            sinfol.setVisible(true);
            routinel.setVisible(true);
            holidaysl.setVisible(true);
            syllabusl.setVisible(true);
            exam.setVisible(true);
            tinfol.setVisible(true);
            slistb.setVisible(false);



           
        }
    }
    class facultypage implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            
            studentSec.setVisible(false);
            facultySec.setVisible(true);
            adminPan.setVisible(false);
            sInfo.setVisible(false);
            holidays.setVisible(false);
            routine.setVisible(false);
            syllabus.setVisible(false);
            examdetail.setVisible(false);
            tInfo.setVisible(false);
            slistb.setVisible(true);

            sinfol.setVisible(false);
            routinel.setVisible(false);
            holidaysl.setVisible(false);
            syllabusl.setVisible(false);
            exam.setVisible(false);
            tinfol.setVisible(false);
        }
    }

    class adminpage implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            studentSec.setVisible(false);
            facultySec.setVisible(false);
            adminPan.setVisible(true);
            
            sInfo.setVisible(false);
            holidays.setVisible(false);
            routine.setVisible(false);
            syllabus.setVisible(false);
            examdetail.setVisible(false);
            tInfo.setVisible(false);

            sinfol.setVisible(false);
            routinel.setVisible(false);
            holidaysl.setVisible(false);
            syllabusl.setVisible(false);
            exam.setVisible(false);
            tinfol.setVisible(false);
            slistb.setVisible(false);
        }
    }
    public static void main(String[] args) {

        String Name="";
        new homepage(Name);
    }
}