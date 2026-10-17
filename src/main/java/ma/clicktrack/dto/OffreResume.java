package ma.clicktrack.dto;

public class OffreResume {
    private String offre;
    private int nbrLiens;
    private long clicks;

    public OffreResume(String offre) {
        this.offre = offre;
        this.nbrLiens = 0;
        this.clicks = 0;
    }

    public String getOffre() {
        return offre;
    }

    public void setOffre(String offre) {
        this.offre = offre;
    }

    public int getNbrLiens() {
        return nbrLiens;
    }

    public void incrementNbrLiens() {
        this.nbrLiens++;
    }

    public long getClicks() {
        return clicks;
    }

    public void addClicks(int clicks) {
        this.clicks += clicks;
    }
}
