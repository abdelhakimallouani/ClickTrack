package ma.clicktrack.repository;

import java.util.ArrayList;
import java.util.List;

import ma.clicktrack.model.Publisher;

public class PublisherRepositoryImpl implements PublisherRepository {
    private  final List<Publisher> publishers = new ArrayList<>();

    @Override
    public List<Publisher> findAll(){
        return new ArrayList<>(publishers);
    }

    @Override
    public synchronized void save(Publisher publisher){
        publishers.add(publisher);
    }
}
