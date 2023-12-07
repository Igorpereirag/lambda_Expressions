// Definindo uma interface funcional para representar a operação de soma
interface Operacao {
    int calcular(int a, int b);
}

public class ExemploLambda1 {
    public static void main(String[] args) {
        // Usando uma expressão lambda para implementar a interface funcional
        Operacao soma = (a, b) -> a + b;
        
        // Chamando a função lambda
        int resultado = soma.calcular(3, 5);
        System.out.println("Resultado da soma: " + resultado);
    }
}
