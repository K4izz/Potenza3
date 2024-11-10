/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241028_4id_wang_potenzapro;

public class MetodoPotenza {
        // Inizio dichiarazione dellavariabile che viene utilizzata dopo per il calcolo della potenza,
        private int potenza = 1;
        // Fine dichiarazione della variabile che vengono utilizzata dopo per il calcolo della potenza,
        
        // Inizio Creazione del metodo per fare il calcolo della potenza,
        public MetodoPotenza(int base, int esponente){
            for(int i = 0; i < esponente ; i++ ){
                potenza = potenza * base;
            }
        }
        // Fine Creazione del metodo per fare il calcolo della potenza,
        
        // Inizio il medoto get per prelevare il valore del calcolo della potenza.
        public int GetPotenza(){
            return potenza;
        }
        // Fine il medoto get per prelevare il valore del calcolo della potenza.
}
