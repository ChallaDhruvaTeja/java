import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        // Define a Supplier that provides a random number
        Supplier<Double> randomNumberSupplier = () -> Math.random();

        // Get a random number from the supplier
        Double randomNumber = randomNumberSupplier.get();

        // Output the result
        System.out.println("Random Number: " + randomNumber);
    }
}
