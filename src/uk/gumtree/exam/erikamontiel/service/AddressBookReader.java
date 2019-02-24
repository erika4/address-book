package uk.gumtree.exam.erikamontiel.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBookReader {
    private String txtFileName = "C:\\Development\\personal\\address-book\\AddressBook";

    public AddressBookReader() {

    }

    public int Males() {
        List<String> list;

        try (Stream<String> stream = Files.lines(Paths.get(txtFileName))) {
            list = stream.filter(line -> line.contains("Male")).map(line -> {
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
