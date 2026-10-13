package ma.clicktrack.model;

public class Lien {

    private Long id;
    private String offre;
    private String urlDestination;
    private int clicks;
    private Long publisherId;

    public Lien() {
        this.clicks = 0;
    }

    public Lien(Long id, String offre,
                String urlDestination, Long publisherId) {
        this.id = id;
        this.offre = offre;
        this.urlDestination = urlDestination;
        this.publisherId = publisherId;
        this.clicks = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOffre() {
        return offre;
    }

    public void setOffre(String offre) {
        this.offre = offre;
    }

    public String getUrlDestination() {
        return urlDestination;
    }

    public void setUrlDestination(String urlDestination) {
        this.urlDestination = urlDestination;
    }

    public int getClicks() {
        return clicks;
    }

    public synchronized void incrementClicks() {
        this.clicks++;
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }
}