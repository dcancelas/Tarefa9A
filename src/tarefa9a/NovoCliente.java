package tarefa9a;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

/**
 * @author dcancelas
 */
public class NovoCliente {
    public TextField dniField;
    public TextField nomeField;
    public TextField telfField;
    public TextField direcField;
    public TextField debedaField;
    LecturaEscritura lecturaEscritura = new LecturaEscritura();

    public void novoCliente(ActionEvent event) {
        //MainController.listaClientes.add(new Cliente(dniField.getText(), nomeField.getText(), telfField.getText(), direcField.getText(), Float.parseFloat(debedaField.getText())));
        lecturaEscritura.novoCliente(new Cliente(dniField.getText(), nomeField.getText(), telfField.getText(), direcField.getText(), Float.parseFloat(debedaField.getText())));
        MainController.stageNovoCliente.close();
    }
}
