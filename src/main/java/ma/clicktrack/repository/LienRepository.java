package ma.clicktrack.repository;

import java.util.List;

import ma.clicktrack.model.Lien;

public interface LienRepository {
    Lien save(Lien lien);
    List<Lien> findAll();
    List<Lien> findByPublisherId(Long publisherId);
}
