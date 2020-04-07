package next_project;


    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    public class Password extends JFrame implements ActionListener {
        JLabel l1 = new JLabel("enter the adminstration Password");
        JPasswordField p = new JPasswordField();
        JButton b1 = new JButton("OK");
        Password(){
            setTitle("Password");
            setSize(450,300);
            setVisible(true);
            setResizable(false);
//       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocation(560,220);
            Font f = new Font("Dialog",Font.BOLD,20);
            l1.setBounds(80,50 , 350, 30);
            l1.setFont(f);
            add(l1);
            //password/////////////////////////
            p.setBounds(130, 100, 200, 30);
            add(p);
            //button/////////////////////////////
            b1.setBounds(150, 200, 150, 30);
            add(b1);
            b1.setFont(f);
            ////////////////////////////////////
            b1.addActionListener(this);
            setLayout(null);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b1){
                String s;
                s=p.getText();
                String pass = "123456";
                if(s.equals(pass)){
                    DisplayAll d = new DisplayAll();
                    setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(null, " Wrong Password ");
                    p.setText("");
                }
            }

        }

    }

