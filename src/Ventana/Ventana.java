
package Ventana;

//import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame; //Para diseñar cuadros de dialogo, creo
import javax.swing.JLabel; //para etiquetas
import javax.swing.JPanel; //libreria para crear paneles
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
        //colocarEtiquetas();
        //colocarBotones();
        // colocarRadiobotones();
        //colocarCajasdetexto();
        colocarAreasdetexto();
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
        //Boton1, boton de texto
        JButton boton1 = new JButton("Click");
        // boton1.setText("Click");
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true);//habilita o inabilita la interacción con el boton
        boton1.setMnemonic('a');//Establecesmos alt + letra
        boton1.setForeground(Color.RED); //Establece el color de la letra del boton
        boton1.setFont(new Font("cooper black",Font.BOLD/*establece el estilo*/,20));//Establece la fuente de la letra del boton
        panel.add(boton1); //coloco el boton sobre el panel
        
        //boton2 boton de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100,200,100,80);
        //boton2.setOpaque(true);//pos si por defecto el boton no lo permite
        //boton2.setBackground(Color.yellow);//Establece de color de fondo del boton
        ImageIcon boton_2 = new ImageIcon("boton2.jpg");
        boton2.setIcon(new ImageIcon(boton_2.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));// 1 con el ancho del boton 2 con el alto y 3 con el escalado para que no peirda calidad de pixeles
        panel.add(boton2);
    }
    
    
    private void colocarRadiobotones(){
            JRadioButton radioBoton1 = new JRadioButton("Opcion 1",true);//el boleano marca la bolita antes que el usuario lo mire
            radioBoton1.setBounds(50, 100, 100, 50);
            radioBoton1.setEnabled(true);//este metodo deshabilita la opción
            panel.add(radioBoton1);
            
            JRadioButton radioBoton2 = new JRadioButton("Opcion 2",false);
            radioBoton2.setBounds(50, 150, 100, 50);
            panel.add(radioBoton2);
            
            JRadioButton radioBoton3 = new JRadioButton("Opcion 3",false);
            radioBoton3.setBounds(50, 200, 100, 50);
            panel.add(radioBoton3);
            
                ButtonGroup gruporaBotones = new ButtonGroup();//agrupa los botones para que solo se pueda elegir una opción
                gruporaBotones.add(radioBoton1);
                gruporaBotones.add(radioBoton2);
                gruporaBotones.add(radioBoton3); 
                
    }
    
    private void colocarCajasdetexto(){
        JTextField caja = new JTextField();
        caja.setBounds(200,50,100,30);
        caja.setText("Escribe...");
        System.out.println("Texto de la caja"+caja.getText());
        panel.add(caja);
    }
    
    private void colocarAreasdetexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,300,200);
        areaTexto.setText("Escriba el texto aquí...");
        areaTexto.append("\nAñadimos más texto");//Añade más texto
        areaTexto.setEditable(true);//Permite o no que se modifique el texto
        System.out.println("EL texto es: "+areaTexto.getText());
        panel.add(areaTexto);
    }
}
