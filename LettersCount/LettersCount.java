package LettersCount;
/*Esercizio Letters Count 🛴

Scrivere un programma Java che restituisca, a partire da una lista di nomi, la somma totale
delle lettere contenute in ogni nome che inizia con la lettera "f"

Suggerimento: realizzatelo prima senza Stream, poi con Stream*/

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LettersCount {
    static List<String> names = List.of("michiele","Alfio","federica", "Chiara" ,"focaccia", "salvatore");

    public static void main(String[] args) {
        int nomif = names.stream().filter(x -> x.startsWith("f")).map(String::length).reduce(0,Integer::sum);
       // List <Integer> listint = nomif.stream().map(String::length).toList();
        System.out.println(nomif);
    }

}
