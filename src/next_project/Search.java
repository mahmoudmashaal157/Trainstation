package next_project;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.Event.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.io.BufferedReader;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.IOException;
    import java.util.logging.Level;
    import java.util.logging.Logger;

    public class Search extends JFrame implements ActionListener {
        public String str;
        JTextField t1 = new JTextField(); 
        JButton b2 = new JButton("Display All");
        JButton b1 = new JButton("Search");
        JLabel l1 = new JLabel("ID");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        Search (){
            setTitle("Display");
            setSize(650,600);
            setVisible(true);
            setResizable(false);
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocation(430,80);
            Font f = new Font("Dialog",Font.BOLD,30);
            Font f1 = new Font("Dialog",Font.ROMAN_BASELINE,25);
            Font f2 = new Font("Dialog",Font.BOLD,10);
            p1.setBackground(Color.red);
            p2.setBackground(Color.white);
            p3.setBackground(Color.black);
            /////////////////////////////////////////
            l1.setBounds(20, 20 ,120 , 50);
            l1.setFont(f);
            p1.setLayout(null);
            p1.add(l1);
            /////////////////////////////////////////
            t1.setBounds(80,20, 400, 50);
            t1.setFont(f1);
            p1.add(t1);
            //////////////////////////////////////////
            b1.setBounds(500, 20, 130, 50);
            b1.setFont(f1);
            p1.add(b1);
            //////////////////////////////////////////
            p2.setLayout(null);
            //////////////////////////////////////////
            b2.setBounds(230, 70, 180, 50);
            b2.setFont(f1);
            p3.add(b2);
            p3.setLayout(null);
            ///////////////////////////////
            setLayout(new GridLayout(3,1));
            add(p1); add(p2); add(p3);
            b1.addActionListener(this);
            b2.addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b1){
                int x=0;

                try {
                    FileReader f = new FileReader("inp.txt");
                    BufferedReader bf = new BufferedReader(f);
                    String s;
                    s = t1.getText();
                    while((str=bf.readLine())!=null){
                        String all []=str.split(" ",6);
                        for(String a : all)  {
                            if(a.equals(s)){ 
                                JOptionPane.showMessageDialog(null, str);
                                x=1;
                                t1.setText(""); 
                                //    Display_2 d = new Display_2();
                                break; 

                            }
                        }

                    }
                    if(x==0){
                        JOptionPane.showMessageDialog(null, "Not found");
                    }
                } catch (FileNotFoundException ex) {

                } catch (IOException ex) {

                }

            }
            if(e.getSource()==b2){
                Password p = new Password();
            }
        }

    }

