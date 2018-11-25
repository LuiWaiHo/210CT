/**
 * @Author Lui
 * @create 2018-10-18-下午 08:29
 **/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LDL_Cholesterol_Calculator extends JFrame implements ActionListener {
    //create TextField and button for user input and calculate
    private JTextField jtfTotal_Cholestero           = new JTextField(10);
    private JTextField jtfHDL_cholesterol          = new JTextField(10);
    private JTextField jtftriglyceride           = new JTextField(10);
    private JTextField jtfResult          = new JTextField(20);
    private JButton jbCompute             = new JButton("Compute");

    // Main method
    public static void main(String[ ] args) {
        LDL_Cholesterol_Calculator frame = new LDL_Cholesterol_Calculator( );
        frame.pack();
        //create and set up the title of the window
        frame.setTitle(" LDL Cholesterol");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //display the windows
        frame.setVisible(true);
    }

    public LDL_Cholesterol_Calculator( ) {
        // Panel p1 to hold labels and text fields
        /* create a panel, which is similar to HTML's div tag.
         * we can create multiple panels and specify locations in JFrame.
         * we can add text fields, buttons and other components in the panel.
         */

        JPanel p1 = new JPanel( );
        p1.setLayout(new GridLayout(4, 2));
        p1.add(new JLabel(" Total Cholesterol (TC)"));
        p1.add(jtfTotal_Cholestero);
        p1.add(new JLabel("HDL cholesterol (HDLC)"));
        p1.add(jtfHDL_cholesterol);
        p1.add(new JLabel("triglyceride (TG)"));
        p1.add(jtftriglyceride);
        p1.add(new JLabel("LDL"));
        p1.add(jtfResult);
        jtfResult.setEditable(false);

        // Add p1 to the frame
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(p1,BorderLayout.CENTER);
        this.getContentPane().add(jbCompute,BorderLayout.SOUTH);

        // Register listener
        jbCompute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        //When the listener the user press the button
        if (e.getSource() == jbCompute) {
            try {
                /*calculate the FC
                 * got the TC, HDLC and TG but they are String type, so convert to the Double to calculate
                 * base on these vale and the LDLC, display the suggestion message
                 * */

                String TC_massage = "";
                String HDLC_massage = "";
                String TG_massage = "";
                String LDLC_massage = "";
                Double TC = Double.parseDouble(this.jtfTotal_Cholestero.getText());
                Double HDLC = Double.parseDouble(this.jtfHDL_cholesterol.getText());
                Double TG = Double.parseDouble(this.jtftriglyceride.getText());
                Double LDLC = TC - HDLC - (TG / 5);
                String result = Double.toString(LDLC);
                jtfResult.setText(result);

                if (TC < 200)
                    TC_massage += "The value of TC is good";
                else if (TC>130&&TC<239)
                    TC_massage += "be careful";
                else
                    TC_massage += "The value is too high. Please go to the hospital quickly.";
                if (HDLC > 40)
                    HDLC_massage += "The value of HDLC is good";
                else
                    HDLC_massage += "The value is too high. Please go to the hospital quickly.";
                if (TG < 150)
                    TG_massage += "The value of TG is good";
                else if (TG>150&&TG<199)
                    TG_massage += "be careful";
                else
                    TG_massage += "The value is too high. Please go to the hospital quickly.";
                if (LDLC < 130)
                    LDLC_massage += "The value of LDLC is good";
                else if (TG>130&&TG<159)
                    LDLC_massage += "be careful";
                else
                    LDLC_massage += "The value is too high. Please go to the hospital quickly.";



                JOptionPane.showMessageDialog(null,"TC : "+TC_massage +"\n"+"HDLC : "+HDLC_massage+"\n"+"TG : "+TG_massage +"\n"+"LDLC"+LDLC_massage);

                //when input data is wrong the application will raise up the error message to the user
            }catch (NumberFormatException e1)
            {
                JOptionPane.showMessageDialog(null,"Input Number Format Error !");
            }catch (Exception e2)
            {
                JOptionPane.showMessageDialog(null,"Input Error!");
            }
//write your code here



        } // end of if
    } // end of ActionPerformed
} // end LDL_Cholesterol_Calculator
