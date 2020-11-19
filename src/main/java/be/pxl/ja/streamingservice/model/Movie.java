package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable {
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;
    public static int LONG_PLAYING_TIME = 10;

    public Movie(String title, Rating rating) {
        super(title, rating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public boolean isLongPlayingTime() {
        return duration >= LONG_PLAYING_TIME;
    }

    public String getPlayingTime() {
        int hours = getDuration() / 60;
        int minutes = getDuration() % 60;

        return hours + " u " + minutes + " min";

    }

    public void setDuration(int duration) {
        if (duration < 0) {
            this.duration = Math.abs(duration);
        } else {
            this.duration = duration;
        }
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        if (releaseDate != null) {
            builder.append(" (").append(releaseDate.getYear()).append(") ");
        }
        return builder.toString();
    }
}
