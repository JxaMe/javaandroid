public class CanonPrinter extends Printer{
    void close(){
        this.clean();
        super.close();
    }
    void clean(){
        System.out.println("佳能专用,清理功能!");
    }
}
