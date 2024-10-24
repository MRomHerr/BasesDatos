package Persona;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Main {
    static String BDPer = "DBPersonas.yap";

    public static void main(String[] args) {
        // Abrir la conexión a la base de datos Db4o
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDPer);

        // Se crean objetos Persona
        Persona p1 = new Persona("Juan", "Guadalajara");
        Persona p2 = new Persona("Luis", "Granada");
        Persona p3 = new Persona("Ana", "Madrid");
        Persona p4 = new Persona("Pedro", "Asturias");

        // Almacenar objetos Persona en la base de datos
        db.store(p1);
        db.store(p2);
        db.store(p3);
        db.store(p4);

        // Cerrar la base de datos
        db.close();
    } // Fin del método main
} // Fin de la clase Main
