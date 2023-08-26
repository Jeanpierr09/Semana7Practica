package pkgAlumnos;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;

    private String carnet;

    private String direccion;

    public double getTotalCursos() {
        double total = 0;
        for (Curso curso : this.cursos) {
            total += curso.getCosto();
        }
        return total;
    }
    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }
    public Alumno (String nombre, String carnet, String direccion, String telefono) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cursos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    private String telefono;

    private List<Curso> cursos;


}