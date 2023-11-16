package Jogo_Das_Torres;
import java.util.concurrent.TimeUnit;

public class Jogo {
    
    public static long numMovimentos = 0;

    public static void main(String[] args) {
        int numDiscos = 20;  
        long startTime = System.currentTimeMillis();
        torreDeHanoi(numDiscos, 'A', 'C', 'B');
        long endTime = System.currentTimeMillis();
        long totalTimeInMillis = endTime - startTime;
        long hours = TimeUnit.MILLISECONDS.toHours(totalTimeInMillis);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(totalTimeInMillis) % 60;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(totalTimeInMillis) % 60;
        long millis = totalTimeInMillis % 1000;

        System.out.println("Tempo de execução: " + hours + "h " + minutes + "m " + seconds + "s " + millis + "ms");
        System.out.println("Número de movimentos: " + numMovimentos);
    }

    public static void torreDeHanoi(long n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            numMovimentos++;
            return;
        }
        torreDeHanoi(n - 1, origem, auxiliar, destino);
        // Removida a impressão de cada movimento individual
        numMovimentos++;
        torreDeHanoi(n - 1, auxiliar, destino, origem);
    }
}