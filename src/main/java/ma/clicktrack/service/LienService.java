package ma.clicktrack.service;

import java.util.List;
import java.util.Optional;

import ma.clicktrack.model.Lien;

public interface LienService {
    Optional<Lien> createLien(Long publisherId, Lien lien);
    List<Lien> getLienByPubId(Long publisherId);
}
