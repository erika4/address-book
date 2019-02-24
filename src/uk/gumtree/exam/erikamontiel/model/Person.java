package uk.gumtree.exam.erikamontiel.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.YEARS;

public class Person {

    private String name;
    private String genre;
    private LocalDate dob;
    private long age;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

    public Person(String name, String genre, String dob) {
        this.name = name;
        this.genre = genre;
        this.dob = LocalDate.parse(dob, formatter);
        this.age = YEARS.between(this.dob, LocalDate.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public long getAge() {
        return age;
    }
}
