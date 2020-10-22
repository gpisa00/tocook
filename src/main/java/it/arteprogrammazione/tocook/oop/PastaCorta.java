package it.arteprogrammazione.tocook.oop;

final class PastaCorta extends PastaAstratta {

    private boolean minuta;

    PastaCorta(String nome, String descrizione, boolean fresca, long tempoCotturaMs, boolean minuta) {
        super(nome, descrizione, fresca, tempoCotturaMs);
        this.minuta = minuta;
    }

    boolean isMinuta() {
        return minuta;
    }

    void setMinuta(boolean minuta) {
        this.minuta = minuta;
    }
}
