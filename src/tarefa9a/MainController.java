package tarefa9a;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author dcancelas
 */
public class MainController implements Initializable {
    public HBox hbox;
    public VBox vbox;
    public TableView<Cliente> tablaCLientes;
    public TableColumn<Cliente, String> dniCL;
    public TableColumn<Cliente, String> nomeCL;
    public TableColumn<Cliente, String> telefonoCL;
    public TableColumn<Cliente, String> direccionCl;
    public TableColumn<Cliente, Float> debedaCL;
    ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tablaCLientes.setItems(listaClientes);
        dniCL.setCellValueFactory(new PropertyValueFactory<>("DNI"));
        nomeCL.setCellValueFactory(new PropertyValueFactory<>("nome"));
        telefonoCL.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        direccionCl.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        debedaCL.setCellValueFactory(new PropertyValueFactory<>("debeda"));
        debedaCL.setStyle("-fx-alignment: CENTER-RIGHT;");

        listaClientes.add(new Cliente("54233422C", "Daniel", "620534053", "Av. da Xunqueira 27, Moaña", 200000));
    }
}
