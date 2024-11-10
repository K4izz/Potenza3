package pkg20241028_4id_wang_potenzapro;

// importazione della libreria per lo scan
import java.util.Scanner;


public class Scan {
    // Inizio dichiarazione delle variabili che vengono utilizzate dopo per l'input dell'utente.
    private int base;
    private int esponente;
    // Fine dichiarazione delle variabili che vengono utilizzate dopo per l'input dell'utente.
    
    // Inizio creazione del metodo per inserire l'input dell'utente.
    public void Scan(){
        Scanner myScan = new Scanner(System.in);
        System.out.println("inserisci la base");
        
        base = myScan.nextInt();
        
        System.out.println("inserisci l'esponente");
        
        esponente = myScan.nextInt();
    }
    // Fine creazione del metodo per inserire l'input dell'utente. 
    
    // Inizio creazione dei metodi per prelevare i valori della base inserito dall'utente. 
    public int GetScanBase(){
        return base;
    }
    public int GetScanEsponente(){
        return esponente;
    }
    // Fine creazione dei metodi per prelevare i valori della base inserito dall'utente. 
}
