package rizvanovmusa;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Scorecounter {
    private static int cnt1;
    private static int cnt2;

    public static void main(String[] args) {
        JFrame fr1 = new JFrame("AC Milan против Real Madrid");
        Container cp;
        cnt1 = 0;
        cnt2 = 0;
        String scr = "N/A";
        String wnr = "DRAW";
        JButton milan, madrid;
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setSize(300, 200);
        fr1.setResizable(false);
        cp = fr1.getContentPane();
        cp.setLayout(new GridLayout(5, 1));
        milan = new JButton("AC Milan");
        madrid = new JButton("Real Madrid");
        JLabel lbl1 = new JLabel("Result: " + cnt1 + "X" + cnt2);
        JLabel lbl2 = new JLabel("Last Scorer: " + scr);
        JLabel lbl3 = new JLabel("Winner: " + wnr);
        cp.add(milan);
        cp.add(madrid);
        cp.add(lbl1);
        cp.add(lbl2);
        cp.add(lbl3);
        milan.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                cnt1++;
                lbl1.setText("Result: " + cnt1 + " X " + cnt2);
                lbl2.setText("Last Scorer: " + "AC Milan");
                if(cnt1 > cnt2)
                    lbl3.setText("Winner: " + "AC Milan");
                if(cnt1 == cnt2)
                    lbl3.setText("Winner: " + "DRAW");
            }
        });

        madrid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cnt2++;
                lbl1.setText("Result: " + cnt1 + " X " + cnt2);
                lbl2.setText("Last Scorer: " + "Real Madrid");
                if(cnt1 < cnt2)
                    lbl3.setText("Winner: " + "Real Madrid");
                if(cnt2 == cnt1)
                    lbl3.setText("Winner: " + "DRAW");
            }
        });

        fr1.show();
    }
}
