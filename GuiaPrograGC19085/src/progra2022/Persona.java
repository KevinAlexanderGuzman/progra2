
package progra2022;
import javax.swing.JOptionPane;
import java.util.Random;
public class Persona {
    public String nombre;
     private String dui;
   private int edad;
     private char sexo;
     private Double peso;
     private Double altura;
     public Double IMC ;
     

    public Persona(String nombre,int edad, char sexo) {
        
        this.nombre = nombre;   
        this.sexo = sexo;
        this.edad=edad;
      
    }
     public void reg () {
            JOptionPane.showMessageDialog(null,"Registro Persona\nNombre: "+this.nombre+"\nEdad: "+this.edad+"\nSexo: "+this.sexo);
           if(edad>=18){
          JOptionPane.showMessageDialog(null,"La persona es mayor de edad.");
     }else{
              JOptionPane.showMessageDialog(null,"La persona es menor de edad.");
             }
            altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura (m)"));
        peso=Double.parseDouble(JOptionPane.showInputDialog("ingrese el peso (kg)"));
        double nuevaalt= altura*altura;
        IMC= peso/nuevaalt;
        if (IMC<20){
             JOptionPane.showMessageDialog(null,"La persona posee desnutricion");
        }else if (IMC>20&&IMC<25){
             JOptionPane.showMessageDialog(null,"El Indice de masa corporal es correcto");
        }else{
             JOptionPane.showMessageDialog(null,"La persona posee sobrepeso.");
        }      
     }
    }


  
         
         
         

    

     
        

