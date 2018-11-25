/**
 * @Author Lui
 * @create 2018-10-18-下午 08:20
 **/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fat_Coefficient_calculator extends JFrame implements ActionListener {
    //create TextField and button for user input and calculate
    private JTextField jtfWeight          = new JTextField(10);
    private JTextField jtfHeight          = new JTextField(10);
    private JTextField jtfCofficient  = new JTextField(20);
    private JTextField jtfResult          = new JTextField(20);
    private JButton jbCompute             = new JButton("Compute");

    // Main method
    public static void main(String[ ] args) {
        // GUI
        Fat_Coefficient_calculator frame = new Fat_Coefficient_calculator( );
        //create and set up the title of the windown
        frame.setTitle("Fat Coefficient");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //display the windows
        frame.pack();
        frame.setVisible(true);
    }

    public Fat_Coefficient_calculator( ) {
        // Panel p1 to hold labels and text fields
        /* create a panel, which is similar to HTML's div tag.
         * we can create multiple panels and specify locations in JFrame.
         * we can add text fields, buttons and other components in the panel.
         */
        JPanel p1 = new JPanel( );
        p1.setLayout(new GridLayout(4, 2));
        p1.add(new JLabel("Weight (kg)"));
        p1.add(jtfWeight);
        p1.add(new JLabel("Height (m)"));
        p1.add(jtfHeight);
        p1.add(new JLabel("Coefficient, good if 15 to 25"));
        p1.add(jtfCofficient);
        jtfCofficient.setEditable(false);
        p1.add(new JLabel("Result"));
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
                * got the heigh and weight but they are String type, so convert to the Double to calculate
                * base on the FC, display the suggestion message
                 * */
                Double Height = Double.parseDouble(this.jtfHeight.getText());
                Double Weight = Double.parseDouble(this.jtfWeight.getText());
                Double FC = Weight / (Height * Height);
                String result = Double.toString(FC);
                jtfCofficient.setText(result);
                if ( FC > 25)
                {
                    jtfResult.setText("Too Fat, need to keep fit!");
                }
                else if (FC < 15)
                {
                    jtfResult.setText("Too Thin, need to keep fat!");
                }
                else
                {
                    jtfResult.setText("Just fit, keep on!");
                }
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
} // end Fat_Coefficient_calculator


