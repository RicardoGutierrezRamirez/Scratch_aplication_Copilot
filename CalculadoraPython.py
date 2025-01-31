import math

class CalculadoraPython:

    def suma(self, a, b):
        return a + b

    def resta(self, a, b):
        return a - b

    def multiplicacion(self, a, b):
        return a * b

    def division(self, a, b):
        if b == 0:
            raise ArithmeticError("No se puede dividir por cero")
        return a / b

    def raiz_cuadrada(self, a):
        if a < 0:
            raise ArithmeticError("No se puede calcular la raíz cuadrada de un número negativo")
        return math.sqrt(a)

if __name__ == "__main__":
    calculadora = CalculadoraPython()

    num1 = float(input("Ingrese el primer número: "))
    num2 = float(input("Ingrese el segundo número: "))

    print("Suma:", calculadora.suma(num1, num2))
    print("Resta:", calculadora.resta(num1, num2))
    print("Multiplicación:", calculadora.multiplicacion(num1, num2))
    print("División:", calculadora.division(num1, num2))

    num3 = float(input("Ingrese un número para calcular la raíz cuadrada: "))
    print("Raíz Cuadrada:", calculadora.raiz_cuadrada(num3))