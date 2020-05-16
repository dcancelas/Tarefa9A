package tarefa9a;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author dcancelas
 */
public class LecturaEscritura {

    String nomeFicheiro = "clientes.dat";

    public void escribirFicheiro(Cliente cliente) {
        try {
            PrintWriter escribir = new PrintWriter(nomeFicheiro);
            escribir.println(cliente.getDNI() + ", " + cliente.getNome() + ", " + cliente.getTelefono() + ", " + cliente.getDireccion() + ", " + cliente.getDebeda());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
