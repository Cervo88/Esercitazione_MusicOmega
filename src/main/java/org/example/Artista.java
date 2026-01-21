package org.example;


public class Artista {
    protected int id;
    protected String nome;
    protected String cognome;
    protected String band;
    protected String data_Nascita;
    protected String album;

    @Override
    public String toString() {
        return "id:" + id +",Nome: " + nome + ",Cognome: " + cognome + ",Band: " + band+     ",Data di nascità: " + data_Nascita + ",Album più ascoltato: " + album;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getBand() {
        return band;
    }
    public String getData_Nascita() {
        return data_Nascita;
    }

    public String getAlbum() {
        return album;
    }

}
