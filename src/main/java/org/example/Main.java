package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Lettore l = new Lettore("MusicOmega.json");
        //l.start();
        //l.stampa();

        System.out.println("Benvenuto nell'app");
        System.out.println("Questa applicazione è stata sviluppata da il Team Omega, la tua privacy è la nostra priorità");

        for (int i = 3; i > 0; i--) {
            System.out.println("inizio tra" + i);
            Thread.sleep(1000);
        }


        GestoreFile gf = new GestoreFile("MusicOmega.json");
        List<Artista> listaArtisti = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Cognome: ");
        String cognome = sc.nextLine();

        System.out.print("Band: ");
        String band = sc.nextLine();

        System.out.print("Data di nascita: ");
        String data = sc.nextLine();

        System.out.print("Album: ");
        String album = sc.nextLine();

        Artista a = new Artista(id, nome, cognome, band, data, album);
        listaArtisti.add(a);

        gf.scriviJson(listaArtisti);

        System.out.println("Artista salvato correttamente.");
    }
}

