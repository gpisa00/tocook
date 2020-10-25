package it.arteprogrammazione.tocook.framework;

public class CucinaConcretaFW implements CucinaInterfacciaFW {

    @Override
    public void cuociPasta(PastaAstrattaFW pasta) {
        pasta.cuoci();
    }
}
