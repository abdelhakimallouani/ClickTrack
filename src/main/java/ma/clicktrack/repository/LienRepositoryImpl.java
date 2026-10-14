package ma.clicktrack.repository;

import java.util.ArrayList;
import java.util.List;

import ma.clicktrack.model.Lien;
import java.util.concurrent.atomic.AtomicLong;

public class LienRepositoryImpl implements LienRepository {
    
    private final List<Lien> liens = new ArrayList<>();
    private final AtomicLong atomic = new AtomicLong(0);
    
    @Override
    public synchronized Lien save(Lien lien){
        lien.setId(atomic.incrementAndGet());
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
}
