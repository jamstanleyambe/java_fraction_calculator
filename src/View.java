import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class View extends JFrame {

    public  View(){

        ////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(3,1));
        jPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5,20));

        JLabel jLabel = new JLabel();
        jLabel.setText("Fraction 1");

        JLabel jLabelN = new JLabel();
        jLabelN.setText("Numerator");
        JTextField jTextFieldN = new JTextField();

        JLabel jLabelD = new JLabel();
        jLabelD.setText("Denominator");
        JTextField jTextFieldD = new JTextField();

        JPanel JtitleP = new JPanel();
        JtitleP.add(jLabel);

        JPanel JnumeP = new JPanel();
        JnumeP.add(jLabelN);
        JnumeP.add(jTextFieldN);
        JnumeP.setLayout(new GridLayout(1,2));

        JPanel JdenoP = new JPanel();
        JdenoP.add(jLabelD);
        JdenoP.add(jTextFieldD);
        JdenoP.setLayout(new GridLayout(1,2));

        jPanel.add(JtitleP);
        jPanel.add(JnumeP);
        jPanel.add(JdenoP);

        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////

        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(3,1));
        jPanel1.setBorder(BorderFactory.createEmptyBorder(0, 20, 5,0));

        JLabel jLabel1 = new JLabel();
        jLabel1.setText("Fraction 2");

        JLabel jLabelN1 = new JLabel();
        jLabelN1.setText("Numerator");
        JTextField jTextFieldN1 = new JTextField();

        JLabel jLabelD1 = new JLabel();
        jLabelD1.setText("Denominator");
        JTextField jTextFieldD1 = new JTextField();

        JPanel JtitleP1 = new JPanel();
        JtitleP1.add(jLabel1);

        JPanel JnumeP1 = new JPanel();
        JnumeP1.add(jLabelN1);
        JnumeP1.add(jTextFieldN1);
        JnumeP1.setLayout(new GridLayout(1,2));

        JPanel JdenoP1 = new JPanel();
        JdenoP1.add(jLabelD1);
        JdenoP1.add(jTextFieldD1);
        JdenoP1.setLayout(new GridLayout(1,2));

        jPanel1.add(JtitleP1);
        jPanel1.add(JnumeP1);
        jPanel1.add(JdenoP1);
        ///////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////

        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayout(1,1));

        JPanel  Jpanelresult = new JPanel();

        JLabel jLabelN2 = new JLabel();
        jLabelN2.setText("Numerator");

        JTextField Nresult = new JTextField();
        Nresult.setEditable(false);

        JLabel jLabelD2 = new JLabel();
        jLabelD2.setText("Denominator");

        JTextField Dresult = new JTextField();
        Dresult.setEditable(false);


        JPanel JpanelR1 = new JPanel();
        JpanelR1.add(jLabelN2);
        JpanelR1.add(Nresult);
        JpanelR1.setLayout(new GridLayout(1,2));
        JpanelR1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,20));

        JPanel JpanelR2 = new JPanel();
        JpanelR2.add(jLabelD2);
        JpanelR2.add(Dresult);
        JpanelR2.setLayout(new GridLayout(1,2));
        JpanelR2.setBorder(BorderFactory.createEmptyBorder(0, 20, 0,0));


        Jpanelresult.add(JpanelR1);
        Jpanelresult.add(JpanelR2);
        Jpanelresult.setLayout(new GridLayout(1,4));
        Jpanelresult.setBorder(BorderFactory.createEmptyBorder(0, 0, 5,0));

        //////////////////////////////////////////////////////////////////////////////////////////////////////
        JButton jButtonA = new JButton();
        jButtonA.setText("Addition");

        JButton jButtonS = new JButton();
        jButtonS.setText("Subtraction");

        JButton jButtonM = new JButton();
        jButtonM.setText("Multiplication");

        JButton jButtonD = new JButton();
        jButtonD.setText("Division");

        JPanel JPanelButton = new JPanel();
        JPanelButton.setLayout(new GridLayout(1,4));
        JPanelButton.add(jButtonA);
        JPanelButton.add(jButtonS);
        JPanelButton.add(jButtonM);
        JPanelButton.add(jButtonD);

        jPanel2.add(Jpanelresult);
        jPanel2.add(JPanelButton);

        JPanel firstpane = new JPanel();
        firstpane.add(jPanel);
        firstpane.add(jPanel1);
        firstpane.setLayout(new GridLayout(1,2));

        JPanel secondpane = new JPanel();
        secondpane.add(jPanel2);
        secondpane.add(JPanelButton);
        secondpane.setLayout(new GridLayout(2,1));

        JPanel Mainframe = new  JPanel();
        Mainframe.setLayout(new GridLayout(2,1,30,30));
        Mainframe.add(firstpane);
        Mainframe.add(secondpane);
        Mainframe.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));



//////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////
        this.setLocation(500,300);
        this.setSize(500,300);
        this.setTitle("Fraction");
        this.add(Mainframe);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1,1 ));
        this.setBackground(Color.blue);
    }
}

