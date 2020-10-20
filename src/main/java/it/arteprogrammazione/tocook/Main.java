package it.arteprogrammazione.tocook;

import it.arteprogrammazione.tocook.oop.CucinaConcreta;
import it.arteprogrammazione.tocook.oop.CucinaInterfaccia;
import it.arteprogrammazione.tocook.oop.SezioneEnum;
import it.arteprogrammazione.tocook.topdown.Utility;

public class Main {

    private static CucinaInterfaccia cucina;

    public static void main(String[] args) {

//        System.out.println("\n###### CUCINA TOP-DOWN ##########");
//
//        cuociProcedurale();

        System.out.println("\n-------------------------------------------------");

        System.out.println("\n###### CUCINA OOP ##########");

        cuociOOP();
    }

    private static void cuociProcedurale() {
        Utility.cucinaPasta("Sugo");
    }

    private static void cuociOOP() {

       // PastaLunga l = new PastaLunga();
        cucina = new CucinaConcreta();

        cucina.cuociPastaLunga("Spaghetti",
                "pasta ottima con il tonno",
                false,
                3000,
                SezioneEnum.TONDA,
                25);

        cucina.cuociPastaCorta("Gnocchi",
                "pasta ottima con il sugo",
                true,
                1000,
                false);
    }


}
