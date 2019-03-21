import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DiezNumeros extends JFrame implements ActionListener {	
	
	public JTextField Num_Texto;
	public JLabel Ingresar, Res_Suma, Res_Promedio, Res_Menor, Res_Mayor;
	public JLabel Promedio, Menor, Mayor, Suma; 
	public JButton Boton;
	int[ ] Numeros;
    int Convert;
    int i=0;
    int j=0;
	
	public DiezNumeros(){
		super("Diez Números");
		setLayout(null);
		
		Ingresar = new JLabel("Ingresa los Números");
		Ingresar.setBounds(120,5,150,30);
		add(Ingresar);
		
		Num_Texto = new JTextField();
		Num_Texto.setBounds(100,40,150,30);
		add(Num_Texto);
		
		Boton = new JButton("Ingresa");
		Boton.setBounds(100,80,150,30);
		add(Boton);
        Boton.addActionListener(this);
        
        //Suma
        Res_Suma = new JLabel("EL Total es: ");
        Res_Suma.setBounds(300, 10, 150, 30);
        add(Res_Suma);
        
        Suma = new JLabel("");
        Suma.setBounds(300, 35, 150,30);
        add(Suma);
        //Fin Suma
        
        //Promedio
        Res_Promedio = new JLabel("El Promedio es: ");
        Res_Promedio.setBounds(300, 60, 150, 30);
        add(Res_Promedio);
        
        Promedio = new JLabel("");
        Promedio.setBounds(300, 85, 150, 30);
        add(Promedio);
        //Fin Promedio
        
        //Número Mayor
        Res_Mayor = new JLabel("El Número Mayor es:");
        Res_Mayor.setBounds(300, 105, 150, 30);
        add(Res_Mayor);
        
        Mayor = new JLabel("");
        Mayor.setBounds(300, 130, 150, 30);
        add(Mayor);
        //Fin Número Mayor 
        
        //Número Menor
        Res_Menor = new JLabel("EL Número Menor es: ");
        Res_Menor.setBounds(300, 155, 150, 30);
        add(Res_Menor);
        
        Menor= new JLabel("");
        Menor.setBounds(300, 180, 150, 30);
        add(Menor);
        
        ///Fin Número Menor
        
        //Exit
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent h) {
		if(h.getSource()==Boton) {
			 //Tamaño del arreglo
			 Numeros= new int[9];
			 //Se crea la variable Num para convertir lo que se va a ingresar en el JTextField(Num_Text)
			 String Num=Num_Texto.getText();
		     Convert=Integer.parseInt(Num);
			  //J será el acumulador para hacer la suma	          
	          if(j<Convert) {
	        	  System.out.println(j);
	        	  j++;
	          }else {
	        	 JOptionPane.showMessageDialog(null, "El arreglo está lleno");
	          }
	          /*for(int i=0; i<=Numeros.length; i++) {
	        	  Numeros [i]=Convert;
	        	  }	  */ 
	      }
	}	
	public static void main(String[] args) {
		DiezNumeros JFrame = new DiezNumeros();
		JFrame.setBounds(10, 80, 550, 250);
		JFrame.setVisible(true);	
	}
}
