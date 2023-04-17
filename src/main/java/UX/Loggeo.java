package UX;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.MalformedURLException;

//import javax.swing.JButton;

public class Loggeo extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    Color myColor = new Color(0, 255, 214);
    Color fuera = new Color(12, 199, 232);
    JTextField usuario = new JTextField();
    JLabel grammer = new JLabel();
    JLabel logo = new JLabel();
    JFrame regisFrame;
    boolean cerrarFrame;
    String nUser = "";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Loggeo frame = new Loggeo();
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Loggeo() {
        setTitle("SAPV5");

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 366, 517);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panelFuera = new JPanel();
        panelFuera.setBounds(0, 0, 360, 488);
        panelFuera.setBackground(fuera);
        contentPane.add(panelFuera);
        panelFuera.setLayout(null);

        grammer.setVerticalAlignment(SwingConstants.TOP);
        grammer.setHorizontalAlignment(SwingConstants.CENTER);
        grammer.setLocation(10,21);
        grammer.setSize(323, 162);
        logo.setLocation(128, 437);


        JPanel panelDentro = new JPanel();
        panelDentro.setBounds(49, 162, 255, 255);
        panelDentro.setBackground(new Color(175, 238, 238));
        panelFuera.add(panelDentro);
        panelDentro.setLayout(null);

        panelFuera.add(grammer);

        usuario.setBounds(60, 80, 142, 30);
        usuario.setText(usuario.getText().toUpperCase());
        panelDentro.add(usuario);
        usuario.setBackground(Color.WHITE);


        JLabel lblBienvenido = new JLabel("BIENVENIDO");
        lblBienvenido.setForeground(new Color(0, 0, 51));
        lblBienvenido.setBounds(0, 0, 255, 52);
        panelDentro.add(lblBienvenido);
        lblBienvenido.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
        lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);

        Action actionUser = new AbstractAction() {
            private static final long serialVersionUID = 1L;

            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent evt) {

                nUser = usuario.getText().toUpperCase();
                System.out.println(nUser);
                try {

                    if(null != regisFrame && cerrarFrame) {
                        regisFrame.setVisible(false);
                    }

                }catch(Exception e1) {
                    System.out.println("Error no entramos");
                    e1.printStackTrace();
                }
            }
        };

        usuario.addActionListener(actionUser);
        usuario.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent evt) {

            }

            public void keyPressed(KeyEvent arg0) {

            }

            public void keyReleased (KeyEvent arg0) {

            }

        });


    }
}