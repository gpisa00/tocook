package it.arteprogrammazione.tocook.oop;

import java.util.Date;

abstract class PastaAstratta {

    private String nome;
    private String descrizione;
    private boolean fresca;
    private long tempoCotturaMs;

    PastaAstratta(String nome, String descrizione, boolean fresca, long tempoCotturaMs) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.fresca = fresca;
        this.tempoCotturaMs = tempoCotturaMs;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getDescrizione() {
        return descrizione;
    }

    void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    boolean isFresca() {
        return fresca;
    }

    void setFresca(boolean fresca) {
        this.fresca = fresca;
    }

    long getTempoCotturaMs() {
        return tempoCotturaMs;
    }

    void setTempoCotturaMs(long tempoCotturaMs) {
        this.tempoCotturaMs = tempoCotturaMs;
    }

    void cuoci(){

        Date dataInizio = new Date();
        long inizio = dataInizio.getTime();
        long fine = inizio;

        /*---------------------------
        Per i più curiosi :)
        try {
            Thread.sleep(tempoCotturaMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ----------------------------------*/

        while(fine - inizio < tempoCotturaMs){
            fine = System.currentTimeMillis();
        }
        System.out.println("Inizio = "+ dataInizio);
        System.out.println("Pasta = "+ nome + " ok...");
        System.out.println("Fine = "+ new Date(fine));
    }

}
