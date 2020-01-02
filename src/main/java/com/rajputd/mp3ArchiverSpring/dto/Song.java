package com.rajputd.mp3ArchiverSpring.dto;

import org.hibernate.annotations.OptimisticLockType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@org.hibernate.annotations.Entity(optimisticLock = OptimisticLockType.ALL, dynamicUpdate = true)
@Table(name = "Song", uniqueConstraints = {@UniqueConstraint(columnNames = "ID")})
public class Song implements Serializable {
    private static final long serialVersionUID = -1798070786993154676L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;

    @Column(name = "artist")
    private String artist;

    @Column(name = "year")
    private String year;

    @Column(name = "album")
    private String album;

    @Column(name = "title")
    private String title;

    public Song() {}

    public Song(String artist, String year, String album, String title) {
        this.artist = artist;
        this.year = year;
        this.album = album;
        this.title = title;
    }

    public String getArtist() {
        if (artist == null || artist.length() == 0) {
            return "Anonymous";
        }
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getYear() {
        if (year == null || year.length() == 0 ) {
            return "unknown";
        }
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAlbum() {
        if (album == null || album.length() == 0) {
            return "No Album";
        }
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTitle() {
        if (title == null || title.length() == 0) {
            return "untitled";
        }
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }
}
