public class Day2AlphabeticalPyramid {
    public static void main(String[] args) {
        int i, j;
        char x = 'A';
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
}
