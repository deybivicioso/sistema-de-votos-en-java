import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class votos {
    public static void ingreseCandidatos(String[] candidatos, Scanner a) {
        for (int i = 0; i < 2; i++) {
            System.out.println("ingresa el nombre del candidadoto" + (i + 1));
            candidatos[i] = a.next();

        }

    }

    public static void ingresevotos(String[] candidatos, int[] votos, Scanner a) {
        int numeros = 0;
        int cantidad = 0;
        int contador = 0;
        for (int i = 0; i < 2; i++) {
            do {
                System.out.println("ingrese los votos de " + candidatos[i]);
                cantidad = a.nextInt();
                if (cantidad > 0) {
                    numeros = numeros + cantidad;
                }
                contador = contador + 1;
            } while (contador != 4);
            votos[i] = numeros;
            System.out.println("ingrese los votos del proximo candidato");
            numeros = 0;
            cantidad = 0;
            contador = 0;
        }

    }

    public static void resultados(String[] candidatos, int[] votos) {
        System.out.println("los resultados fueron");
        for (int i = 0; i < 2; i++) {
            System.out.println(candidatos[i] + "obtuvo" + votos[i]);
        }

    }

    public static void ganador(String[] candidatos, int[] votos) {
        int i = 0;
        for (int j = 0; j < 2; j++) {
            if (votos[j] > votos[i]) {
                i = j;
            }
        }
        System.out.println("el candidato ganador fue " + candidatos[i] + "con " + votos[i] + "votos");

    }

    public static void main(String[] args) {
        // presentacion del sistema
        System.out.print(" bienvenido al sistema de votos" +
                " \n con este sistema de votos eligiremos un ganador ");

        LocalDateTime fecha = LocalDateTime.now();
        System.out.println("\n la fecha de ejecucion de este programa es: " + fecha);

        // variables
        String candidatos[] = new String[2];
        int votos[] = new int[3];
        Scanner a = new Scanner(System.in);

        // llamada de metedos
        ingreseCandidatos(candidatos, a);
        ingresevotos(candidatos, votos, a);
        resultados(candidatos, votos);
        ganador(candidatos, votos);

    }
}