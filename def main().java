public class Main
 { // Con números se copia el VALOR; con objetos se copia la REFERENCIA (a dónde apunta) //
 //  >>> SALA B.4 public 
 static void main(String[] args) 
 { int nivel = 1; int otroNivel = nivel; otroNivel = 5;
  Personaje aria = new Personaje("Aria", 100); 
  Personaje copia = aria; copia.recibirDano(30);
   System.out.println(nivel + " " + aria.getVida()); } // <<< FIN SALA B.4 }
    //sttatic y contadores
    
      public static void main(String[] args) {
        Item espada = new Item("Espada", 3.5);
        Item pocion = new Item("Poción", 0.5);
        System.out.println(espada.describir());
        System.out.println(pocion.describir());
    }

