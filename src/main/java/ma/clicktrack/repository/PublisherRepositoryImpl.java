package ma.clicktrack.repository;

import java.util.ArrayList;
import java.util.List;

import ma.clicktrack.model.Publisher;

public class PublisherRepositoryImpl implements PublisherRepository {
    private  final List<Publisher> publishers = new ArrayList<>();

    @Override
    public synchronized List<Publisher> findAll(){
        return new ArrayList<>(publishers);
    }

    public synchronized void save(Publisher publisher){
        publishers.add(publisher);
    }
}
