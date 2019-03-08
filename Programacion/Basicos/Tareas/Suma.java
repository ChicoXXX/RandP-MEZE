import javax.swing.*;
import java.awt.event.*;
public class Suma extends JFrame implements ActionListener{
	
    private JTextField textfield1,textfield2;
    private JLabel Res;
    private JButton boton1;
    public Suma() {
    	super ("Suma");
    	setLayout(null);
    	
        textfield1=new JTextField();
        textfield1.setBounds(10,10,100,30);
        add(textfield1);
        
        textfield2=new JTextField();
        textfield2.setBounds(10,50,100,30);
        add(textfield2);
       
        
        boton1=new JButton("Sumar");
        boton1.setBounds(10,90,100,30);
        add(boton1);
        boton1.addActionListener(this);
        
        Res=new JLabel();
        Res.setBounds(10,130,100,30);
        add(Res);
     
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
    }
  
    public void actionPerformed(ActionEvent h) {
    	
        if (h.getSource()==boton1) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            int suma=x1+x2;

            Res.setText(String.valueOf(suma));
                     
         
        }
    }

    private void Res(String total) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] ar) {
        Suma formulario1=new Suma();
        formulario1.setBounds(10,10,200,250);
        formulario1.setVisible(true);
    }
}




