
interface Printable {
    void print(); 
}

class Printer implements Printable {
    @Override
    public void print() {
        System.out.println("Printer is now printing the document.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Printable myPrinter = new Printer();
        myPrinter.print();
    }
}