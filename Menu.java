import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean continuar = true;
        int opt = 0;
        while (continuar) {
            System.out.println("Bienvenido al simulacro de parcial de matrices objetuales");
            System.out.println("Ingrese el punto que desea ejecutar");
            System.out.println("Punto 1");
            System.out.println("Punto 2");
            System.out.println("Punto 3");
            System.out.println("Punto 4");
            System.out.println("Punto 5");
            System.out.println("Punto 6");
            System.out.println("Punto 7");
            System.out.println("Punto 8");
            System.out.println("Punto 9");
            System.out.println("Punto 10");
            System.out.println("Salir 11");
            opt = m.validarEntero(sc);
            switch (opt) {
                case 1:
                    System.out.println("punto 1");
                    break;
                case 2:
                    System.out.println("punto 2");
                    break;
                case 3:
                    System.out.println("punto 3");
                    break;
                case 4:
                    System.out.println("punto 4");
                    break;
                case 5:
                    System.out.println("punto 5");
                    break;
                case 6:
                    System.out.println("punto 6");{
                        int n =0;
                        System.out.println("ingrese el tamaño de la lista de precios n * n ");
                        n=sc.nextInt();
                        punto6 I=new punto6();
                        inventario[][] i= new inventario[n][n];
                        System.out.println("Vamos a llenar el pirmer inventario");
                        i= I.llenado(i);
                        System.out.println("Matriz 1");
                        System.out.println("--------------------------------------------- ");
                        I.mostrar(i);
                    }
                    break;
                case 7:
                    System.out.println("punto 7");
                    break;
                case 8:
                    System.out.println("punto 8");
                    break;
                case 9:
                    System.out.println("punto 9");
                    break;
                case 10:
                    System.out.println("punto 10");
                    break;
                case 11:
                    System.out.println("punto 11");
                    continuar = false;
                    break;

                default:
                    System.out.println("esa  opcion no existe por favor mire bien el menu");
                    break;
            }

        }
    

    }
    


}