// Creacion de la clase hija Funcionario que herada Persona

public class Funcionario extends Persona {
    // Método de estudiante
    String cargo;

    // Constructor 
    // Se inicializan los atrbutos generales + el cargo
    public Funcionario(String pNombre, String pIdentificacion, int pEdad, String pCargo) {
        super(pNombre, pIdentificacion, pEdad);
        this.cargo = pCargo;
    }

    // Método set para cargo
    public void setCargo(String pCargo) {
        this.cargo = pCargo;
    }

    // Se sobreescribe el método toString para añadir la información del cargo
    @Override
    public String toString() {
        String info = "Nombre Completo: " + this.nombre + " " + "\n";
        info += "Identificación: " + this.identificacion + "\n";
        info += "Edad: " + this.edad + "\n";
        info += "Cargo: " + this.cargo + "\n";
        
        return info;
    }

    // Se sobreescribe el método clonar para añadr el atributo de cargo
    @Override
    public Clon clonar() {
        return new Funcionario(nombre, this.identificacion, this.edad, this.cargo);
    }

}