import java.util.ArrayList;
import java.util.List; public class Universidad {
    private String nombre;
    private List<Departamentos> departamentos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamentos departamento) {
        departamentos.add(departamento);
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getDepartamentos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}