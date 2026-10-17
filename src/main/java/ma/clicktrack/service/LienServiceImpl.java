package ma.clicktrack.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import ma.clicktrack.dto.OffreResume;
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

    @Override
    public List<Lien> getLienByPubId(Long publisherId) {
        return lienRepository.findByPublisherId(publisherId);
    }

    @Override
    public List<OffreResume> getOffersbyPubId(Long pubId){
        List<Lien> liens = lienRepository.findByPublisherId(pubId);

        Map<String,OffreResume> offers = new LinkedHashMap<>();
        
        for (Lien lien : liens) {
            String offreName = lien.getOffre();
            OffreResume offreResume = offers.get(offreName);
            if (offreResume == null) {
                offreResume = new OffreResume(offreName);
                offers.put(offreName, offreResume);
            }
            offreResume.incrementNbrLiens();
            offreResume.addClicks(lien.getClicks());
        }
        return new ArrayList<>(offers.values());
    }

}