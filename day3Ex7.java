public class PrintNumber {

    public void printn(int num) {
        System.out.println("Integer number: " + num);
    }

 
    public void printn(double num) {
        System.out.println("Double number: " + num);
    }

    public void printn(float num) {
        System.out.println("Float number: " + num);
    }


    public void printn(long num) {
        System.out.println("Long number: " + num);
    }

    public void printn(short num) {
        System.out.println("Short number: " + num);
    }


    public void printn(byte num) {
        System.out.println("Byte number: " + num);
    }

    public void printn(boolean bool) {
        System.out.println("Boolean value: " + bool);
    }

    public void printn(char ch) {
        System.out.println("Character: " + ch);
    }

    public static void main(String[] args) {
        PrintNumber printer = new PrintNumber();

        printer.printn(10);
        printer.printn(3.14);
        printer.printn(5.6f);
        printer.printn(10000000000L);
        printer.printn((short) 20);
        printer.printn((byte) 8);
        printer.printn(true);
        printer.printn('A');
    }
}
