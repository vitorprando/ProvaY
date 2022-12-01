import java.util.Scanner;

public class Fib {
    static long tempoInicial;
    static long tempoFinal;

    public static double fibIterativo(double n) {
        if(n <= 2) {
            return 1;
        } else {
            tempoInicial = System.nanoTime();
            int fib = 1;
            int prevFib = 1;
            for(int i=2; i<n; i++) {
                int temp = fib;
                fib+= prevFib;
                prevFib = temp;
            }
            tempoFinal = System.nanoTime() - tempoInicial;
            return fib;
        }
    }

    public static double recursivo(double n) {
        if(n <= 1) {
            return n;
        }
        return fibRecursivo(n-1) + fibRecursivo(n-2);
    }

    public static double fibRecursivo(double n) {
        if(n <= 1) {
            return n;
        }
        tempoInicial = System.nanoTime();
        double resultado = recursivo(n);
        tempoFinal = System.nanoTime() - tempoInicial;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        double n = sc.nextDouble();

        System.out.println("Iterativo:");
        System.out.println(fibIterativo(n));
        System.out.println("Tempo de execução:");
        System.out.println(tempoFinal + " nanossegundos");

        System.out.println("Recursivo:");
        System.out.println(fibRecursivo(n));
        System.out.println("Tempo de execução:");
        System.out.println(tempoFinal + " nanossegundos");
    }
}