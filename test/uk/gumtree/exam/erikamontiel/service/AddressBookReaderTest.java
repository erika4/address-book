package uk.gumtree.exam.erikamontiel.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AddressBookReaderTest {

    private AddressBookReader bookReader = new AddressBookReader("C:\\Development\\personal\\address-book\\AddressBook");

    @Test
    void ShouldReturnTotalForMale() {

        int total = bookReader.ContainsGenre("Male");

        assertTrue(total > 0);

    }

    @Test
    void ShouldReturnTotalForFemale() {

        int total = bookReader.ContainsGenre("Female");

        assertTrue(total > 0);

    }

    @Test
    void ShouldReturnZeroForOther() {

        int total = bookReader.ContainsGenre("Other");

        assertEquals(total, 0);

    }
}