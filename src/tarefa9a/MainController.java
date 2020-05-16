package tarefa9a;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author dcancelas
 */
public class MainController implements Initializable {
    public TableView<Cliente> tablaCLientes;
    public TableColumn<Cliente, String> dniCL;
    public TableColumn<Cliente, String> nomeCL;
    public TableColumn<Cliente, String> telefonoCL;
    public TableColumn<Cliente, String> direccionCl;
    public TableColumn<Cliente, Float> debedaCL;
    static ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();
    static Stage stageNovoCliente = new Stage();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tablaCLientes.setItems(listaClientes);
        dniCL.setCellValueFactory(new PropertyValueFactory<>("DNI"));
        nomeCL.setCellValueFactory(new PropertyValueFactory<>("nome"));
        telefonoCL.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        direccionCl.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        debedaCL.setCellValueFactory(new PropertyValueFactory<>("debeda"));
        debedaCL.setStyle("-fx-alignment: CENTER-RIGHT;");

        //Clientes de proba
        /*for (int i = 0; i < 30; i++) {
            listaClientes.add(new Cliente("342234", "Nome de proba", "543534", "Dirección de proba", 43444));
        }
        listaClientes.add(new Cliente("1234", "Cliente a atopar", "434535435", "Direccion a atopar", 200000));
        for (int i = 0; i < 10; i++) {
            listaClientes.add(new Cliente("342234", "Nome de proba", "543534", "Dirección de proba", 43444));
        }*/
    }

    public void novoCliente(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NovoCliente.fxml"));
        stageNovoCliente.setTitle("Tarefa9A");
        stageNovoCliente.setScene(new Scene(root, 360, 350));
        stageNovoCliente.setResizable(false);
        stageNovoCliente.show();
    }

    public void buscarCliente(ActionEvent event) {
        String dni = JOptionPane.showInputDialog(null,"Introduzca o DNI do cliente a buscar", "Tarefa9A", JOptionPane.QUESTION_MESSAGE);
        boolean atopado = false;
        for (Cliente listaCliente : listaClientes) {
            if (dni.equals(listaCliente.getDNI())) {
                tablaCLientes.getSelectionModel().select(listaCliente);
                tablaCLientes.scrollTo(listaCliente);
                JOptionPane.showMessageDialog(null, "Cliente atopado!", "Tarefa9A", JOptionPane.INFORMATION_MESSAGE);
                atopado = true;
            }
        }
        if (!atopado && dni != null)
            JOptionPane.showMessageDialog(null, "ERROR: Non se atopou un cliente co DNI introducido", "Tarefa9A", JOptionPane.ERROR_MESSAGE);
    }
}
