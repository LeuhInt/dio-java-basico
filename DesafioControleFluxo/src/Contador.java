import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo número deve ser maior que o primeiro");
        }
    }

    static void contar (int numero1, int numero2) throws ParametrosInvalidosException{
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        }
        int contador = numero2 - numero1;
        for(int i = 0; i<contador; i++){
            System.out.println("Imprindo o número: " + i);
        }
    }
}
