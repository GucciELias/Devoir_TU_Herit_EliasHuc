package Entities.Exo1;

import java.util.ArrayList;

public class Cours implements ICalcul
{

    private double prixCours;
    private int idCours;
    private String infos;


    public Cours(double prixCours, int idCours,String infos)
    {
        this.prixCours = prixCours;
        this.idCours = idCours;
        this.infos = infos;
    }

    @Override
    public double getPrix()
    {
        int prix = 0;
        return prix;
    }


    public String GetDescription()
    {
        return "numéro : " +idCours + " instrument : "  ;
    }

}
