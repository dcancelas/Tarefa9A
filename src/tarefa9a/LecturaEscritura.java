package tarefa9a;

import javafx.collections.ObservableList;

import java.io.*;
import java.util.Scanner;

/**
 * @author dcancelas
 */
public class LecturaEscritura {

    Scanner sc;

    public void novoCliente(Cliente cliente) {
        try {
            PrintWriter escribir = new PrintWriter(Main.nomeFicheiro);
            escribir.println(cliente.getDNI() + ", " + cliente.getNome() + ", " + cliente.getTelefono() + ", " + cliente.getDireccion() + ", " + cliente.getDebeda());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirFicheiro(ObservableList<Cliente> listaClientes) {
        for (Cliente listaCliente : listaClientes) {
            novoCliente(listaCliente);
        }
    }

    public void lerFicheiro(ObservableList<Cliente> listaClientes) {
        try {
            sc = new Scanner(Main.ficheiro);
            listaClientes.remove(0, listaClientes.size());
            while (sc.hasNextLine()) {
                String cadea = sc.nextLine();
                String[] datos = cadea.split(", ");
                listaClientes.add(new Cliente(datos[0], datos[1], datos[2], datos[3], Float.parseFloat(datos[4])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    public void borrarFicheiro() {
        Main.ficheiro.delete();
    }
}
