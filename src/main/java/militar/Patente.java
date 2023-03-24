package militar;

public class Patente implements Cloneable {

    private String forcaArmada;

    private String patente;

    public Patente(String forcaArmada, String patente) {
        this.forcaArmada = forcaArmada;
        this.patente = patente;
    }

    public String getForcaArmada() {
        return forcaArmada;
    }

    public void setForcaArmada(String forcaArmada) {
        this.forcaArmada = forcaArmada;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Patente{" + "forcaArmada=" + forcaArmada + ", patente=" + patente + '}';
    }

}
