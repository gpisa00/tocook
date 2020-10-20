package it.arteprogrammazione.tocook.oop;

public class CucinaConcreta implements CucinaInterfaccia{

    private PastaAstratta pasta;

    @Override
    public void cuociPastaLunga(String nome, String descrizione, boolean fresca, int tempoCotturaMs, SezioneEnum sezione, int lunghezzaCm) {
        pasta = new PastaLunga(nome, descrizione, fresca, tempoCotturaMs, sezione, lunghezzaCm);
        pasta.cuoci();
    }

    @Override
    public void cuociPastaCorta(String nome, String descrizione, boolean fresca, int tempoCotturaMs, boolean minuta) {
        pasta = new PastaCorta(nome, descrizione, fresca, tempoCotturaMs, minuta);
        pasta.cuoci();
    }
}
