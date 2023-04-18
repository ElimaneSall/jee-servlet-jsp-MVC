package control;

public class CreditModel {

    private double capital =0;
    private double taux=0;
    private double duree=0;
    private double mensualite=0;

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public double getMensualite() {
        return mensualite;
    }

    public void setMensualite(double mensualite) {
        this.mensualite = mensualite;
    }


    public CreditModel(){
        super();
    }
    public CreditModel(double capital, double taux, double duree, double mensualite) {
        this.capital = capital;
        this.taux = taux;
        this.duree = duree;
        this.mensualite = mensualite;
    }
}
