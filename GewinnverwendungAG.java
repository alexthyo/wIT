public class GewinnverwendungAG {
    private double gewinn;
    private double dividende;
    private double ruecklagen;
    private double gewinnvortrag;

    public GewinnverwendungAG(double gewinn) {
        this.gewinn = gewinn;
    }

    public void berechneGewinnverwendung() {
        dividende = gewinn * 0.5;
        ruecklagen = gewinn * 0.3;
        gewinnvortrag = gewinn * 0.2;
    }

    public double getDividende() {
        return dividende;
    }

    public double getRuecklagen() {
        return ruecklagen;
    }

    public double getGewinnvortrag() {
        return gewinnvortrag;
    }
}
