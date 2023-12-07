// Definindo uma interface funcional sem parâmetros
interface Mensagem {
    void imprimir();
}

public class ExemploLambda3 {
    public static void main(String[] args) {
        // Usando uma expressão lambda para implementar a interface funcional
        Mensagem mensagem = () -> System.out.println("Olá, mundo!");
        
        // Chamando a função lambda
        mensagem.imprimir();
    }
}
