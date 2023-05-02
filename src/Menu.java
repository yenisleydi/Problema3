import java.util.Scanner;

public class Menu {
    public void menu(){
        Ingresar ingresar=new Ingresar();
        Operacion operacion=new Operacion();
        Scanner scanner=new Scanner(System.in);
        int elegir;
        do {
            System.out.println("-------MENU------");
            System.out.println("[1].Ingresar clientes");
            System.out.println("[2].Consultar clientes");
            System.out.println("[3].Monto de adeudo");
            System.out.println("[4].Salir");
            elegir=scanner.nextInt();
            switch (elegir){
                case 1:
                    ingresar.ingresarDeudor();
                      break;
                case 2:
                    ingresar.mostrarDeudores();
                    break;
                case 3:

                     break;
                case 4:
                     break;
                default :
                    System.out.println("Opcion invalida");
                break;
            }
        }while(elegir!=4);
    }
}
