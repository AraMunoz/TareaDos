
package ejerciciocalculadora;
import java.util.*;
public class Ejerciciocalculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double valorUno, valorDos;
        System.out.println("Ingresa el valor uno");
        valorUno=leer.nextDouble();
        System.out.println("Ingresa el valor dos");
        valorDos=leer.nextDouble();
        Calculadora calculadora = new Calculadora(valorUno, valorDos);
        
    }
    
    
}
