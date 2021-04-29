/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

import java.util.Scanner;

/**
 *
 * @author lampi
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void ejercicio1(){
        System.out.println("------------------------[Ejercicio 1]-----------------------------");
        int suma =0;
        System.out.println("Suma consecutiva del 0 al 10 es: ");
        for (int i = 0; i <= 10 ; i++) {
            suma=i+suma;
        }
        System.out.println(suma);
    }
    public static void ejercicio2(){
    System.out.println("------------------------[Ejercicio 2]-----------------------------");
        System.out.println("El factorial del 1 al 10");
        //cambiar el valor para obtener el factorial del numero
        int num;
        int contador=1;
        int factorial=1;
        for (int i = 1; i < 10; i++) {
            contador = contador+1;
            factorial = factorial*contador;
        }
        System.out.println(factorial);
    }
    public static void ejercicio3(){
    System.out.println("------------------------[Ejercicio 3]-----------------------------");
        Scanner miConsola = new Scanner( System.in);
        System.out.println("Factroial de un numero ingresado");
        int num;
        int contador=1;
        int factorial=1;
        System.out.println("Ingrese un numero");
        num = miConsola.nextInt();
        for (int i = 1; i < num; i++) {
            contador = contador+1;
            factorial = factorial*contador;
        }
        System.out.println("El factorial de "+num+ " es "+factorial);
    }
    public static void ejercicio4(){
    System.out.println("------------------------[Ejercicio 4]-----------------------------");
        Scanner miConsola = new Scanner( System.in);
        float num;
        int suma=0;
        System.out.println("Introduca un numero");
        num = miConsola.nextInt();
        System.out.println("La media de la suma consecutiva del 0 al "+num +" es: " );
        for (int i = 0; i <= num ; i++) {
            suma=i+suma;
        }
        System.out.println(suma/(num+1));
    }
    public static void ejercicio5(){
    System.out.println("------------------------[Ejercicio 5]-----------------------------");
        Scanner miConsola = new Scanner( System.in);
        int num[] = new int [3];
        System.out.println("Ingrese los numeros");
        int suma=0;
        for (int i = 0; i < 3; i++) {
            num [i] = miConsola.nextInt();
            suma = suma + num[i];
            System.out.println("La suma es: "+ suma);
        }
        int mayor =num [0];
        int menor =num [0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>mayor){
            mayor =num[i];
            }
            if (num[i]<menor){
            menor =num[i];
            }
        }
        int dis = mayor-menor;
        float promedio = suma /3;
        System.out.println("El promedio es: "+ promedio);
        System.out.println("El numero mayor es: "+ mayor +" y el numero menor es: "+ menor);
        System.out.println("La distancia entre los numero es: "+ dis);
    }
    public static void ejercicio6(){
    System.out.println("------------------------[Ejercicio 6]-----------------------------");
        System.out.println("Dias de la semana");
        String [] dSemana;
        dSemana = new String [7];
        dSemana [0] = "Lunes";
        dSemana [1] = "Martes";
        dSemana [2] = "Miercoles";
        dSemana [3] = "Jueves";
        dSemana [4] = "Viernes";
        dSemana [5] = "Sabado";
        dSemana [6] = "Domingo";
    
        for (int i = 0; i < dSemana.length; i++) {
            System.out.println(dSemana[i]);    
        }
    }
    public static void ejercicio7(){
    System.out.println("------------------------[Ejercicio 7]-----------------------------");
        System.out.println("Personajes de Star Wars");
        String[][] starwars;
        starwars = new String[10][2];
        starwars [0][0] = "Darth Vader";
        starwars [0][1] = "Yoda";
        starwars [1][0] = "Chewbacca";
        starwars [1][1] = "R2-D2";
        starwars [2][0] = "Obi-Wan Kenobi";
        starwars [2][1] = "Anakin Skywalker";
        starwars [3][0] = "Luke Skywalker";
        starwars [3][1] = "C3PO";
        starwars [4][0] = "Han Solo";
        starwars [4][1] = "Leia Skywalker";
        starwars [5][0] = "BB8";
        starwars [5][1] = "Kylo Ren";
        starwars [6][0] = "Rey";
        starwars [6][1] = "Padme Amidala";
        starwars [7][0] = "Darth Sidious";
        starwars [7][1] = "Finn";
        starwars [8][0] = "Poe Dameron";
        starwars [8][1] = "Snoke";
        starwars [9][0] = "General Hux";
        starwars [9][1] = "Jabba el Hutt";
        for (int i = 0; i < starwars.length; i++) {
            for (int j = 0; j < starwars[i].length; j++) {
                System.out.print(starwars[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void ejercicio8(){
    System.out.println("------------------------[Ejercicio 8]-----------------------------");
        System.out.println("Tablero de Gato");
        String[][] gato;
        gato = new String[3][3];
        gato [0][0] = "_";
        gato [0][1] = "|_|";
        gato [0][2] = "_";
        gato [1][0] = "_";
        gato [1][1] = "|_|";
        gato [1][2] = "_";
        gato [2][0] = " ";
        gato [2][1] = "| |";
        gato [2][2] = " ";
        
        for (int i = 0; i < gato.length; i++) {
            for (int j = 0; j < gato[i].length; j++) {
                System.out.print(gato[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void datos(){
        System.out.println("ACTIVIDAD 3");
        System.out.println("ALUMNO: Martines Dionicio Otniel Elihu");
        System.out.println("MATARIA: Lenguaje de Programacion");
        
    }
    public static void main(String[] args) {
        datos();
        Scanner miConsola = new Scanner( System.in);
        System.out.println("Selecciones el ejercicio");
        int ejer= miConsola.nextInt();
        switch (ejer) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break; 
            case 3:
                ejercicio3();
                break;     
            case 4:
                ejercicio4();
                break; 
            case 5:
                ejercicio5();
                break;       
            case 6:
                ejercicio6();
                break; 
            case 7:
                ejercicio7();
                break;  
            case 8:
                ejercicio8();
                break;        
            default:
                throw new AssertionError();
        }
    }
    
}
