import java.util.Scanner;

public class Fib {
    static long loops;

    public static double fibIterativo(double n) {
        // Nesse caso se nosso valor n que vai ser o valor passado pelo o usuario for igual a 2 ou menor ele vai retorna so 1 que seria seu valor
        if(n <= 2) {
            return 1;
        }else{
            loops = 0;
            //Aqui so ira executar se N for maior que 2, pos ate dois o fibonacci é 1
            int fib = 1;//Variavel que armazena o primeiro valor do fib, que depois ira ser alterado para, para ir somando
            int prevFib = 1; //  variavel que sera usada para adicionar no fib para fazer ele ir subindo, ele pega o fib e adiciona sobre o valor antigo a soma do antigo com o novo
            for(int i=2; i<n; i++) {
                loops++;
                int temp = fib; // Variavel que pega o novo fib e adiciona no final sobre o antigo no final
                fib+= prevFib; //Aqui faz a parte de pega o antigo e somar com o novo;
                prevFib = temp; //Aqui que adiciona
            }
            return fib;
        }
    }

    public static double fibRecursivo(double n) {
        if(n <= 1) {
            return n;
        }
        return fibRecursivo(n-1) + fibRecursivo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        double n = sc.nextDouble();

        System.out.println("Iterativo:");
        System.out.println(fibIterativo(n));
        System.out.println("Iterações:");
        System.out.println(loops);

        System.out.println("Recursivo:");
        System.out.println(fibRecursivo(n));
    }
}