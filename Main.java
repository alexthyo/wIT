public class Main {
    public static void main(String[] args) {
        double gewinn = 100000.0; // Beispielwert für den Gewinn

        GewinnverwendungAG gewinnverwendung = new GewinnverwendungAG(gewinn);
        gewinnverwendung.berechneGewinnverwendung();

        double dividende = gewinnverwendung.getDividende();
        double ruecklagen = gewinnverwendung.getRuecklagen();
        double gewinnvortrag = gewinnverwendung.getGewinnvortrag();

        System.out.println("Dividende: " + dividende);
        System.out.println("Rücklagen: " + ruecklagen);
        System.out.println("Gewinnvortrag: " + gewinnvortrag);
    }
}