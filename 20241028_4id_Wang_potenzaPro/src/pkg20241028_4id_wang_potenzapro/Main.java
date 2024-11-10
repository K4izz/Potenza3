/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20241028_4id_wang_potenzapro;

/*
    28-10-2024 Wang_potenzaproc Wang Jimmy.
    Esercizio della potenza in diversi file richiamando i metodi versione 3.
*/

public class Main {

    public static void main(String[] args) {
        // Inizio Instanzazione dell'oggetto per richiamare il metodo dell'inserimento dell'input dell'utente.
        Scan myScan = new Scan();
        myScan.Scan();
        // Fine Instanzazione dell'oggetto per richiamare il metodo dell'inserimento dell'input dell'utente.
        
        // Inizio Assegnazione delle variabili inserite dall'utente a un'altra variabile.
        int base = myScan.GetScanBase();
        int esponente = myScan.GetScanEsponente();
        // Fine Assegnazione delle variabili inserite dall'utente
        
        // Inizio Instanzazione dell'oggetto per richiamare il metodo e il passaggio delle variaibili per il calcolo della potenza.
        MetodoPotenza myPotenza = new MetodoPotenza(base,esponente);
        int potenza = myPotenza.GetPotenza();
        // Fine Instanzazione dell'oggetto per richiamare il metodo e il passaggio delle variaibili per il calcolo della potenza.
        
        // Inizio Instanzazione dell'oggetto per richiamare il medoto per stampare con il passaggio dei valori delle variabili.
        Stampa myStampa = new Stampa();
        myStampa.Stampa(base, esponente, potenza);
        // Fine Instanzazione dell'oggetto per richiamare il medoto per stampare con il passaggio dei valori delle variabili.
    }
    
}
