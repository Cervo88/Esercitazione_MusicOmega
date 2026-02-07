package org.example;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.List;

public class GestoreFile {
    private String nomeFile;
    private Gson gson;

    public GestoreFile(String nomeFile) {
        this.nomeFile = nomeFile;
        this.gson = new Gson();
    }


    // 3) Scrittura file JSON aggiornato
    public void scriviJson(List<Artista> artisti) {
        try (Writer writer = new FileWriter(nomeFile)) {
            gson.toJson(artisti, writer);
        } catch (IOException e) {
            System.err.println("Errore scrittura JSON");
        }
    }
}


