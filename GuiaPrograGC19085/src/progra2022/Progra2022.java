
package progra2022;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Progra2022 {

    public static void main(String[] args) {
     int opcion;
     opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Ejemplo 1\n2.Ejemplo 2 "));
     if(opcion==1){
     Persona persona1= new Persona ("Kevin Guzman",20,'M');
     persona1.reg(); 
    
     Persona persona2=new Persona ("Ana Estacia",25,'F');
     persona2.reg(); 
     
     Persona persona3= new Persona ("Mauricio Funes",17,'M');
     persona3.reg(); 
     }
     else {
    Passwords n1 = new Passwords();
    n1.Password();
          
        
}
     }
    }

    


