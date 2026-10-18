package ma.clicktrack.dto;

public class TrackLienResponse {
    private Long id;
    private String offre;
    private String url;
    private int clicks;
    private String nomPublisher;

    public TrackLienResponse(Long id, String offre, String url, int clicks, String nomPublisher) {
        this.id = id;
        this.offre = offre;
        this.url = url;
        this.clicks = clicks;
        this.nomPublisher = nomPublisher;
    }

    public Long getId() {
        return id;
    }

    public String getOffre() {
        return offre;
    }

    public String getUrl() {
        return url;
    }

    public int getClicks() {
        return clicks;
    }

    public String getNomPublisher() {
        return nomPublisher;
    }

}
