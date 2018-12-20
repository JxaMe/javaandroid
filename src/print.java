public class print {
    public static void main(String[] args) {
        Printer printer = new Printer();
        CanonPrinter canon = new CanonPrinter();
        printer.open();
        printer.close();
        printer.print("some things!");
        canon.open();
        canon.clean();
        canon.print("aaaaaaaaa");
    }
}
