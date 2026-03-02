import java.util.Scanner;

public class punto6 {

    public inventario[][] llenado(inventario[][] m){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
        inventario p = new inventario();
        System.out.println("ingrese el nombre del producto");
        p.setNombre(sc.next());
        System.out.println("ingrese el precio del producto");
        p.setPrecio(sc.nextInt());
        m[i][j]=p;

            }
        }
        return m;
    }
    
     public inventario[][] mostrar(inventario[][] m){
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    System.out.println("Producto: "+ m[i][j].getNombre());
                    System.out.println("Precio: "+ m[i][j].getPrecio());
                    System.out.println("--------------------------------------------- ");
                    System.out.println("--------------------------------------------- ");
                    System.out.println("--------------------------------------------- ");
                }
            }
            return m;
        }

}
