package exercicio7;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface extends JFrame {
	
	JLabel lblCO = new JLabel("Cateto Oposto");
	JLabel lblCA = new JLabel("Cateto Adjacente");
	JLabel lblhipotenusa = new JLabel("Hipotenusa");
	JLabel lblseno = new JLabel("Seno");
	JLabel lblcosseno = new JLabel("Cosseno");
	JTextField txtCO = new JTextField();
	JTextField txtCA = new JTextField();
	JTextField txthipotenusa = new JTextField();
	JTextField txtseno = new JTextField();
	JTextField txtcosseno = new JTextField();

	JButton btnCalculo = new JButton("Calcular");
	
		double co, ca, h;
	public Interface(){
			
		super("Calculo");
		Calculo calc = new Calculo();
		
		Container paine = this.getContentPane();
		
		paine.add(lblCO); // label
		
		lblCO.setBounds(20,20,245,40);
		
		paine.add(txtCO);// caixa
		txtCO.setBounds(120,30,140,20);
		
		paine.add(lblCA);// label
		lblCA.setBounds(20,100,245,40);
		
		paine.add(txtCA);// caixa
		txtCA.setBounds(120,110,140,20);
		
		paine.add(lblhipotenusa);// label
		lblhipotenusa.setBounds(20,140,245,40);
		
		paine.add(txthipotenusa);// caixa
		txthipotenusa.setBounds(120,150,140,20);
		
		paine.add(lblseno);// label
		lblseno.setBounds(20,220,245,40);
		
		paine.add(txtseno);// caixa
		txtseno.setBounds(120,230,140,20);
		
		paine.add(lblcosseno);// label
		lblcosseno.setBounds(20,180,245,40);
		
		paine.add(txtcosseno);// caixa
		txtcosseno.setBounds(120,190,140,20);
		

		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 co = Double.parseDouble(txtCO.getText());
				 ca = Double.parseDouble(txtCA.getText());
				 h = Double.parseDouble(txthipotenusa.getText());
				 txtseno.setText("" + calc.seno(co, h));
				 txtcosseno.setText("" + calc.cosseno(ca, h));
				 
			 }
		 });
		btnCalculo.setBounds(90,400,100,40);
		
		txtseno.setEditable(false);
		txtcosseno.setEditable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(350, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Interface cad = new Interface();
		
	}
}
