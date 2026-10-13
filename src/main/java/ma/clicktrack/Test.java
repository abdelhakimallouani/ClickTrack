package ma.clicktrack;

import ma.clicktrack.model.Categorie;
import ma.clicktrack.model.Publisher;
import ma.clicktrack.model.Lien;

public class Test {

    public static void main(String[] args) {

        Publisher publisher = new Publisher(
            1L,
            "hakim",
            "allouani",
            "test@gamil.ma",
            Categorie.INFLUENCEUR
        );

        Lien lien = new Lien(
            10L,
            "Chaussures",
            "https://shop.ma/chaussures",
            publisher.getId()
        );

        lien.incrementClicks();


        System.out.println("Publisher : " + publisher.getNom());
        System.out.println("Offre : " + lien.getOffre());
        System.out.println("Clicks : " + lien.getClicks());
    }
}