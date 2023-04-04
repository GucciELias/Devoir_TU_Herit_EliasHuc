package Entities.Exo1;

public class CoursCollectif extends Cours implements ICalcul
{
    private String nomCours;
    private int nbPlaceMaxi;
    private int ageMini;

    public CoursCollectif(String unNomCours, int unNbPlaceMaxi, int unAgeMini,double prixCours, int idCours, String infos)
    {
        super(prixCours, idCours, infos);
        nomCours = unNomCours;
        nbPlaceMaxi = unNbPlaceMaxi;
        ageMini = unAgeMini;
    }



    @Override
    public double getPrix()
    {
        return 0;
    }







}
