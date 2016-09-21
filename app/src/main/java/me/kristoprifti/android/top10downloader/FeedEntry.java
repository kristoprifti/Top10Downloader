package me.kristoprifti.android.top10downloader;

/**
 * Created by k.prifti on 20.9.2016 г..
 */

class FeedEntry {

    private String name;
    private String artist;
    private String relaseDate;
    private String summary;
    private String imageURL;

    String getArtist() {
        return artist;
    }

    void setArtist(String artist) {
        this.artist = artist;
    }

    public String getImageURL() {
        return imageURL;
    }

    void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelaseDate() {
        return relaseDate;
    }

    void setRelaseDate(String relaseDate) {
        this.relaseDate = relaseDate;
    }

    String getSummary() {
        return summary;
    }

    void setSummary(String summary) {
        this.summary = summary;
    }

    /*@Override
    public String toString() {
        return  "name='" + name + '\n' +
                ", artist=" + artist + '\n' +
                ", relaseDate=" + relaseDate + '\n' +
                ", imageURL=" + imageURL + '\n';
    }*/
}
