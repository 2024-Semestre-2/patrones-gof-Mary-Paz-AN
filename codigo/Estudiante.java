// Creacion de la clase hija Estudiante que herada Persona

public class Estudiante extends Persona {
    // Método de estudiante
    String carnet;

    // Constructor 
    // Se inicializan los atrbutos generales + el carnet
    public Estudiante(String pNombre, String pIdentificacion, int pEdad, String pCarnet) {
        super(pNombre, pIdentificacion, pEdad);
        this.carnet = pCarnet;
    }

    // Método set para carnet
    public void setCarnet(String pCarnet) {
        this.carnet = pCarnet;
    }

    // Se sobreescribe el método toString para añadir la información del carnet
    @Override
    public String toString() {
        String info = "Nombre Completo: " + this.nombre + " "  + "\n";
        info += "Identificación: " + this.identificacion + "\n";
        info += "Edad: " + this.edad + "\n";
        info += "Carnét: " + this.carnet + "\n";
        
        return info;
    }

    // Se sobreescribe el método clonar para añadr el atributo de carnet
    @Override
    public Clon clonar() {
        return new Estudiante(this.nombre, this.identificacion, this.edad, this.carnet);
    }

}