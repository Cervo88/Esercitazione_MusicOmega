package org.example;

import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;


public class Lettore extends Thread{
    String nomeFile;
    private List<Artista> artista;


    public Lettore(String nomeFile) {
        this.nomeFile = nomeFile;
        this.artista = new ArrayList<>();

    }

        public void stampa () {
            for(Artista a : artista) {
                System.out.println(a);
            }
        }


        public void leggi () {
            FileReader fr;
            int i;
            try {
                //1) apro il file
                fr = new FileReader(nomeFile);
                //2) leggo carattere per carattere e lo stampo
                while ((i = fr.read()) != -1)
                    System.out.print((char) i);

                System.out.print("\n\r");
                fr.close();
            } catch (IOException ex) {
                System.err.println("Errore!");
            }
        }


        public void run () {
            leggi();
        }
    }
