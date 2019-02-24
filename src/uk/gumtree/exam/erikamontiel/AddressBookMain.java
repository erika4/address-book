package uk.gumtree.exam.erikamontiel;

public class AddressBookMain {


    public static void main(String[] args) {
        if (args.length == 0 || args.length > 2) {
            usage();
        }


    }

    private static void usage() {
        System.err.println("Usage: String1 String2");
        System.err.println("Where: String1 - AddressBook location");
        System.err.println("String2 - AddressBook name file");
    }
}
