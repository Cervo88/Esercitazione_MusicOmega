package org.example;

import java.io.BufferedReader;
import java.io.Reader;
import java.lang.reflect.Type;
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

        /*public void leggi () {
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
        } */
        public void leggi() {
            try (BufferedReader br = new BufferedReader(new FileReader(nomeFile))) {
                String riga;
                while ((riga = br.readLine()) != null) {
                    System.out.println(riga);
                }
            } catch (IOException e) {
                System.err.println("Errore lettura file");
            }
        }

    public List<Artista> leggiJson() {
        try (Reader reader = new FileReader(nomeFile)) {
            Type tipoLista = new TypeToken<List<Artista>>() {}.getType();
            return gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            System.err.println("Errore lettura JSON");
            return null;
        }
    }


        public void run () {
            leggi();
        }
    }
