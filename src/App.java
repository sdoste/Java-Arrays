import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

    // 1.Crear un array de lo que desees, pero con el tamaño que diga el usuario.
    //Luego añadir elementos hasta que se rellene. Luego mostrarlo.

    Scanner teclado = new Scanner(System.in);
    System.out.println("Vamos a crear una lista con tus animales favoritos. Escribe la longitud de la lista");
    int longitud = Integer.parseInt(teclado.nextLine());
    String[] listaAnimales = new String[longitud];
    for(int i = 0; i < listaAnimales.length; i++){
        System.out.println("Introduce el animal nº " + (i+1) + ":");
        listaAnimales[i] = teclado.nextLine();
    }
    System.out.println("Tu lista completa es:" + Arrays.toString(listaAnimales));


    // 2 - Tienes un array de 20 números enteros: decir cuales son pares e impares.
    // Añádelos a nuevos arrays: 'arrayPares' y 'arrayImpares',
    int [] lista = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60};
    int [] pares = new int[10];
    int parIndex = 0;
    int [] impares = new int[10];
    int imparIndex = 0;
    for(int numero : lista){
        if ((numero % 2) == 0){
            //par
            pares[parIndex] = numero;
            parIndex++;
        } else{
            //impar
            impares[imparIndex] = numero;
            imparIndex++;
        }
    }
    //y al final mostrar los tres arrays.
    System.out.println("La lista de nº completa es: " + Arrays.toString(lista));
    System.out.println("Los números pares son: " + Arrays.toString(pares));
    System.out.println("Los números impares son: " + Arrays.toString(impares));


    // 3- Premio vacaciones en Ibiza: tienes un listado de nombres en un array.
    // Aleatoriamente, seleccionar el ganador y mostrarlo.
    // Entonces preguntar: "otra vez? (S/N)", y si es que sí, volver a generar nuevo ganador y mostrarlo.
    // Seguir preguntando hasta que el usuario diga que no.
    //8 participantes
    int nParticipantes = 8;
    String[] nombresSorteo = {"María", "Gerardo", "Robustiana", "Filomeno", "Godofredo", "JoseAntonia", "Marciana", "Candela"};
    String answer = "s";
    while(answer.equals("s")){
        int numeroGanador = (int)(Math.random() * nParticipantes) + 1;
        System.out.println("El ganador es " + nombresSorteo[numeroGanador]);
        System.out.println("");
        System.out.println("¿Quieres realizar el sorteo otra vez? (S/N)");
        answer = teclado.nextLine().toLowerCase();
    }
    teclado.close();
    }
}
