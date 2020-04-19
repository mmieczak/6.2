public class WhileLoops {
    public static void main(String[] args) {
        double seed = 0;
        String strSeed;

        System.out.println("Display all numbers between [0.3] with seed of 0.1");
        System.out.println("Using do...while loop:");
        //do..while loop
        do {
            displayNumber(seed);
            seed += 0.1;
        }
        while (seed < 3.01);

        System.out.println();
        System.out.println("Using while loop:");
        seed = 0;

        //while loop
        while (seed < 3.01) {
            displayNumber(seed);
            seed += 0.1;
        }
    }

    private static void displayNumber(double num) {
        String strSeed = String.format("%.1f", num);
        System.out.print(strSeed);
        if (num < 3)
            System.out.print(", ");
    }
}