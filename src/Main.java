import pkgAlumnos.Alumno;
import pkgAlumnos.Curso;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", "0905", "San Salvador", "2222-2222" );
        Alumno alumno2 = new Alumno("Mynor Quiñonez", "0906", "Zapotitlan", "2222-2222" );
        Alumno alumno3 = new Alumno("Carlos Chinchilla", "0905", "EL progreso", "2222-2222" );

        Curso cur= new Curso("001", "Programacion I", 100);
        Curso cur2= new Curso("002", "Base de Datos", 100);
        Curso cur3= new Curso("003", "Programacion Orientada a Objetos", 100);
        Curso cur4= new Curso("004", "Programacion Web", 100);

        alumno1.agregarCurso(cur);
        alumno1.agregarCurso(cur2);
        alumno1.agregarCurso(cur3);
        alumno2.agregarCurso(cur);
        alumno2.agregarCurso(cur2);
        alumno2.agregarCurso(cur3);
        alumno2.agregarCurso(cur4);
        alumno3.agregarCurso(cur);
        alumno3.agregarCurso(cur2);
        alumno3.agregarCurso(cur3);

        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Carnet: " + alumno1.getCarnet());


        for(Curso curso : alumno1.getCursos()) {

            System.out.println("Codigo: " + curso.getCodigo());
            System.out.println("Nombre: " + curso.getNombre());
            System.out.println("Costo: " + curso.getCosto());


        }
        System.out.println("Total: " + alumno1.getTotalCursos());

        System.out.println("Nombre: " + alumno2.getNombre());
        System.out.println("Carnet: " + alumno2.getCarnet());

        for (Curso curso : alumno2.getCursos()) {

            System.out.println("Codigo: " + curso.getCodigo());
            System.out.println("Nombre: " + curso.getNombre());
            System.out.println("Costo: " + curso.getCosto());

        }
        System.out.println("Total: " + alumno2.getTotalCursos());



    }}