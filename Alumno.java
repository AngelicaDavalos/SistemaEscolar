public class Alumno {
    //Atributos
    private String nombre;
    private String matricula;
    private double calif1;
    private double calif2;
    private double calif3;



    public Alumno(String nombre, String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
    }
 




    public void setCalificaciones(double calif1, double calif2, double calif3){
        this.calif1 = calif1;
        this.calif2 = calif2;
        this.calif3 = calif3;
    }


    public double calcularPromedio(){
        return (calif1 + calif2 + calif3) / 3;
    }

    
    public void mostrarAlumno(){
        System.out.println("El alumno es: " +this.nombre);
        System.out.println("La matricula es: " +this.matricula);
        System.out.println("El promedio es: " +calcularPromedio());
    }

    public String getMatricula(){
        return this.matricula;
    }
}