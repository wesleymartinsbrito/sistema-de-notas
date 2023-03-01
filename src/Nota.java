import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        
        do {
            System.out.println("Informe um número de 1 a 10: ");
            number = scan.nextInt();
        } while (number < 1 || number > 10);
       /*  if (number >= 1 && number <= 10) {
            System.out.println("O número " +number+ " é um número válido! :)");
        } else {
            System.out.println("Digite um número válido!");
        }*/
    }
}
