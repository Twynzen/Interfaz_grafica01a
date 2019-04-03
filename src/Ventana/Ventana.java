
package Ventana;

//import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame; //Para diseñar cuadros de dialogo, creo
import javax.swing.JLabel; //para etiquetas
import javax.swing.JPanel; //libreria para crear paneles
import javax.swing.SwingConstants;


public class Ventana extends JFrame{
    public Ventana(){ //Constructor //Se revisa la api para ver bien como funcionan los metodos
        this.setSize(500, 500);//Esto establece el tamaño de la ventana
         setTitle("Titulo de ventana"); // Establrece e titulo de la ventana
        //Metodo para cerrar la ventana y que se termine el programa
         
         
         setLocationRelativeTo(null);//Al usar este por defecto ejecuta la ventana en el centro
         
        //setLocation(700,300);//por medio de plano cartesiano ubica la aparición de la ventana
        
        //setBounds(700,300,500,500);//Establece la posicion de apareicion y el tamaño de la ventana
       
        iniciarComponentes();
        
        //this.getContentPane().setBackground(Color.blue); // color de ventana    

       setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
    
    private void iniciarComponentes(){
        JPanel panel = new JPanel();   //Creacion de un panel
        //panel.setBackground(Color.BLUE); // color del panel
        panel.setLayout(null); //Desactivando el diseño por defecto
        this.getContentPane().add(panel);//Se coloca el panel sobre la ventana
        
        JLabel etiqueta = new JLabel("Hola",SwingConstants.CENTER);//se crea una etiquet
        //etiqueta.setText("HOLA"); //Establecemos el texto de la etiqueta
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // esete se utiliza para enviar el texto con set.text y no llmar el contrctor de Jlabel
        etiqueta.setBounds(10, 10, 100, 50); //Ubico la etiqueta y el tamaño del fondo de la etiqueta
        etiqueta.setForeground(Color.white); //El color del objeto mencionado
        etiqueta.setOpaque(true);//permitimos pintar el fondo del objeto, quita el por defecto
        etiqueta.setBackground(Color.black);//Cambio color del fondo del objet
        etiqueta.setFont(new Font("chiller",Font.ITALIC,30));//Establece la fuente del texto
        panel.add(etiqueta); //Agregamos la etiqueta al panel
        
        
    }
    
}
