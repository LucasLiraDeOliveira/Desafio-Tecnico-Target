import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int checaNumero;
        boolean resultado;

        Scanner scanner = new Scanner(System.in);
        Fibo f1 = new Fibo();

        System.out.println("Qual número deseja checar se faz parte da sequência de Fibonacci?");
        checaNumero = scanner.nextInt();
        f1.setValor(checaNumero);
        resultado = f1.checaFibo();

        System.out.printf("O número %d faz parte da sequência de Fibonacci? %b", checaNumero, resultado);

        scanner.close();
    }
}
