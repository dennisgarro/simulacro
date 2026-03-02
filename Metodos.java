import java.util.Scanner;

public class Metodos {
    public int validarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un numero porfa ");
            sc.nextLine();
        }
        return sc.nextInt();
    }
}
