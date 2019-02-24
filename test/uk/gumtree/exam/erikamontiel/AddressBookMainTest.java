package uk.gumtree.exam.erikamontiel;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressBookMainTest {

    @Test
    public void ShouldReturnUsageWhenNoArguments() {

        StringBuffer sb = new StringBuffer();
        sb.append(("Usage: String1 String2"))
                .append("Where: String1 - AddressBook location")
                .append("String 2 - AddressBook name file");

        String expectedError = sb.toString();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setErr(new PrintStream(output));
        AddressBookMain.main(new String[]{});

        assertEquals(expectedError, output.toString());
    }
}