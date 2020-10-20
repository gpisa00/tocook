package it.arteprogrammazione.tocook.oop;

public class PastaLunga extends PastaAstratta {

    //Usiamo Enumeration
    private SezioneEnum sezione;
    private int lunghezzaCm;

    PastaLunga(String nome,
               String descrizione,
               boolean fresca,
               long tempoCotturaMs,
               SezioneEnum sezione,
               int lunghezzaCm) {
        super(nome, descrizione, fresca, tempoCotturaMs);
        this.sezione = sezione;
        this.lunghezzaCm = lunghezzaCm;
    }

    public SezioneEnum getSezione() {
        return sezione;
    }

    void setSezione(SezioneEnum sezione) {
        this.sezione = sezione;
    }

    int getLunghezzaCm() {
        return lunghezzaCm;
    }

    void setLunghezzaCm(int lunghezzaCm) {
        this.lunghezzaCm = lunghezzaCm;
    }

    @Override
    void cuoci() {
        if (spezza(sezione)) {
            System.out.println("Pasta spezzata");
        }else {
            System.out.println("pasta non spezzata");
        }
        super.cuoci();
    }

    boolean spezza(SezioneEnum sezione) {
        boolean result = false;
        switch (sezione) {
            case TONDA:
                if (lunghezzaCm > 5) {
                    System.out.println("Pasta Lunga " + lunghezzaCm + " con sezione Tonda sta per essere divisa");
                    result = true;
                }
                break;
            case QUADRATA:
            case RETTANGOLARE:
                if (lunghezzaCm > 2) {
                    System.out.println("Pasta Lunga " + lunghezzaCm + " con sezione quadrata o rettangolare sta per essere divisa");
                    result = true;
                }
                break;
            default:
                System.out.println("Pasta Lunga " + lunghezzaCm + " con sezione sconosciuta");
                result = false;
        }
        return result;
    }
}
