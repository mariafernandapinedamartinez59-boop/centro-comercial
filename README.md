EP2.eyJ2IjoyLCJ3IjoiTWFyw61hIEZlcm5hbmRhIFBpbmVkYSBNYXJ0aW5leiIsImciOiIwMyIsInMiOiIiLCJlIjoiIiwicCI6IjAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMCIsIm0iOiIifQ.W2Xe7LRtmSFeYlTa# centro-comercial
valores y referencia java
src/main/java/rpg/app/Main.java
package rpg.app;

import rpg.modelo.Personaje;

public class Main {
    // Con números se copia el VALOR; con objetos se copia la REFERENCIA (a dónde apunta)
    // >>> SALA B.4
    public static void main(String[] args) {
        int nivel = 1;
        int otroNivel = nivel;
        otroNivel = 5;
        Personaje aria = new Personaje("Aria", 100);
        Personaje copia = aria;
        copia.recibirDano(30);
        System.out.println(nivel + " " + aria.getVida());
    }
    // <<< FIN SALA B.4
}
