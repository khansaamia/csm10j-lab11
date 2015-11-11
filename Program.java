package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


    
    public class Program extends JFrame
    {
       private JLabel jlblTestScore1, jlblTestScore2, jlblTestScore3, jlblTestScore4;
       private JLabel jlblWeight1, jlblWeight2, jlblWeight3, jlblWeight4;
       private JLabel jlblResultMessage;
       private JTextField jtfTestScore1, jtfTestScore2, jtfTestScore3, jtfTestScore4;
       private JTextField jtfWeight1, jtfWeight2, jtfWeight3, jtfWeight4;
       private JTextField jtfResult;
       private JButton jbtnCalculate, jbtnExit;
       
       private static final int WIDTH=400;
       private static final int HEIGHT= 600;
       
       public Program()
       {
           setTitle("Weighted Average");
           Container ctnrCalc = getContentPane();
           ctnrCalc.setLayout(new GridLayout(10,1));
           jlblTestScore1= new JLabel("Test Score 1:", SwingConstants.RIGHT);
           jlblTestScore2= new JLabel("Test Score 2:", SwingConstants.RIGHT);
           jlblTestScore3= new JLabel("Test Score 3:", SwingConstants.RIGHT);
           jlblTestScore4= new JLabel("Test Score 4:", SwingConstants.RIGHT);
           jlblWeight1 = new JLabel ("Weight 1:", SwingConstants.RIGHT);
           jlblWeight2= new JLabel ("Weight 2:", SwingConstants.RIGHT);
           jlblWeight3= new JLabel ("Weight 3:", SwingConstants.RIGHT);
           jlblWeight4= new JLabel ("Weight 4:", SwingConstants.RIGHT);
           jlblResultMessage = new JLabel("Average Weight:", SwingConstants.RIGHT);
           
           jtfTestScore1=new JTextField();
           jtfTestScore2=new JTextField();
           jtfTestScore3=new JTextField();
           jtfTestScore4=new JTextField();
           
           jtfWeight1 = new JTextField();
           jtfWeight2 = new JTextField();
           jtfWeight3 = new JTextField();
           jtfWeight4 = new JTextField();
           
           jtfResult= new JTextField();
           jbtnCalculate = new JButton("Calculate");
           jbtnExit= new JButton ("Exit");
           
           ctnrCalc.add(jlblTestScore1);
           ctnrCalc.add(jtfTestScore1);
           ctnrCalc.add(jlblWeight1);
           ctnrCalc.add(jtfWeight1);
           ctnrCalc.add(jlblTestScore2);
           ctnrCalc.add(jtfTestScore2);
           ctnrCalc.add(jlblWeight2);
           ctnrCalc.add(jtfWeight2);
           ctnrCalc.add(jlblTestScore3);
           ctnrCalc.add(jtfTestScore3);
           ctnrCalc.add(jlblWeight3);
           ctnrCalc.add(jtfWeight3);
           ctnrCalc.add(jlblTestScore4);
           ctnrCalc.add(jtfTestScore4);
           ctnrCalc.add(jlblWeight4);
           ctnrCalc.add(jtfWeight4);
           ctnrCalc.add(jlblResultMessage);
           ctnrCalc.add(jtfResult);
           ctnrCalc.add(jbtnCalculate);
           ctnrCalc.add(jbtnExit);
           
           jbtnCalculate.addActionListener(new CalculateListener());
           jbtnExit.addActionListener(new ExitListener());
           
           setSize(WIDTH, HEIGHT);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setVisible(true);  
       } 

    private void setup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       private class CalculateListener implements ActionListener
       {
           public void actionPerformed(ActionEvent ae)
           {
               double score1, score2, score3, score4, weight1, weight2, weight3, weight4;
               double scoreWeight, weights, weightedAvg;
               
               score1= Double.parseDouble(jtfTestScore1.getText());
               weight1= Double.parseDouble(jtfWeight1.getText());
               score2=Double.parseDouble(jtfTestScore2.getText());
               weight2=Double.parseDouble(jtfWeight2.getText());
               score3=Double.parseDouble(jtfTestScore3.getText());
               weight3=Double.parseDouble(jtfWeight3.getText());
               score4= Double.parseDouble(jtfTestScore4.getText());
               weight4= Double.parseDouble(jtfWeight4.getText());
               
               scoreWeight = score1*weight1 + score2*weight2 + score3*weight3 + score4*weight4;
               weights= weight1 + weight2 + weight3 + weight4;
               weightedAvg= scoreWeight/weights;
               
               jtfResult.setText("" + weightedAvg);
               
           }
       }
       private class ExitListener implements ActionListener
       {
           public void actionPerformed(ActionEvent e)
           {
               System.exit(0);
           }
                   
       }
       public static void main(String[] args) {
        Program p= new Program();
        p.setup();
        p.setSize(200,300);
        p.setVisible(true);
       }
    }
    
