// Creación de la superclase Persona que implementa la interfaz Clon
// Esta clase representa a una persona con atributos básicos como nombre, apellidos, identificación y edad.

public class Persona implements Clon {
    // Atributos de la clase
    String nombre;               
    String identificacion;      
    int edad;                  

    // Constructor de la clase que inicializa todos los atributos
    public Persona(String pNombre, String pIdentificacion, int pEdad) {
        this.nombre = pNombre;
        this.identificacion = pIdentificacion;
        this.edad = pEdad;
    }

    // Métodos set para todos los atributos
    // Método para establecer el nombre de la persona
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    // Método para establecer la identificación de la persona
    public void setIdentificacion(String pIdentificacion) {
        this.identificacion = pIdentificacion;
    }

    // Método para establecer la edad de la persona
    public void setEdad(int pEdad) {
        this.edad = pEdad;
    }

    // Método toString 
    // Muestra la información del objeto
    public String toString() {
        String info = "Nombre Completo: " + this.nombre + " " + "\n";
        info += "Identificación: " + this.identificacion + "\n";
        info += "Edad: " + this.edad + "\n";
        
        return info;
    }

    // Método clonar 
    // Crea y devuelve una copia del objeto actual
    @Override
    public Clon clonar() {
        // Se utiliza el operador new para crear una nueva instancia de Persona
        // Se pasan los atributos actuales al constructor para inicializar la copia
        return new Persona(this.nombre, this.identificacion, this.edad);
    }
}
