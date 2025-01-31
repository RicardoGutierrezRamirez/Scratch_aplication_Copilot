import java.util.Scanner;

public class CalculadoraJava {

    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public double raizCuadrada(double a) {
        if (a < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }

    
    public static void main(String[] args) {
        CalculadoraJava calculadora = new CalculadoraJava();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

       System.out.println("Suma: " + calculadora.suma(num1, num2));
       System.out.println("Resta: " + calculadora.resta(num1, num2));
       System.out.println("Multiplicación: " + calculadora.multiplicacion(num1, num2));
       System.out.println("División: " + calculadora.division(num1, num2));

       System.out.print("Ingrese un número para calcular la raíz cuadrada: ");
       double num3 = scanner.nextDouble();
        System.out.println("Raíz Cuadrada: " + calculadora.raizCuadrada(num3));

        scanner.close();
    }
}