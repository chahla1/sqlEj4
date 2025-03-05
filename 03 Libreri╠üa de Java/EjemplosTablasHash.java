import java.util.Hashtable;

public class EjemplosTablasHash {
     
    public static void main(String[] args) {

       System.out.println("Comenzando");

       // TablaHash<Persona, String> miTablaHash = new TablaHash<Persona,String>(3);
       Hashtable<String, Persona> miTablaHash = new Hashtable<String, Persona>();

       // Lo métodos básicos serían
       // Creación: Hashtable<key,value>
       // Inserción: .put(key, value)      Devuelve Persona, no bool
       // Modificación: .put(key, value2)
       // Eliminación: .remove(key)
       // Busqueda: .get(key)

       Persona angel = new Persona("Angel", "de Antonio", "00000000T");

       // if (!miTablaHash.insertar(angel, angel.DNI) )
       miTablaHash.put(angel.DNI, angel);
       
       {
         Persona encontrado = miTablaHash.get(angel.DNI);

         if (encontrado==null)
             System.out.println("Dato no encontrado");
         else
             System.out.println("Se ha encontrado a " + encontrado.nombre + " " + encontrado.apellidos);
       }

       
       Persona angel2 = new Persona("Angel 2", "de Antonio 2", "00000001S");

        if (miTablaHash.put(angel2.DNI, angel2) == null) {

            miTablaHash.remove(angel2.DNI);

            Persona encontrado = miTablaHash.get(angel2.DNI);
        } else {
            System.out.println("Error insertando angel 2");
        }
        if (miTablaHash.get(angel2.DNI) == null) {
            System.out.println("Dato no encontrado");
        }else{
            System.out.println("Se ha encontrado a " + miTablaHash.get(angel2.DNI).nombre + " " + miTablaHash.get(angel2.DNI).apellidos);
       }

       Persona angel3 = new Persona("Angel 3", "de Antonio 3", "00000002R");

       if (!(miTablaHash.put(angel3.DNI, angel3) == null)) {
           System.out.println("Error insertando angel 3");
       }else {
           Persona encontrado = miTablaHash.get(angel3.DNI);
       }
        Persona encontrado = miTablaHash.get(angel3.DNI);
        if (encontrado==null) {
            System.out.println("Dato no encontrado");
        }else{
            System.out.println("Se ha encontrado a " + encontrado.nombre + " " + encontrado.apellidos);
       }

       System.out.println("Finalizando");
   
    }
}


