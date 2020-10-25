package it.arteprogrammazione.tocook.framework;

public abstract class PastaAstrattaFW {

    private String nome;
    private String descrizione;
    private boolean fresca;
    private long tempoCotturaMs;

    public PastaAstrattaFW() {
    }

    public PastaAstrattaFW(String nome, String descrizione, boolean fresca, long tempoCotturaMs) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.fresca = fresca;
        this.tempoCotturaMs = tempoCotturaMs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public boolean isFresca() {
        return fresca;
    }

    public void setFresca(boolean fresca) {
        this.fresca = fresca;
    }

    public long getTempoCotturaMs() {
        return tempoCotturaMs;
    }

    public void setTempoCotturaMs(long tempoCotturaMs) {
        this.tempoCotturaMs = tempoCotturaMs;
    }

    public abstract void cuoci();

}
