package uk.gumtree.exam.erikamontiel;

import uk.gumtree.exam.erikamontiel.service.AddressBookReader;

public class AddressBookMain {

    private static AddressBookReader bookReader;

    public static void main(String[] args) {


        bookReader = new AddressBookReader(args[0] + "\\" + args[1]);
        System.out.println("Males :" + bookReader.ContainsGenre("Males"));
    }

    private static void usage() {
        System.err.println("Usage: String1 String2");
        System.err.println("Where: String1 - AddressBook location");
        System.err.println("String2 - AddressBook name file");
    }
}
