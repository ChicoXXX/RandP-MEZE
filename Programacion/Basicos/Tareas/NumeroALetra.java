import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NumeroALetra extends JFrame implements ActionListener {
	
	public JTextField NumeroText;
	public JLabel Ingresar, Ingresar2, Res_Uni, Res_Dece, Res_Cen, Res_Mill, Mostrar;
	public JButton Boton;
	
	
	public NumeroALetra(){
		
		super ("Números Decimales a Letra");
		setLayout(null);
		
		Ingresar2 = new JLabel("Ingresa el Número");
		Ingresar2.setBounds(50,10,150,30);
		add(Ingresar2);
		
		NumeroText = new JTextField();
		NumeroText.setBounds(50,40,100,30);
		add(NumeroText);
		
		Ingresar = new JLabel();
		Ingresar.setBounds(50,80,100,30);
		add(Ingresar);
		
		Boton = new JButton("Conversión");
		Boton.setBounds(50,90,100,30);
		add(Boton);
		Boton.addActionListener(this);
		
		Mostrar = new JLabel("Tu resultado es: ");
		Mostrar.setBounds(50, 120,100,30);
		add(Mostrar);
		
		Res_Uni = new JLabel();
		Res_Uni.setBounds(230, 150,100,30);
		add(Res_Uni);
		
		Res_Dece = new JLabel();
		Res_Dece.setBounds(150, 150,100,30);
		add(Res_Dece);
		
		Res_Cen = new JLabel();
		Res_Cen.setBounds(75, 150,100,30);
		add(Res_Cen);
		
		Res_Mill = new JLabel();
		Res_Mill.setBounds(10, 150,100,30);
		add(Res_Mill);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		  if (e.getSource()==Boton) {
			  		  
			  String Num = NumeroText.getText();
	           	            
	          int Conver = Integer.parseInt(Num);
	          int Unidades, Decenas,Centenas, Millar;
	         	          
	        //Unidades
		      Unidades=Conver%10; Conver/=10; //3614 > U4 >361
		  	//Decenas
		      Decenas= Conver%10; Conver/=10; //361 >D1 >36 101
		    //Centenas 
			 Centenas=Conver%10; Conver/=10; //36 > C6 >3
	        //Millares
	          Millar=Conver%10; Conver/=10; //3 > (M3) >0
	              
	       switch(Millar) {
	       		case 1: Res_Mill.setText(String.valueOf("Mil")) ; break;
	       		case 2: Res_Mill.setText(String.valueOf("Dos Mil")); break;
	       		case 3: Res_Mill.setText(String.valueOf("Tres Mil")); break;
	       		case 4: Res_Mill.setText(String.valueOf("Cuatro Mil")); break;
	       		case 5: Res_Mill.setText(String.valueOf("Cinco Mil")); break;
	       		case 6: Res_Mill.setText(String.valueOf("Seis Mil")); break;
	       		case 7: Res_Mill.setText(String.valueOf("Siete Mil")); break;
	       		case 8: Res_Mill.setText(String.valueOf("Ocho Mil")); break;
	       		case 9: Res_Mill.setText(String.valueOf("Nueve Mil")); break;
	       		default: Res_Mill.setText(String.valueOf("")); break;
 	       }
	           
	        switch (Centenas) {
	            case 1: Res_Cen.setText(String.valueOf("Cien")); break;
	            case 2: Res_Cen.setText("Doscientos "); break;
	            case 3: Res_Cen.setText("Trescientos "); break;
	            case 4: Res_Cen.setText("Cuatrocientos "); break;
	            case 5: Res_Cen.setText("Quinientos "); break;
	            case 6: Res_Cen.setText("Seiscientos "); break;
	            case 7: Res_Cen.setText("Setecientos "); break;
	            case 8: Res_Cen.setText("Ochocientos "); break;
	            case 9: Res_Cen.setText("Novecientos "); break;
	            default: Res_Cen.setText(String.valueOf("")); break;
	        }
	        	   
	       switch(Decenas) {       
	       		case 1: Res_Dece.setText(String.valueOf("Diez")); break;
	       		case 2: Res_Dece.setText(String.valueOf("Veinte")); break;
	       		case 3: Res_Dece.setText(String.valueOf("Treinta")); break;
	       		case 4: Res_Dece.setText(String.valueOf("Cuarenta")); break;
	       		case 5: Res_Dece.setText(String.valueOf("Cincuenta")); break;
	       		case 6: Res_Dece.setText(String.valueOf("Sesenta")); break;
	       		case 7: Res_Dece.setText(String.valueOf("Setenta")); break;
	       		case 8: Res_Dece.setText(String.valueOf("Ochenta")); break;
	       		case 9: Res_Dece.setText(String.valueOf("Noventa")); break;
	       		default: Res_Dece.setText(String.valueOf("")); break;
	       		       		
	       }
	          switch(Unidades){         
	          	case 1: Res_Uni.setText(String.valueOf("Uno ")); break;      		        		
	          	case 2: Res_Uni.setText(String.valueOf("Dos ")); break;	          		   		
	          	case 3: Res_Uni.setText(String.valueOf("Tres ")); break;	          		
	          	case 4: Res_Uni.setText(String.valueOf("Cuatro ")); break;	          		         		
	          	case 5: Res_Uni.setText(String.valueOf("Cinco ")); break;	          			          		
	          	case 6: Res_Uni.setText(String.valueOf("Sesis ")); break;	          			          		
	          	case 7: Res_Uni.setText(String.valueOf("Siete ")); break;	          			          		
	          	case 8: Res_Uni.setText(String.valueOf("Ocho ")); break;	          		
	          	case 9:	Res_Uni.setText(String.valueOf("Nueve ")); break; 
	          	default: Res_Uni.setText(String.valueOf("")); break;
	         	          	
	         }
	              	            
	     }
	} 
	public static void main(String[] args) {
	
		NumeroALetra Form = new NumeroALetra();
		Form.setBounds(10, 80, 350, 350);
		Form.setVisible(true);

	}
}