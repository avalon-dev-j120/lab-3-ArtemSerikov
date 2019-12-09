package windows;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MainWindow extends JFrame implements ChangeListener {

    public static MainWindow mainwindow = null;

    private JButton buttonCalculate;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonCE;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonDev;
    private JButton buttonSplitUp;
    private JButton buttonPoint;

    public MainWindow(){

        mainwindow= this;

        setTitle("Calculator");
        setSize(300,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel display = new JPanel();







        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(4,4));





        JPanel buttonCalc = new JPanel();
        buttonCalculate = new JButton("=");
        buttonCalc.setLayout(new BorderLayout());
        buttonCalc.add(buttonCalculate, BorderLayout.CENTER);






        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttons, BorderLayout.CENTER);
        add(buttonCalc, BorderLayout.SOUTH);


        setVisible(true);
    }

    public static MainWindow getInstance(){

        if(mainwindow != null) return mainwindow;
        else return new MainWindow();
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {

    }
}
