// Defining an interface
interface Printable {
    void print();
}

// Implementing the interface in a class
class Document implements Printable {
    public void print() {
        System.out.println("Printing document");
    }
}

class Image implements Printable {
    public void print() {
        System.out.println("Printing image");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of the classes
        Printable doc = new Document();
        Printable img = new Image();

        // Calling the print method
        doc.print();
        img.print();
    }
}