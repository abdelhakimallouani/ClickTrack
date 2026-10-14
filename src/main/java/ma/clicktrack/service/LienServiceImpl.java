package ma.clicktrack.service;

import java.util.Optional;

import ma.clicktrack.model.Lien;
import ma.clicktrack.model.Publisher;
import ma.clicktrack.repository.LienRepository;
import ma.clicktrack.repository.PublisherRepository;

public class LienServiceImpl implements LienService {

    private final LienRepository lienRepository;
    private final PublisherRepository publisherRepository;

    public LienServiceImpl(LienRepository lienRepository, PublisherRepository publisherRepository) {
        this.lienRepository = lienRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Optional<Lien> createLien(Long publisherId, Lien lien) {
        Optional<Publisher> publisher = publisherRepository.findAll().stream()
                .filter(p -> p.getId().equals(publisherId)).findFirst();
        Lien newLien = new Lien(null, lien.getOffre(), lien.getUrlDestination(), publisher.get().getId());
        return Optional.of(lienRepository.save(newLien));
    }
}