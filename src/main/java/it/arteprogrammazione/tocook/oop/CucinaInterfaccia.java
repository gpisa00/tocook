package it.arteprogrammazione.tocook.oop;

public interface CucinaInterfaccia {

    //public è intrinseco
    void cuociPastaLunga(String nome, String descrizione, boolean fresca, int tempoCotturaMs, SezioneEnum sezione, int lunghezzaCm);

    void cuociPastaCorta(String nome, String descrizione, boolean fresca, int tempoCotturaMs, boolean minuta);
}
