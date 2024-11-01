public class Main {
    public static void main(String[] args) {
        // Creación del un estudiante (original)
        Estudiante estudianteOriginal = new Estudiante("Mary Paz Alvarez Navarrete", "12345678", 19, "2023138604");

        // Creación de un funcionario (original)
        Funcionario funcionarioOriginal = new Funcionario("Katherine Rodriguez Amador", "23456789", 26, "Profesora");

        // Clonar al estudiante (Prototype)
        // Se hace un casting porque clonar devuleve un tipo Clon pero tiene que devolver un tipo Estudiante
        Estudiante clonEstudiante = (Estudiante) estudianteOriginal.clonar();

        // Clonar al funcionar (Prototype)
        Funcionario clonFuncionario = (Funcionario) funcionarioOriginal.clonar();

        // Cambiar datos de nombre, identificacion y carnet
        clonEstudiante.setNombre("Kristel Barrantes Garcia");
        clonEstudiante.setIdentificacion("45678927");
        clonEstudiante.setCarnet("2023458974");

        // Cambiar datos de nombre, identificacion y cargo
        clonFuncionario.setNombre("Michael Valladarez Hidalgo");
        clonFuncionario.setIdentificacion("3125723892");
        clonFuncionario.setCargo("Secretario");

        // Mostrar estudiante original
        System.out.println("Estudiante Original");
        System.out.println(estudianteOriginal.toString());
        System.out.println("\n");

        // Mostrar estudiante clonado
        System.out.println("Estudiante Clonado");
        System.out.println(clonEstudiante.toString());
        System.out.println("\n");

        // Mostrar funcionario original
        System.out.println("Funcionario Original");
        System.out.println(funcionarioOriginal.toString());
        System.out.println("\n");

        // Mostrar funcionario clonado
        System.out.println("Funcionario Clonado");
        System.out.println(clonFuncionario.toString());
        System.out.println("\n");
    }
}

