package services;

public class ServiceCalculDuree {
    public static int calculeDureeSecondes(int minute, int seconde){
        int secondeTotal = seconde + (minute * 60);
        return secondeTotal;
    }

    public static int calculeMinutesEntieres(int seconde){
        int minuteTotal = seconde/60;
        return minuteTotal;
    }

    public static int calculeResteSecondes(int seconde){
        int restSeconde = seconde % 60;
        return restSeconde;
    }
}
