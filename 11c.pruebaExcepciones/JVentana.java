/*Enlazado con slack v2 */
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.Font;
import java.awt.Color;

public class JVentana extends JFrame
{
    private Persona p;

    public static void main(String[] args)
    {
        new JVentana();
    }

	public JVentana()
	{
        super("Personas");

        JPanel pnlNorte = new JPanel(new FlowLayout());
        JPanel pnlCentro = new JPanel(new GridLayout(3, 2));
        JPanel pnlSur = new JPanel(new GridLayout(1, 2));

        JLabel lblTitulo = new JLabel("Gestion de Personas");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setForeground(new Color(112, 146, 190));
        pnlNorte.add(lblTitulo);

        JButton btnAceptar = new JButton("Aceptar");
        JButton btnCancelar = new JButton("Cancelar");

        JLabel lblNombre = new JLabel("Nombre: ");
        JLabel lblEdad = new JLabel("CP: ");

        JTextField txtNombre = new JTextField(10);
        JTextField txtEdad = new JTextField(10);

        pnlCentro.add(lblNombre);
        pnlCentro.add(txtNombre);
        pnlCentro.add(lblEdad);
        pnlCentro.add(txtEdad);
        pnlCentro.add(btnAceptar);
        pnlCentro.add(btnCancelar);

        pnlSur.add(new JLabel("v1.0"));
        JLabel lblBy = new JLabel("by DCB");
        lblBy.setHorizontalAlignment(JLabel.RIGHT); 
        pnlSur.add(lblBy);

        this.setLayout(new BorderLayout());
        this.add(pnlNorte, BorderLayout.NORTH);
        this.add(pnlCentro, BorderLayout.CENTER);
        this.add(pnlSur, BorderLayout.SOUTH);
        
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setVisible(true);
	}
}

