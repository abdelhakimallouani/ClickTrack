package ma.clicktrack.service;

import java.util.List;

import ma.clicktrack.model.Publisher;
import ma.clicktrack.repository.PublisherRepository;

public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }

}