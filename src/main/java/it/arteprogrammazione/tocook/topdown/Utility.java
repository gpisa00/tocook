package it.arteprogrammazione.tocook.topdown;

public class Utility {

    public static void cucinaPasta(String condimento) {
        System.out.println("Prendere la pentola");
        System.out.println("Acqua nella pentola");

        long start = System.currentTimeMillis();
        long end = start;
        long periodWater = 5000L;
        long periodPasta = 3000L;

        boolean isFirstCall = true;
        int countCall = 0;
        while (timer(start, end, periodWater)) {
            if (isFirstCall) {
                System.out.println("Far bollire acqua");
                isFirstCall = false;
            }
            end = System.currentTimeMillis();
            countCall++;
        }

        System.out.println("countCall = " + countCall );

        countCall = 0;
        start = System.currentTimeMillis();
        end = start;
        isFirstCall = true;

        System.out.println("trrrrrrrrrrrrr: Adesso puoi immergere la pasta");

        countCall = getCountCall(start, end, periodPasta, isFirstCall, countCall);
        System.out.println("countCall = " + countCall );

        System.out.println("trrrrrrrrrrrrr: Adesso puoi aggiungere il condimento");
        System.out.println("Aggiungere " + condimento);
    }

    private static int getCountCall(long start, long end, long periodPasta, boolean isFirstCall, int countCall) {
        while (timer(start, end, periodPasta)) {
            if (isFirstCall) {
                System.out.println("Immergere la pasta");
                isFirstCall = false;
            }
            end = System.currentTimeMillis();
            countCall++; //countCall = countCall+1
        }
        return countCall;
    }

    private static boolean timer(long start, long end, long period) {
        return end - start < period;
    }

}
