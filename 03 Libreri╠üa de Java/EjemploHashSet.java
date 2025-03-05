import java.util.HashSet;

public class EjemploHashSet {
     
    public static void main(String[] args) {

       System.out.println("Comenzando");

       // TablaHash<Persona, String> miTablaHash = new TablaHash<Persona,String>(3);
       HashSet<Persona> miTablaHash = new HashSet<Persona>();

       Persona angel = new Persona("Angel", "de Antonio", "00000000T");

       // if (!miTablaHash.insertar(angel, angel.DNI) )
       boolean res = miTablaHash.add(angel);
       
       {
         if (miTablaHash.contains(angel))
             System.out.println("Se ha encontrado");
        else
            System.out.println("No se ha encontrado");
       }

       Persona angel2 = new Persona("Angel", "de Antonio", "00000000T");
       res = miTablaHash.add(angel2);
       res = miTablaHash.add(angel2);

 
       /*
       Persona angel2 = new Persona("Angel 2", "de Antonio 2", "00000001S");

       if (!miTablaHash.insertar(angel2, angel2.DNI) )
         System.out.println("Error insertando angel 2");
       else {

        miTablaHash.borrar(angel2.DNI);

        Persona encontrado = miTablaHash.buscar(angel2.DNI);

        if (encontrado==null)
            System.out.println("Dato no encontrado");
        else
            System.out.println("Se ha encontrado a " + encontrado.nombre + " " + encontrado.apellidos);
       }

       Persona angel3 = new Persona("Angel 3", "de Antonio 3", "00000002R");

       if (!miTablaHash.insertar(angel3, angel3.DNI) )
         System.out.println("Error insertando angel 3");
       else {
        Persona encontrado = miTablaHash.buscar(angel3.DNI);

        if (encontrado==null)
            System.out.println("Dato no encontrado");
        else
            System.out.println("Se ha encontrado a " + encontrado.nombre + " " + encontrado.apellidos);
       }
*/
       System.out.println("Finalizando");
   
    }
}


