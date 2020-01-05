import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static class Produkt {
        public String navn;
        public Integer pris;
    }

    public static void main(String[] args) {
        List<Produkt> Produkter = new ArrayList<Produkt>();

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Velkommen");
        System.out.println ("Hvor mange produkter ønsker du å legge til i din handleliste?");
        int antallProdukter = scanner.nextInt();

        for (int i = 0; i < antallProdukter; i++) {
            Produkt currentProdukt = new Produkt();
            System.out.println("Navn på vare:");
            currentProdukt.navn = scanner.next();

            System.out.println("Pris på " + currentProdukt.navn + "?");
            currentProdukt.pris = scanner.nextInt();

            Produkter.add(currentProdukt);
            currentProdukt = null;
        }

        double billigsteProduktPris = Produkter.get(0).pris;
        Produkt billigsteProdukt = new Produkt();
        billigsteProdukt.navn = Produkter.get(0).navn;
        billigsteProdukt.pris = Produkter.get(0).pris;

        double dyresteProduktPris = Produkter.get(0).pris;
        Produkt dyresteProdukt = new Produkt();
        dyresteProdukt.navn = Produkter.get(0).navn;
        dyresteProdukt.pris = Produkter.get(0).pris;

        for (int i = 0; i < Produkter.size(); i++) {
            if (Produkter.get(i).pris < billigsteProduktPris) {
                billigsteProduktPris = Produkter.get(i).pris;
                billigsteProdukt.navn = Produkter.get(i).navn;
                billigsteProdukt.pris = Produkter.get(i).pris;
            }

            if (Produkter.get(i).pris > dyresteProduktPris) {
                dyresteProduktPris = Produkter.get(i).pris;
                dyresteProdukt.navn = Produkter.get(i).navn;
                dyresteProdukt.pris = Produkter.get(i).pris;
            }
        }

        System.out.println(billigsteProdukt.navn + " til kr: " + billigsteProdukt.pris + ",- er den billigste varen i din liste");
        System.out.println(dyresteProdukt.navn + " til kr: " + dyresteProdukt.pris + ",- er den dyreste varen i din liste");
    }
}