package org.example;


public class Artista {
    protected int id;
    protected String nome;
    protected String cognome;
    protected String band;
    protected String data_Nascita;
    protected String album;

    public Artista(int id, String nome,String cognome,String band, String data_nascita, String album) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.band = band;
        this.data_Nascita = data_nascita;
        this.album = album;
    }

    @Override
    public String toString() {
        return "id:" + id +" ,Nome: " + nome + ",Cognome: " + cognome + ",Band: " + band + ",Data di nascità: " + data_Nascita + ",Album più ascoltato: " + album;
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
