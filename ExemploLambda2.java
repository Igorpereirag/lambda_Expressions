// Definindo uma interface funcional para representar a verificação de paridade
interface VerificadorPar {
    boolean verificar(int numero);
}

public class ExemploLambda2 {
    public static void main(String[] args) {
        // Usando uma expressão lambda para implementar a interface funcional
        VerificadorPar paridade = numero -> numero % 2 == 0;
        
        // Chamando a função lambda
        boolean resultado = paridade.verificar(4);
        System.out.println("É par? " + resultado);
    }
}
