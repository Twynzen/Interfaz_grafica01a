
package Ventana;

//import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame; //Para diseñar cuadros de dialogo, creo
import javax.swing.JLabel; //para etiquetas
import javax.swing.JPanel; //libreria para crear paneles
import javax.swing.SwingConstants;


public class Ventana extends JFrame{
    public JPanel panel;
    
    
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
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        
    }
    
    private void colocarPaneles(){
        panel = new JPanel();   //Creacion de un panel
        //panel.setBackground(Color.BLUE); // color del panel
        panel.setLayout(null); //Desactivando el diseño por defecto
        this.getContentPane().add(panel);//Se coloca el panel sobre la ventana
         
    }
    
    private void colocarEtiquetas(){
        //Etiqueta 1 tipo texto
        JLabel etiqueta = new JLabel("Tituto de ventana",SwingConstants.CENTER);//se crea una etiquet
        //etiqueta.setText("HOLA"); //Establecemos el texto de la etiqueta
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // esete se utiliza para enviar el texto con set.text y no llmar el contrctor de Jlabel
        etiqueta.setBounds(-15, 10, 500, 50); //Ubico la etiqueta y el tamaño del fondo de la etiqueta
        etiqueta.setForeground(Color.BLACK); //El color del objeto mencionado
        //etiqueta.setOpaque(true);//permitimos pintar el fondo del objeto, quita el por defecto
        //etiqueta.setBackground(Color.black);//Cambio color del fondo del objet
        etiqueta.setFont(new Font("cooper black",0,50));//Establece la fuente del texto
        panel.add(etiqueta); //Agregamos la etiqueta al panel
        
        //Etiqueta 2 tipo imagen
        ImageIcon imagen = new ImageIcon("400x300img1.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(80, 90, 400, 300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));//Adecua el tamaño de la imagen al de la etiqueta
        panel.add(etiqueta2);
    }
    
    private void colocarBotones(){
        JButton boton1 = new JButton("Click");
        // boton1.setText("Click");
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true);//habilita o inabilita la interacción con el boton
        boton1.setMnemonic('a');//Establecesmos alt + letra
        boton1.setForeground(Color.RED); //Establece el color de la letra del boton
        boton1.setFont(new Font("cooper black",Font.BOLD/*establece el estilo*/,20));//Establece la fuente de la letra del boton
        panel.add(boton1);
        
    }
}
