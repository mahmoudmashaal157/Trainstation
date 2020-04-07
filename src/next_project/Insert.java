package next_project;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.io.*;
    import java.sql.Time;
    import java.util.*;
    public class Insert extends JFrame implements ActionListener {
        public Insert(){
            setLocation(550,180);
            setSize(500,470);
            setResizable(false);
            setLayout(null);
            setTitle("Insert new traveller");
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            Font font1 = new Font("Arial",Font.BOLD, 25);
            Font font2 = new Font("Arial",Font.ROMAN_BASELINE, 25);
            JLabel Name=new JLabel("Name");
            Name.setBounds(20,20,500,50);
            Name.setFont(font1);
            JLabel From=new JLabel("From");
            From.setFont(font1);
            From.setBounds(20,90,500,50);

            JLabel To=new JLabel("To");
            To.setFont(font1);
            To.setBounds(20,160,550,50);
            JLabel Time=new JLabel("Time");
            Time.setFont(font1);
            Time.setBounds(20,230,550,50);

            JLabel ID=new JLabel("ID");
            ID.setFont(font1);
            ID.setBounds(20,300,550,50);

            final JTextField name=new JTextField();
            name.setBounds(110,20,350,50);
            name.setFont(font2);


            final JComboBox compto=new JComboBox();
            compto.addItem("Cairo");
            compto.addItem("Tanta");
            compto.addItem("Alexandria");
            compto.addItem("Mansoura");
            compto.addItem("Sharkia");
            compto.addItem("Fayoum");
            compto.addItem("Aswan");
            compto.setFont(font2);
            compto.setBounds(110,160,350,50);

            JTextField from=new JTextField();
            from.setFont(font2);
            from.setText("Menofia");
            from.setEnabled(false);
            from.setDisabledTextColor(Color.BLACK);
            from.setBounds(110,90,350,50);

            final JComboBox timecomp=new JComboBox();
            timecomp.addItem("4:00");
            timecomp.addItem("4:30");
            timecomp.addItem("5:00");
            timecomp.addItem("5:30");
            timecomp.addItem("6:00");
            timecomp.addItem("6:30");
            timecomp.addItem("7:00");
            timecomp.addItem("7:30");
            timecomp.setFont(font2);
            timecomp.setBounds(110,230,350,50);

            final JTextField id=new JTextField();
            id.setFont(font1);
            id.setBounds(110,300,350,50);

            JButton insert=new JButton("Insert");
            insert.setFont(font1);
            insert.setBounds(170,370,150,50);
            insert.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String name1=name.getText();
                    String too= (String) compto.getSelectedItem();
                    String ttime= (String) timecomp.getSelectedItem();
                    String id1=id.getText().toString();
                    //System.out.println(name1+" "+id1+" ");
                    try {
                        BufferedWriter w=new BufferedWriter(new FileWriter("inp.txt",true));
                        w.append(id1);
                        w.append(" || ");
                        w.append(name1);
                        w.append(" || ");
                        w.append("Menofia");
                        w.append(" || ");
                        w.append(too);
                        w.append(" || ");
                        w.append(ttime);
                        w.newLine();
                        w.close();
                        JOptionPane.showMessageDialog(null,"Done");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    name.setText("");
                    compto.setSelectedIndex(0);
                    id.setText("");
                }
            });
            add(ID);add(Name);add(From);add(To);
            add(id);add(name);add(compto);add(from);add(timecomp);add(Time);
            add(insert);
            setVisible(true);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

