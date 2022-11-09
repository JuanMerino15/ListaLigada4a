/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaligada;

/**
 *
 * @author juan
 */
public class Nodo {

    private int dato; // dato almacenado
    //Nodo es una referencia a la clase 
    private Nodo siguiente; // apuntador al siguiente nodo

    public Nodo(int d) {
        this.dato = d;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }
    

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo otroNodo) {
        this.siguiente = otroNodo;
    }
    
    

}
