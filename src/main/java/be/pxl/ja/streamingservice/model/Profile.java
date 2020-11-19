package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    public Profile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        if (dateOfBirth == null) {
            return 0;
        }
        return (int) ChronoUnit.YEARS.between(LocalDate.now(), getDateOfBirth());
    }

    // Voeg nog even alle bestanden van week 1 in dit project toe (Content etc)
    public boolean allowedToWatch(Content content) {
        return content.getMaturityRating().getMinimumAge() <= getAge();
    }
}
