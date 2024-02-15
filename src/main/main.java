package main;
import estructuras.Cola;
import estructuras.Pila;
public class main {
    static Pila datosPila = new Pila();
    static Cola datosCola = new Cola();
    
    public static void main(String[] args) {
        pila();
        cola();
    }
    public static void pila(){
        System.out.println("datos con pila");
        datosPila.push(1);
        datosPila.push(2);
        datosPila.push(3);
        System.out.println(datosPila.printf());
        System.out.println(datosPila.pop());
    }
    public static void cola(){
        System.out.println("datos con cola");
        datosCola.Encolar(4);
        datosCola.Encolar(5);
        datosCola.Encolar(6);
        System.out.println(datosCola.recorrer());
        System.out.println(datosCola.Desencolar());
    }
}
