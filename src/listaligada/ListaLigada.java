/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaligada;

/**
 *
 * @author juan
 */
public class ListaLigada {
    private Nodo head;//Apuntador a la cabecera de la lista (primer nodo)
    private Nodo tail;//Apuntador a la cola de la lista (ultimo nodo)
    private Nodo actual;//Apuntador al nodo seleccionado actualmente
    private int size;//tamaño de la lista (número de nodos en la lista)
    
    public ListaLigada(){
        this.head= null;
        this.tail= null;
        this.actual= null;
        this.size= 0;
        
    }
    /*
    public void addFirst(int dato){
        Nodo nodo = new Nodo(dato);
        this.head = nodo;
        this.tail = nodo;
        this.actual=nodo;
        this.size++; // Se incrementa el tamaño de la lista
    }
    */
    public void add(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        this.size++;
        this.tail= nuevoNodo; //se mueve el apuntador al ultimo nodo
        
        if( head  == null){//La lista esta vacia, creamos el primer nodo
            head = nuevoNodo;
            actual = head;
        }
        else{
            actual.setSiguiente(nuevoNodo);// actual.sig apunta al nuevoNodo (enlace entre nodos)
            actual = nuevoNodo;// ahora actual es el nuevoNodo
        }
        
        
    }
    
    
    public void add(int dato, int posicion){
        Nodo nuevoNodo = new Nodo(dato);
        int i = 1;
        actual = head;
        while(i<posicion -1){
            actual = actual.getSiguiente();
            i++;
        }
        Nodo auxiliar = actual.getSiguiente();
        actual.setSiguiente(nuevoNodo);
        actual = nuevoNodo;
        actual.setSiguiente(auxiliar);
    }
    
    
    public void printList(){
        int posicion = 1;
        actual = head;
        while(actual != null){
            int elemento = actual.getDato();
            System.out.println("Dato= " + elemento + " almacenando en nodo: " + posicion);
            actual = actual.getSiguiente();
            posicion++;
        }
    }
    
    //Método para eliminar un nodo del inicio
    public int EliminarInicio(){
        int elemento = head.getDato();//Declaro un entero que sera igual al dato de la cabecera
        if(head == tail){ // este if es solo en caso de que haya un solo nodo
            this.head=null;
            this.tail=null;
        }else{
            head=head.getSiguiente(); // Aqui es cuando ya son dos o mas nodos
        }
        return elemento;
    }
    
    public int EliminarFinal(){
        int elemento = tail.getDato();
        if(head == tail){
            this.tail=null;
            this.head = null;
        }else{
            Nodo temporal = head; // este nodo temporal sirve para recorrer toda la lista
            while(temporal.getSiguiente()!= tail){ //se recorre toda la lista hasta el penultimo elemento
                temporal = temporal.getSiguiente();
            }
            
            temporal= null;
            tail = temporal;
            
            
        }
        return elemento;
    }
}
        