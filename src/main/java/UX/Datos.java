package UX;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class Datos {

    private JFrame frame;
    private JTextField numParte;
    private JTextField descripcion;
    private JTextField pvb;
    private JTextField cantidad;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Datos window = new Datos();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Datos() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setBounds(100, 100, 451, 613);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.activeCaption);
        panel.setBounds(0, 0, 445, 573);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("No. Parte");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(1, 92, 445, 33);
        panel.add(lblNewLabel);

        JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
        lblDescripcin.setHorizontalAlignment(SwingConstants.CENTER);
        lblDescripcin.setFont(new Font("Tahoma", Font.PLAIN, 27));
        lblDescripcin.setBounds(2, 188, 445, 33);
        panel.add(lblDescripcin);

        JLabel lblPvb = new JLabel("PVB");
        lblPvb.setHorizontalAlignment(SwingConstants.CENTER);
        lblPvb.setFont(new Font("Tahoma", Font.PLAIN, 27));
        lblPvb.setBounds(0, 297, 445, 33);
        panel.add(lblPvb);

        JLabel lblCantSolicitada = new JLabel("Cant. Solicitada");
        lblCantSolicitada.setHorizontalAlignment(SwingConstants.CENTER);
        lblCantSolicitada.setFont(new Font("Tahoma", Font.PLAIN, 27));
        lblCantSolicitada.setBounds(0, 398, 445, 33);
        panel.add(lblCantSolicitada);

        JLabel lblPvb_1 = new JLabel("");
        lblPvb_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblPvb_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
        lblPvb_1.setBounds(1, 405, 445, 33);
        panel.add(lblPvb_1);

        JLabel lblSapStock = new JLabel("SAP STOCK");
        lblSapStock.setHorizontalAlignment(SwingConstants.CENTER);
        lblSapStock.setFont(new Font("Tahoma", Font.ITALIC, 30));
        lblSapStock.setBounds(1, 1, 445, 33);
        panel.add(lblSapStock);

        numParte = new JTextField();
        numParte.setBounds(154, 147, 146, 26);
        panel.add(numParte);
        numParte.setColumns(10);

        descripcion = new JTextField();
        descripcion.setColumns(10);
        descripcion.setBounds(154, 246, 146, 26);
        panel.add(descripcion);

        pvb = new JTextField();
        pvb.setColumns(10);
        pvb.setBounds(154, 346, 146, 26);
        panel.add(pvb);

        cantidad = new JTextField();
        cantidad.setColumns(10);
        cantidad.setBounds(154, 456, 146, 26);
        panel.add(cantidad);
    }

}
