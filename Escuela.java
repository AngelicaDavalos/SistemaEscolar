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

    
}

    

