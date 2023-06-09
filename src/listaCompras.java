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
            System.out.println("3. Editar un articulo");
            System.out.println("4. Salir");
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
                    //if de validacion
                    if (listaCompras.isEmpty()) {
                        System.out.println("\nNo hay articulos para editar"); //Se muestra este mensaje en caso de que el array este vacio
                    } else {
                        System.out.println("\nIngrese el numero del articulo que quiere editar: ");
                        int index = sc.nextInt();
                        sc.nextLine(); //vaciar el bufer de entrada
                        //si el array tiene elementos se evalua con otro if si se ingreso un numero de articulo valido
                        if (index < 1 || index > listaCompras.size()) {
                            System.out.println("Ingrese el numero de un articulo valido");
                        } else {
                            System.out.println("Ingrese el nuevo nombre del articulo: ");
                            String articuloNuevo = sc.nextLine(); //Se almacena en la variable el nuevo nombre ingresado por el usuario
                            listaCompras.set(index - 1, articuloNuevo); // el metodo set actualiza el elemento ubicado en el indice indicado por el usuario (debido a que inician en 0, se le resta 1 para que coincida con el que ingreso el usuario)
                            System.out.println("El articulo fue editado con exito");
                        }
                    }
                break;            
                case "4":
                    System.out.println("\nHasta luego...");
                break;
                default:
                    System.out.println("\nIngrese una opcion valida.");
                break;

            }

        } while(!option.equals("4"));  //el while se va a ejecutar siempre y cuando la opcion no se 3

        sc.close();
    }
}

