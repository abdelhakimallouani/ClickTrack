package ma.clicktrack.repository;

import java.util.List;

import ma.clicktrack.model.Publisher;

public interface PublisherRepository {
    List<Publisher> findAll();
    public void save(Publisher publisher);
}
