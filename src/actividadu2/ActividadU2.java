/*
 * Actividad Obligatoria de la Unidad 2 de java POO del curso java Fullstack:
Crear un programa en java en el cual se pida al usuario ingresar su nombre, apellido, edad, hobbie, editor de código preferido, sistema operativo que utiliza, luego deberá mostrarse por consola los datos ingresados.
El programa deber ser subido a un repositorio de GitHub, pegar el link del ejercicio resuelto en el siguiente recuadro
 */

package actividadu2;


public class ActividadU2 {


    public static void main(String[] args) {
        usuario User1=new usuario(); 
        User1.pedirDatos();
        User1.mostrarDatos();
      
    }
}
