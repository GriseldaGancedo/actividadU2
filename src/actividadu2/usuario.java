/*clase usuario, el main está en actividadU2
 */
package actividadu2;

import javax.swing.JOptionPane;
public class usuario {
    public String nombre; 
    public String apellido; 
    public String edad; // lo pongo como String para evitar el parseo de JOptionPane
    public String hobbie;
    public String editor; 
    public String sistemaOperativo;
    
    // constrictores
    public usuario (){
        
    }
    public usuario(String nombre, String apellido, String edad, String hobbie, String editor, String sistemaOperativo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.hobbie=hobbie; 
        this.editor=editor; 
        this.sistemaOperativo=sistemaOperativo;
    }
    
    //metodos:
    
    public void pedirDatos(){
        this.nombre =JOptionPane.showInputDialog("Ingrese su nombre: "); 
        this.apellido =JOptionPane.showInputDialog("Ingrese su apellido: "); 
        this.edad =JOptionPane.showInputDialog("Ingrese su edad: "); 
   //int edad=Integer.parseInt(edadString);// para mostrar la info no necesito que sea un int, lo dejo String
        this.hobbie =JOptionPane.showInputDialog("Ingrese su hobbie: "); 
        this.editor =JOptionPane.showInputDialog("Ingrese su editor de código preferido: "); 
        this.sistemaOperativo =JOptionPane.showInputDialog("Ingrese su sistemaOperativo: "); 
  
    }
    public void mostrarDatos(){
        System.out.println("Los datos son: Nombre: "+nombre +
                " Apellido: "+apellido+
                " Edad: "+edad+
                " Hobbie "+hobbie+
                " Editor de Código preferido: "+editor+
                " Sistema Operativo: "+sistemaOperativo);
    }
    
}
