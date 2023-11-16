package Jogo_Das_Torres;

public class jogo3 {
        public static void main(String[] args) {
            long numDiscos = 64;
            System.out.println("Total de movimentos: " + moverDiscos(numDiscos, 'A', 'C', 'B'));
        }
    
        static long moverDiscos(long n, char origem, char destino, char auxiliar) {
            return n > 0 ? 2 * moverDiscos(n - 1, origem, auxiliar, destino) + 1 : 0;
        }
}
