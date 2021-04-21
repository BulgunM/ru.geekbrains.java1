package Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCounterApp extends JFrame {

    Container contentPane = getContentPane();

    JPanel pnl = new JPanel();
    JPanel pnl1 = new JPanel();
    JPanel grid = new JPanel(new GridLayout( 2 , 2 ));

    JRadioButton radioButton1 = new JRadioButton("Зима");
    JRadioButton radioButton2 = new JRadioButton("Весна");
    JRadioButton radioButton3 = new JRadioButton("Лето");
    JRadioButton radioButton4 = new JRadioButton("Осень");

    // позволяет делать только один выбор
    ButtonGroup seasons = new ButtonGroup() ;

    JTextField txt1 = new JTextField( "К какому времени года относятся эти месяцы?",40) ;

    NewCounterApp() {

        setBounds(400, 400, 500, 200);
        setTitle("Seasons");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        seasons.add(radioButton1);
        seasons.add(radioButton2);
        seasons.add(radioButton3);
        seasons.add(radioButton4);

        pnl.add( new JLabel( "Март" ) ) ;
        pnl.add( new JLabel( "Апрель" ) ) ;
        pnl.add( new JLabel( "Май" ) ) ;

        pnl.add( txt1 ) ;

        grid.add(radioButton1) ;
        grid.add(radioButton2) ;
        grid.add(radioButton3) ;
        grid.add(radioButton4) ;

        contentPane.add( "Center" , pnl ) ;
        contentPane.add( "North", pnl1) ;
        contentPane.add( "South" , grid ) ;

        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("Подумайте еще");
            }
        });

        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("Правильно!");
            }
        });

        radioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("Подумайте еще");
            }
        });

        radioButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("Подумайте еще");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new NewCounterApp();
    }
}
