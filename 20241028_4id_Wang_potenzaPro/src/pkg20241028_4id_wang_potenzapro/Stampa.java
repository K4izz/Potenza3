/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241028_4id_wang_potenzapro;

public class Stampa {

        // inizio creazione del metodo per stampare le variabili
        public void Stampa (int base, int esponente , int potenza ){
        if (esponente==0){
            System.out.println("La base equivale a : " + base);
            System.out.println("L'esponente equivale a : " + esponente);
            System.out.println("Dato che qualsiasi numero elevato alla 0 la potenza equivale a : " + potenza);
        }
        else{
        System.out.println("La base equivale a : " + base);
        System.out.println("L'esponente equivale a : " + esponente);
        System.out.println("La potenza e' : " + potenza);
        }
        
    }
        // Fine creazione del metodo per stampare le variabili
}
