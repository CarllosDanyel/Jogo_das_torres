package Jogo_Das_Torres;

public class jogo2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long numDiscos = 20; 
        moverDiscos(numDiscos, 'A', 'C', 'B');

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        exibirTempo(totalTime);
    }

    static void moverDiscos(long n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco de " + origem + " para " + destino);
            return;
        }
        moverDiscos(n - 1, origem, auxiliar, destino);
        System.out.println("Mover disco de " + origem + " para " + destino);
        moverDiscos(n - 1, auxiliar, destino, origem);
    }

    static void exibirTempo(long millis) {
        long milissegundos = millis % 1000;
        long segundos = (millis / 1000) % 60;
        long minutos = (millis / (1000 * 60)) % 60;
        long horas = (millis / (1000 * 60 * 60));
        System.out.println("\nTempo total de execução: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos, " + milissegundos + " milissegundos.");
    }
}