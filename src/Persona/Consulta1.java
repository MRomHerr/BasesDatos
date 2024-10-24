package Persona;

import com.db40.Db40Embedded;
import com.db40.ObjectContainer;
import com.db40.ObjectSet;

public class Consulta1 {
    static String BDPer = "DBPersonas.yap"; // Corrected assignment operator

    public static void main(String[] args) {
        // Open database connection
        ObjectContainer db = Db40Embedded.openFile(Db40Embedded.newConfiguration(), BDPer);

        // Create a new Persona object with null values
        Persona per = new Persona(null, null); // Corrected object instantiation

        // Query the database for matching Persona objects
        ObjectSet<Persona> result = db.queryByExample(per); // Corrected method call

        // Check if any results were found
        if (result.size() == 0) {
            System.out.println("No existen Registros de Personas..");
        } else {
            System.out.printf("Número de registros: %d\n", result.size()); // Corrected printf format

            // Iterate through the results and print each Persona's details
            while (result.hasNext()) {
                Persona p = result.next(); // Corrected object retrieval
                System.out.printf("Nombre: %s, Ciudad: %s\n", p.getNombre(), p.getCiudad()); // Corrected method calls
            }
        }

        // Close the database connection
        db.close(); // Cerrar base de datos
    } // main
} // fin Consultal
