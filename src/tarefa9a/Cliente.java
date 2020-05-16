package tarefa9a;

/**
 * @author dcancelas
 */
public class Cliente {

    private String DNI;
    private String nome;
    private String telefono;
    private String direccion;
    private float debeda;

    public Cliente() {
    }
    public Cliente(String DNI, String nome, String telefono, String direccion, float debeda) {
        this.DNI = DNI;
        this.nome = nome;
        this.telefono = telefono;
        this.direccion = direccion;
        this.debeda = debeda;
    }

    public String getDNI() {
        return DNI;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public float getDebeda() {
        return debeda;
    }
}
