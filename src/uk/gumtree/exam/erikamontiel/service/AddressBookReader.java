package uk.gumtree.exam.erikamontiel.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBookReader {
    private String path;

    public AddressBookReader(String path) {

        this.path = path;
    }


    public int ContainsGenre(String genre) {
        List<String> list;

        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            list = stream.filter(line -> line.contains(genre)).map(line -> {
                String[] str = line.split(",");
                return str[1];
            }).collect(Collectors.toList());

            return list.size();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return 0;
    }

}
