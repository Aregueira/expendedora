package expendedora;

import java.util.Scanner;
import expendedora.cafe.Expresso;
import expendedora.cafe.Ristretto;
import expendedora.cafe.Normal;
import expendedora.te.Rojo;
import expendedora.te.Verde;
import expendedora.te.Negro;


public class Expendedora {


    public static void main(String[] args) {

    Bebida[] pedido = new Bebida[200];
    int sig = 0;
    boolean siguientePedido = true;
    
    while (siguientePedido) {
        
            System.out.println("Ingrese la bebida deseada:\n"
                    + "1) Te\n"
                    + "2) Cafe\n");
            Scanner sc = new Scanner (System.in);
            int tipo = sc.nextInt();     
            
    if (tipo == 1) {
            System.out.println(""
            + "1) Negro\n"
            + "2) Verde\n"
            + "3) Rojo");
            Scanner nuevaEntrada = new Scanner(System.in);
            int tipoTe = nuevaEntrada.nextInt();
            switch (tipoTe){
                case 1: pedido[sig] = new Negro();
                        break; 
                case 2: pedido[sig] = new Verde();
                        break;
                case 3: pedido[sig] = new Rojo();
                        break;
            }
            System.out.println("Indique la cantidad de azucar que desea 0-3");
                Scanner cantAzucar = new Scanner(System.in);
                int azucar = nuevaEntrada.nextInt();
                pedido[sig].setAzucar(azucar);

            System.out.println("Indique la cantidad de leche que desea 0-3");
                Scanner cantLeche = new Scanner(System.in);
                int leche = cantLeche.nextInt();
                pedido[sig].setLeche(leche);
    }
    if (tipo == 2){
        System.out.println(""
            + "1) Normal\n"
            + "2) Ristretto\n"
            + "3) Expresso");
        Scanner nuevaEntrada = new Scanner(System.in);
        int tipoCafe = nuevaEntrada.nextInt();
        switch(tipoCafe){
            case 1: pedido[sig] = new Normal();
                    break;
            case 2: pedido[sig] = new Ristretto();
                    break;
            case 3: pedido[sig] = new Expresso();
                    break;
        }           
            System.out.println("Indique la cantidad de azucar que desea 0-3");
                Scanner cantAzucar = new Scanner(System.in);
                int azucar = nuevaEntrada.nextInt();
                pedido[sig].setAzucar(azucar);

            System.out.println("Indique la cantidad de leche que desea 0-3");
                Scanner cantLeche = new Scanner(System.in);
                int leche = cantLeche.nextInt();
                pedido[sig].setLeche(leche);        
    }
            System.out.println("¿Quiere hacer otro pedido?\n"
                    + "1-Sí\n"
                    + "2-No\n");
            Scanner sigPedido = new Scanner(System.in);
            int otro = sigPedido.nextInt();
            if (otro == 1) {
                sig++;
            } else {
                siguientePedido = false;
            }
            
    }    
            
        double subtotal = 0;
        double total = 0;

        for (int i = 0; i < pedido.length; i++) {
            //Verifico que no sean nulos
            if (pedido[i] != null) {
                System.out.println(pedido[i]);
                subtotal = subtotal + pedido[i].getPrecio()
                        + pedido[i].getAzucar() * 5
                        + pedido[i].getLeche() * 5;
                
            }

        }
        total = subtotal * 1.21;
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Total:" + total);
            
            
    }
    
}
