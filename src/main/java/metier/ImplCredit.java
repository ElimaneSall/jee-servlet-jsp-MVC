package metier;

public class ImplCredit  implements ICredit{

    @Override
    public double CalculMensualite(double capital, double taux, double duree) {
        double t = taux/12;
        double t1 = capital*t/12;
        double t2 = 1 -Math.pow(1+t/12, -duree);

        return t1/t2;
    }
}
