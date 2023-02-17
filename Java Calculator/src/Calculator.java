import javax.swing.*;
import java.awt.*;

public class Calculator {
    public Calculator(){
        //Calculator Body
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(400,200);


        //Calculator Display
        JLabel displayLabel = new JLabel("Hello");
        displayLabel.setBounds(30,50,540,40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        //Calculator Buttons

        //First Row
        JButton sevenButton =new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        jf.add(sevenButton);

        JButton eightButton =new JButton("8");
        eightButton.setBounds(130,130,80,80);
        jf.add(eightButton);

        JButton nineButton =new JButton("9");
        nineButton.setBounds(230,130,80,80);
        jf.add(nineButton);

        //Second Row
        JButton fourButton =new JButton("4");
        fourButton.setBounds(30,230,80,80);
        jf.add(fourButton);

        JButton fiveButton =new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        jf.add(fiveButton);

        JButton sixButton =new JButton("6");
        sixButton.setBounds(230,230,80,80);
        jf.add(sixButton);

        //Third Row
        JButton oneButton =new JButton("1");
        oneButton.setBounds(30,330,80,80);
        jf.add(oneButton);

        JButton twoButton =new JButton("2");
        twoButton.setBounds(130,330,80,80);
        jf.add(twoButton);

        JButton threeButton =new JButton("3");
        threeButton.setBounds(230,330,80,80);
        jf.add(threeButton);

        //Fourth Row
        JButton dotButton =new JButton(".");
        dotButton.setBounds(30,430,80,80);
        jf.add(dotButton);

        JButton zeroButton =new JButton("0");
        zeroButton.setBounds(130,430,80,80);
        jf.add(zeroButton);

        JButton equalButton =new JButton("=");
        equalButton.setBounds(230,430,80,80);
        jf.add(equalButton);


        //Operators
        JButton divisionButton =new JButton("÷");
        divisionButton.setBounds(330,130,80,80);
        jf.add(divisionButton);

        JButton multiplyButton =new JButton("x");
        multiplyButton.setBounds(330,230,80,80);
        jf.add(multiplyButton);

        JButton minusButton =new JButton("-");
        minusButton.setBounds(330,330,80,80);
        jf.add(minusButton);

        JButton plusButton =new JButton("+");
        plusButton.setBounds(330,430,80,80);
        jf.add(plusButton);




        //Making it appear
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
