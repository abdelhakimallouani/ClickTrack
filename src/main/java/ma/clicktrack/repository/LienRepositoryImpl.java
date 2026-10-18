package ma.clicktrack.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import ma.clicktrack.model.Lien;

public class LienRepositoryImpl implements LienRepository {
    
    private final List<Lien> liens = new ArrayList<>();
    private long nextId = 1;
    
    @Override
    public synchronized Lien save(Lien lien){
        lien.setId(nextId++);
        liens.add(lien);
        return lien;
    }

    @Override
    public synchronized List<Lien> findAll(){
        return new ArrayList<>(liens);
    }

    @Override
    public synchronized List<Lien> findByPublisherId(Long publisherId){
        return liens.stream().filter(l -> l.getPublisherId().equals(publisherId)).toList();
    }

    @Override
    public synchronized Optional<Lien> findById(Long id) {
        return liens.stream().filter(l -> l.getId().equals(id)).findFirst();
    }
}
