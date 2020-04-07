package next_project;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.Event.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    public class SelectWindow extends JFrame implements ActionListener {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        ////////////////////////////
        JButton b1 = new JButton("Book Ticket");
        JButton b2 = new JButton("Display");
        JButton b3 = new JButton("Time");
        SelectWindow (){
            setTitle("TrainStation");
            setSize(600,600);
            setVisible(true);
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocation(430,80);
            setLayout(new GridLayout(3,1));
            Font f = new Font ("Dialog",Font.BOLD,20);
            p1.setBackground(Color.red);
            p2.setBackground(Color.white);
            p3.setBackground(Color.black);
            b1.setBounds(180,50,200,70);
            p1.add(b1);
            b1.setFont(f);
            p1.setLayout(null);
            ///////////////////////////////////
            b2.setBounds(180,50,200, 70);
            p2.add(b2);
            b2.setFont(f);
            p2.setLayout(null);
            ////////////////////////////////////
            b3.setBounds(180,50,200, 70);
            p3.add(b3);
            b3.setFont(f);
            p3.setLayout(null);
            /////////////////////////////////////
            add(p1); add(p2); add(p3);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            
        }

        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b2){
                Search d = new Search();
            }
            if(e.getSource()==b1){
                Insert t = new Insert();
            }
            if(e.getSource()==b3){
                Times g = new Times();
            }

        }


    }

