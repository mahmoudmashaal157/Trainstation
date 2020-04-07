package next_project;

    import java.util.*;
    import java.awt.*;
    import javax.swing.*;
    import java.io.*;

    public class DisplayAll extends JFrame {

        DisplayAll(){

            setTitle("Password");
            setSize(600,600);
            setVisible(true);
            setResizable(false);
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocation(430,80);
            Font f = new Font("Dialog",Font.BOLD,20);

            try {
                FileReader f1 = new FileReader("inp.txt");
                BufferedReader bf = new BufferedReader(f1);
                String data = new Scanner(new File("inp.txt")).useDelimiter("\\A").next();
                JTextArea t = new JTextArea(); 
                t.setDisabledTextColor(Color.BLACK);
                t.setBounds(0,0, 600, 600);
                t.setText(data);
                add(t);
                t.setFont(f);
                t.setEnabled(false);
            } catch (FileNotFoundException ex) {

            }
        }
}
