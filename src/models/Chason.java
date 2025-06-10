package models;

import java.util.function.ToDoubleBiFunction;

public class Chason {
    private String interprete;
    private String titre;
    private int duree;

    public Chason(String interprete, String titre, int duree) {
        this.interprete = interprete;
        this.titre = titre;
        this.duree = duree;
    }

    public int getDuree() {
        return duree;
    }

    public String getInterprete() {
        return interprete;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return interprete + " - " + titre + ", " + duree; // Decimal Format
    }

}
