
package Interface;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        
        printer.scanImage();
        printer.copyImage();
        printer.printImage();
        
    }
}
