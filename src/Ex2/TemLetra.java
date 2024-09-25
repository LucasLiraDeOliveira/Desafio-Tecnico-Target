import java.util.Scanner;

public class TemLetra {
    public static void main(String[] args) {
        String frase, arrayLower[], arrayUpper[];

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual String você deseja saber se tem a letra A?");
        frase = scanner.nextLine();

        arrayLower = frase.split("a");
        arrayUpper = frase.split("A");

        if (frase.charAt(frase.length() - 1) == 'a') {
            //Condição que checará se a o char na última posição da String é a letra a
            
            System.out.printf("\nNa frase: \n   %s \n\nHá %d letra(s) a minúscula \nE %d letra(s) A maiúscula", frase, (arrayLower.length), (arrayUpper.length - 1));
            //Na situação do a minúsculo finalizar a string, não precisa do menos 1 (-1) pois ele não atribui o vazio posterior a um espaço do array
            // Mas quando se trata do a minúsculo no início do array, precisa do menos 1 (-1) pois ele atribui o vazio anterior a um espaço do array
        } else if (frase.charAt(frase.length() - 1) == 'A') {
            System.out.printf("\nNa frase: \n   %s \n\nHá %d letra(s) a minúscula \nE %d letra(s) A maiúscula", frase, (arrayLower.length - 1), (arrayUpper.length));
        } else
            System.out.printf("\nNa frase: \n   %s \n\nHá %d letra(s) a minúscula \nE %d letra(s) A maiúscula", frase, (arrayLower.length - 1), (arrayUpper.length - 1));

        scanner.close();
    }
}
