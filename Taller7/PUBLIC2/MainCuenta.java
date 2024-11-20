package Taller7.PUBLIC2;

public class MainCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("1043972941", 1000.0, "Ahorros");
        
        cuenta1.mostrarDetalles();
        
        cuenta1.setSaldo(-500); // Esto debería mostrar un mensaje de error
        System.out.println("Saldo después de intentar establecer un saldo negativo: " + cuenta1.getSaldo());
        
        // Establecer un saldo válido
        cuenta1.setSaldo(1500);
        System.out.println("Saldo actualizado: " + cuenta1.getSaldo());
    }
}