//Importar librerias para arrayList y scanner
import java.util.ArrayList;
import java.util.Scanner;

public class listaCompras {

    public static void main(String[] args) {
        //Creo un Arraylist para almacenar las compras
        ArrayList<String> listaCompras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nLISTA DE COMPRAS");
        String option;

        //Hago un do-while para mostrar las opciones siempre y cuando el usuario no ingrese el 3 (salir)
        do {
            System.out.println(".....................\n");
            System.out.println("1. Agregar un articulo");
            System.out.println("2. Mostrar la lista");
            System.out.println("3. Salir");
            System.out.println("");
            System.out.print("Elija una opcion: ");

            option = sc.nextLine(); //El usuario ingresa la opocion 

            //Con un switch se evalua lo que el usuario ingrese
            switch(option) {
                case "1":
                    System.out.print("Ingrese un articulo a la lista: ");
                    String item = sc.nextLine();
                    listaCompras.add(item); //se agrega el item al array con el metodo .add()
                    System.out.println("\nArtículo agregado a la lista.");
                break;
                case "2":
                    System.out.println("\nLista de compras: ");
                    if (listaCompras.isEmpty()) { //si la lista esta vacia se muestra el sig mensaje
                        System.out.println("\nNo tiene nada en la lista");
                    } else {
                        for (int i = 0; i < listaCompras.size(); i++) { //con un for se recorre el array
                            System.out.println((i+1) + ". " + listaCompras.get(i)); // se imprimen todos los elementos
                        }
                    }
                break;
                case "3":
                    System.out.println("\nHasta luego...");
                break;
                default:
                    System.out.println("\nIngrese una opcion valida.");
                break;

            }

        } while(!option.equals("3"));  //el while se va a ejecutar siempre y cuando la opcion no se 3

        sc.close();
    }
}

