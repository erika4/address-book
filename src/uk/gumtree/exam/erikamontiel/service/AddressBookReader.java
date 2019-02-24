package uk.gumtree.exam.erikamontiel.service;

import uk.gumtree.exam.erikamontiel.model.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBookReader {
    private String path;
    private List<Person> addressBook;

    public AddressBookReader(String path) {

        this.path = path;
    }

    public int ContainsGenre(String genre) {
        int total = 0;
        read();

        for (Person p : addressBook
        ) {
            if (p.getGenre().equals(genre)) {
                total++;
            }
        }
        return total;
    }


    private void read() {
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            addressBook = stream.map(line -> {
                String[] str = line.split(",");
                return new Person(str[0].trim(), str[1].trim(), str[2].trim());
            }).collect(Collectors.toList());

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
