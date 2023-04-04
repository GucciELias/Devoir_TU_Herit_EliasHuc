package Entities.Exo1;

public class CoursIndividuel extends Cours implements ICalcul
{



    public CoursIndividuel(double prixCours, int idCours, String infos)
    {
        super(prixCours, idCours,infos);
    }

    @Override
    public double getPrix()
    {
        return 0;
    }
}
