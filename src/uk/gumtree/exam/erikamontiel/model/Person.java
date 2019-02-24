package uk.gumtree.exam.erikamontiel.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

    private String name;
    private String genre;
    private LocalDate dob;
    private LocalDate today = LocalDate.now();
    private int age;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

    public Person(String name, String genre, String dob) {
        this.name = name;
        this.genre = genre;
        this.dob = LocalDate.parse(dob, formatter);
        calculateAge();
    }

    private void calculateAge() {
        Period diff = Period.between(dob, today);
        age = diff.getYears();
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

    public int getAge() {
        return age;
    }
}
