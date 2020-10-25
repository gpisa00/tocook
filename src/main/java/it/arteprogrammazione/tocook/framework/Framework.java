package it.arteprogrammazione.tocook.framework;

public final class Framework {

    private static CucinaInterfacciaFW cucina = new CucinaConcretaFW();

    public static void startFramework(PastaAstrattaFW pasta) throws Exception{
        cucina.cuociPasta(pasta);
    }

}
