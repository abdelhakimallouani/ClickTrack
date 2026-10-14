package ma.clicktrack.config;

import ma.clicktrack.model.Categorie;
import ma.clicktrack.model.Publisher;
import ma.clicktrack.repository.PublisherRepository;

public class DataInitializer {
    private final PublisherRepository publisherRepository;

    public DataInitializer(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public void init() {
        publisherRepository.save(new Publisher(1L, "Hakim", "allouani", "hakim@gmail.ma", Categorie.INFLUENCEUR));
        publisherRepository.save(new Publisher(2L, "amine", "nafai", "amine@gmail.ma", Categorie.YOUTUBEUR));
        publisherRepository.save(new Publisher(3L, "imane", "alioui", "iamne@gmail.ma", Categorie.INFLUENCEUR));
    }
}
