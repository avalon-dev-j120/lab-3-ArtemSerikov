package windows;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ChangeListener {

    public static MainWindow mainwindow = null;
    private static ColorBox  colorBox = null;
    private static RightPanel rightPanel= null;
    private static int colorRed = 125;
    private static int colorGreen = 125;
    private static int colorBlue = 125;

    public MainWindow() {

        mainwindow= this;

        setTitle("Color Picker");
        setSize(500,200);

        this.setLayout(new GridLayout(1,2)); // делим окно на две части
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        colorBox = new ColorBox();
        Color color = new Color(colorRed, colorGreen, colorBlue);
        colorBox.setBackground(color);
        colorBox.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new Color(240,240,240)));

        rightPanel= new RightPanel();
        rightPanel.setBackground(new Color(240,240,240));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));

        add(colorBox);
        add(rightPanel);

        setVisible(true);

    }

    public static MainWindow getInstance(){

        if(mainwindow != null) return mainwindow;
        else return new MainWindow();
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {

        JSlider slider = (JSlider) changeEvent.getSource();
        String sliderName = slider.getName();


       switch (sliderName) {

           case "Red": colorRed = slider.getValue();
            break;

           case "Green": colorGreen = slider.getValue();
               break;

           case "Blue": colorBlue = slider.getValue();
               break;

               default:
                   System.out.println("Какой-то левый слайдер: " + sliderName);
       }

       Color color = new Color(colorRed, colorGreen, colorBlue);

       colorBox.setBackground(color);

    }
}

