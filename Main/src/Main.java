public class Main {
    public static void main(String[] args) throws Exception {
        int x = 0;
        if (args.length > 0) {
            try {
                x = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + args[0] + " must be an integer.");
                System.exit(1);
            }
        } else {
            System.err.println("No arguments provided");
            System.exit(1);
        }

        int y = 0;
        if (args.length > 1) {
            try {
                y = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + args[1] + " must be an integer.");
                System.exit(1);
            }
        } else {
            System.err.println("No second argument provided");
            System.exit(1);
        }
        
        AddingInterface ai = (int a, int b) -> a + b;
        System.out.println("Sum of " + x + " and " + y + " is " + ai.sum(x, y));
    }
}