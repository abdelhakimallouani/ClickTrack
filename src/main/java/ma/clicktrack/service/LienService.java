package ma.clicktrack.service;

import java.util.List;
import java.util.Optional;

import ma.clicktrack.dto.OffreResume;
import ma.clicktrack.dto.TrackLienResponse;
import ma.clicktrack.model.Lien;

public interface LienService {
    Optional<Lien> createLien(Long publisherId, Lien lien);
    List<Lien> getLienByPubId(Long publisherId);
    List<OffreResume> getOffersbyPubId(Long pubId);
    Optional<TrackLienResponse> trackClick(Long pubId);
}
