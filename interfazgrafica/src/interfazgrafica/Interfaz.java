package interfazgrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.UIManager;

public class Interfaz {

    private JFrame frame;
    private JTextField txtRgeger;
    private JTextField textField;
    private String usuario;
    private String contraseña;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Interfaz window = new Interfaz();
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
    public Interfaz() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Usuario:");
        lblNewLabel.setBounds(165, 31, 46, 14);
        frame.getContentPane().add(lblNewLabel);

        txtRgeger = new JTextField();
        txtRgeger.setBounds(165, 48, 86, 20);
        frame.getContentPane().add(txtRgeger);
        txtRgeger.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Contraseña");
        lblNewLabel_1.setBounds(165, 96, 86, 14);
        frame.getContentPane().add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(165, 121, 86, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Recordar esta usuario");
        chckbxNewCheckBox.setBounds(154, 148, 131, 23);
        frame.getContentPane().add(chckbxNewCheckBox);

        JButton btnNewButton = new JButton("LOGIN");
        btnNewButton.setForeground(UIManager.getColor("Button.darkShadow"));
        btnNewButton.setBounds(165, 191, 89, 23);
        frame.getContentPane().add(btnNewButton);

        btnNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                usuario = txtRgeger.getText();
                System.out.println("usuario: " + usuario);
                contraseña = textField.getText();
                System.out.println("contraseña: " + contraseña);
            }
        });
    }
}