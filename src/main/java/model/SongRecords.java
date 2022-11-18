package model;

import Controller.Genres;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SongRecords {
    private Integer id;
    private String title;
    private String author;
    private String publisher;
    private Integer durationInSec;
    private LocalDate releaseDate;
    private Genres genre;

    //Az ID-t az adatbázis magától generálni fogja, ezért nem kell az ID paraméter
    public SongRecords(){}
    public SongRecords(String title, String author, String publisher, Integer durationInSec, LocalDate releaseDate, Genres genre) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.durationInSec = durationInSec;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public SongRecords(Integer id, String title, String author, String publisher, Integer durationInSec, LocalDate releaseDate, Genres genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.durationInSec = durationInSec;
        this.releaseDate = releaseDate;
        this.genre = genre;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getDurationInSec() {
        return durationInSec;
    }

    public void setDurationInSec(Integer durationInSec) {
        this.durationInSec = durationInSec;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Genres getGenre(){
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Information{" +
                "id=" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", durationInSec=" + durationInSec +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
