public class IntegerCharPrinter {
    public void printIntChar(int n, char c) {
        System.out.println("Integer: " + n);
        System.out.println("Character: " + c);
    }

    public void printIntCharReverse(char c, int n) {
        System.out.println("Character: " + c);
        System.out.println("Integer: " + n);
    }

    public static void main(String[] args) {
        IntegerCharPrinter printer = new IntegerCharPrinter();
        printer.printIntChar(5, 'A');
        printer.printIntCharReverse('B', 10);
    }
}
