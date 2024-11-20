package Taller7.PUBLIC1;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Acevedo", 50000);
        
        System.out.println("Nombre: " + empleado1.nombre);
        
        System.out.println("Salario: " + empleado1.getSalario());
        
        empleado1.setSalario(-1000); 
        System.out.println("Salario después de intentar establecer un salario negativo: " + empleado1.getSalario());
    }
}
