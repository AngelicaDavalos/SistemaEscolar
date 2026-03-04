public class Escuela {
    
    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;

    private int contador = 0;

    // Agregar alumno
    public void agregarAlumno(Alumno alumno) {

        if (contador == 0) {
            alumno1 = alumno;
        } else if (contador == 1) {
            alumno2 = alumno;
        } else if (contador == 2) {
            alumno3 = alumno;
        } else if (contador == 3) {
            alumno4 = alumno;
        } else if (contador == 4) {
            alumno5 = alumno;
        } else {
            System.out.println("No se pueden agregar más alumnos.");
            return;
        }

        contador++;
        System.out.println("Alumno agregado correctamente.");
    }

    // Mostrar alumnos
    public void mostrarAlumnos() {

        if (alumno1 != null) alumno1.mostrarAlumno();
        if (alumno2 != null) alumno2.mostrarAlumno();
        if (alumno3 != null) alumno3.mostrarAlumno();
        if (alumno4 != null) alumno4.mostrarAlumno();
        if (alumno5 != null) alumno5.mostrarAlumno();
    }

    // Buscar alumno por matrícula //es una variable dela clase alumno 
    
    public void buscarAlumno(int matricula) {

        if (alumno1 != null && alumno1.getMatricula() == matricula) {
            alumno1.mostrarAlumno();
            return;
        }
        if (alumno2 != null && alumno2.getMatricula() == matricula) {
            alumno2.mostrarAlumno();
            return;
        }
        if (alumno3 != null && alumno3.getMatricula() == matricula) {
            alumno3.mostrarAlumno();
            return;
        }
        if (alumno4 != null && alumno4.getMaticula() == matricula) {
            alumno4.mostrarAlumno();
            return;
        }
        if (alumno5 != null && alumno5.getMatricula() == matricula) {
            alumno5.mostrarAlumno();
            return;
        }

        System.out.println("Alumno no encontrado.");
    }
}

    

