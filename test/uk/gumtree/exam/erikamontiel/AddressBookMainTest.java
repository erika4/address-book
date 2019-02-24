package uk.gumtree.exam.erikamontiel;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressBookMainTest {

    private String somelocation = "C:\\Development\\personal\\address-book";
    private String somefile = "AddressBook";

    @Test
    void ShouldReturnUsageWhenNoArguments() {

        String expectedError = "Usage: String1 String2\r\n" +
                "Where: String1 - AddressBook location\r\n" +
                "String2 - AddressBook name file\r\n";

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setErr(new PrintStream(output));
        AddressBookMain.main(new String[]{});

        assertEquals(expectedError, output.toString());
    }

    @Test
    void ShouldReturnUsageWhenMoreThan2Arguments() {
        String expectedError = "Usage: String1 String2\r\n" +
                "Where: String1 - AddressBook location\r\n" +
                "String2 - AddressBook name file\r\n";

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setErr(new PrintStream(output));
        AddressBookMain.main(new String[]{"a", "b", "c"});

        assertEquals(expectedError, output.toString());
    }

    @Test
    void ShouldRunWith2Arguments() {
        String expectedError = "";

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setErr(new PrintStream(output));
        AddressBookMain.main(new String[]{somelocation, somefile});

        assertEquals(expectedError, output.toString());
    }
}