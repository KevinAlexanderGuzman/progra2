package progra2022;

import java.util.Random;
import javax.swing.JOptionPane;
public class Passwords {

  public void Password(){
        final String cadena="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
      
        final int longitud =10;
        StringBuilder sb =new StringBuilder();
      
         for(int i =0;i<longitud;i++){
            double aleatorio=Math.random()*cadena.length();
            int posicion= (int)aleatorio;
            char letra= cadena.charAt(posicion);
            sb.append(letra);
            System.out.println("Contraseña: "+sb.toString());
            
                
            }
            
       }   
        }
        
   
     
      
   
  
   
   
 
      
      
   
   



    

    

    
        
   

