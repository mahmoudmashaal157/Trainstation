package next_project;
    import java.awt.*;
    import javax.swing.*;
    public class Times extends JFrame {
        JTable tab;
        String columns []= new String []{" TO " , "Times","Times","Times","Times","Times","Times","Times","Times"};
        String data[][] = new String [][]{{"Cairo" ,"4:00","4:30","5:00","5:30","6.00","6:30","7:00","7:30"},
                {"Tanta","4:00","4:30","5:00","5:30","6.00","6:30","7:00","7:30"},
                {"Alexandria","4:00","4:30","5:00","5:30","6.00","6:30","7:00","7:30"},
                {"Mansoura","4:00","4:30","5:00","5:30","6.00","6:30","7:00","7:30"},
                {"Sharkia","4:00","4:30","5:00","5:30","6.00","6:30","7:00","7:30"},
                {"Fayoum","4:00","4:30","5:00","5:30","6.00","6:30","7:00","7:30"},
                {"Aswan","4:00","4:30","5:00","5:30","6.00","6:30","7:00","7:30"}


        };

        ////////////////////////////
        JPanel p1 = new JPanel();
        Times(){
            setTitle("Times");
            setSize(500,300);
            setVisible(true);
            setResizable(false);
            //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocation(450,180);
            Font f = new Font("Dialog",Font.BOLD,12);
            p1.setBackground(Color.white);
            tab =new JTable(data,columns);
            add(tab);
            tab.setFont(f);
            tab.setBackground(Color.yellow);

        }

    }

