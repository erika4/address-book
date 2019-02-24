package uk.gumtree.exam.erikamontiel;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressBookMainTest {

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
}