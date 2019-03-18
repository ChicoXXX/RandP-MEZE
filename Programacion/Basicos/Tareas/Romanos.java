
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Romanos extends JFrame implements ActionListener {
	
	public JTextField Texto;
	public JLabel Ingresar, Ingresar2, Res, Mostrar, Res_Uni, Res_Dece, Res_Cen, Res_Mill;
	public JButton Boton;
	
	public Romanos(){
		super ("Números Decimales a Números Romanos");
		setLayout(null);
		
		Ingresar2 = new JLabel("Ingresa el Número");
		Ingresar2.setBounds(100,10,150,30);
		add(Ingresar2);
		
		Texto = new JTextField();
		Texto.setBounds(100,40,100,30);
		add(Texto);
		
		Ingresar = new JLabel();
		Ingresar.setBounds(100,80,100,30);
		add(Ingresar);
		
		Boton = new JButton("Conversión");
		Boton.setBounds(100,90,100,30);
		add(Boton);
		Boton.addActionListener(this); //<- Siempre ponerlo xd 
		
		Mostrar = new JLabel("Tu resultado es: ");
		Mostrar.setBounds(100, 120,100,30);
		add(Mostrar);
		
		Res_Uni = new JLabel();
		Res_Uni.setBounds(190, 150,100,30);
		add(Res_Uni);
		
		Res_Dece = new JLabel();
		Res_Dece.setBounds(160, 150,100,30);
		add(Res_Dece);
		
		Res_Cen = new JLabel();
		Res_Cen.setBounds(130, 150,100,30);
		add(Res_Cen);
		
		Res_Mill = new JLabel();
		Res_Mill.setBounds(100, 150,100,30);
		add(Res_Mill);
		
	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent f) {
		  if (f.getSource()==Boton) {
			  
	          String Decimal=Texto.getText();
	         
	          int Conver=Integer.parseInt(Decimal);	         
	          int  Millares, Centenas, Decenas, Unidades;
	       
  
		        //Unidades
			      Unidades=Conver%10;  Conver/=10; //3614 > U4 >361    		     
				//Decenas
			      Decenas= Conver%10; Conver/=10;  //361 >D1 >36			      
				//Centenas 
				  Centenas=Conver%10;  Conver/=10;//36 > C6 >3				  
				//Millares
		          Millares=Conver%10; Conver/=10;//3 > (M3) >0
		          
		      	          
		       switch(Millares) {
		       		case 1: Res_Mill.setText(String.valueOf("M")) ; break;
		       		case 2: Res_Mill.setText(String.valueOf("MM")) ; break;
		       		case 3: Res_Mill.setText(String.valueOf("MMM")) ; break;
		       		default :  Res_Mill.setText(String.valueOf("")) ; break;
		       }
		  
		         
		        switch (Centenas) {
		    		case 1: Res_Cen.setText(String.valueOf("C")); break;
		   		case 2: Res_Cen.setText(String.valueOf("CC")); break;
		   		case 3: Res_Cen.setText(String.valueOf("CCC")); break;
                   		case 4 :Res_Cen.setText(String.valueOf("CD")); break;
                   		case 5 :Res_Cen.setText(String.valueOf("D")); break;
                    		case 6 :Res_Cen.setText(String.valueOf("DI")); break;
                    		case 7 :Res_Cen.setText(String.valueOf("DII")); break;
                   		case 8 :Res_Cen.setText(String.valueOf("DIII")); break;
                    		case 9 :Res_Cen.setText(String.valueOf("CM")); break;
                   	 	default :Res_Cen.setText(String.valueOf("")); break;      

		        }
		           
		       switch(Decenas) {
		       		case 1: Res_Dece.setText(String.valueOf("X")); break;
		       		case 2: Res_Dece.setText(String.valueOf("XX")); break;
		       		case 3: Res_Dece.setText(String.valueOf("XXX")); break;
		       		case 4: Res_Dece.setText(String.valueOf("XL")); break;
		       		case 5: Res_Dece.setText(String.valueOf("L")); break;
		       		case 6: Res_Dece.setText(String.valueOf("XL")); break;
		       		case 7: Res_Dece.setText(String.valueOf("XLL")); break;
		       		case 8: Res_Dece.setText(String.valueOf("XLLL")); break;
		       		case 9: Res_Dece.setText(String.valueOf("XC")); break;
		       		default: Res_Dece.setText(String.valueOf("")); break;
		       				       		
		       }
		          switch(Unidades){         
		          	case 1: Res_Uni.setText(String.valueOf("I")); break;      		        		
		          	case 2: Res_Uni.setText(String.valueOf("II")); break;	          		   		
		          	case 3: Res_Uni.setText(String.valueOf("III")); break;	          		
		          	case 4: Res_Uni.setText(String.valueOf("IV")); break;	          		         		
		          	case 5: Res_Uni.setText(String.valueOf("V")); break;	          			          		
		          	case 6: Res_Uni.setText(String.valueOf("VI")); break;	          			          		
		          	case 7: Res_Uni.setText(String.valueOf("VII")); break;	          			          		
		          	case 8: Res_Uni.setText(String.valueOf("VIII")); break;	          		
		          	case 9:	Res_Uni.setText(String.valueOf("IX")); break; 
		          	default: Res_Uni.setText(String.valueOf("")); break;		         	
		          	
		         }
		              	            
		     }
	}
	public static void main(String[] args) {
	
		Romanos Form = new Romanos();
		Form.setBounds(10, 80, 350, 250);
		Form.setVisible(true);

	}
}

