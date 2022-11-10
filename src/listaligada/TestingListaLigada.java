/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaligada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author juan
 */
public class TestingListaLigada {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int dato;
        char respuesta;
        
        ListaLigada lista = new ListaLigada();
        
        for(;;){ // ciclo infinito
        
            System.out.println("Escribe un dato entero: ");
            entrada = bufer.readLine();
            dato = Integer.parseInt(entrada);
            lista.add(dato);
            System.out.println("Se ha agregado el dato a la lista");
            System.out.println("¿Quieres agregar más datos: (s/n): ");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            if(respuesta == 'n' || respuesta == 'N')
                break;
        }
            
           
            
            System.out.println("-----------------------------------");
            System.out.println("Contenido de la lista ligada: ");
            lista.printList();
            
        System.out.println("--------------------------");
        System.out.println("Escribe el elemento a insertar: ");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        System.out.println("Escribe la posicion en donde la quieres insertar: ");
        entrada = bufer.readLine();
        int p = Integer.parseInt(entrada);
        lista.add(dato, p);
        
        System.out.println("--------------------------");
        System.out.println("Eliminando un elemento del inicio de la lista");
        dato = lista.EliminarInicio();
        System.out.println("El elemento eliminado es: " + dato);
        
        System.out.println("--------------------------");
        System.out.println("Eliminando un elemento del final de la lista");
        dato = lista.EliminarFinal();
        System.out.println("El elemento eliminado es: " + dato);
        
        System.out.println("--------------------------");
        System.out.println("Eliminando un elemento especifico de la lista");
        System.out.println("Ecribe el elemento que quieres elminar: ");
        entrada = bufer.readLine();
        int e = Integer.parseInt(entrada);
        lista.eliminarEspecifico(e);
        
        
        System.out.println("---------------------------");
        System.out.println("Contando los nodos");
        System.out.println("Cantidad de elementos en mi lista: " + lista.conteoNodos());

        System.out.println("----------------------------");
        System.out.println("Buscando un elemento en la lista");
        System.out.println("Ingresa el elemento que buscas: ");
        entrada = bufer.readLine();
        int a = Integer.parseInt(entrada);
        lista.Busqueda(a);
        if(lista.Busqueda(a) == true){
            System.out.println("El elemento " + a + " Si esta en la lista");
        }else{
            System.out.println("El elmento " + a + " no se encuentra en la lista");
        }

        System.out.println("---------------------------");
        System.out.println("Contenido de la lista");
        lista.printList();
        
    }
}

