public class Collatz {
	public static void main(String args[]) {
		int highestseed = Integer.parseInt(args[0]);
        String WhichMood = args[1];
        String verbose = "v";

        if (WhichMood.equals(verbose)) {
            for (int i = 1; i <= highestseed; i++) {
                System.out.print(i); 
                int value = i;
				int howsteps = 1;
				if (i == 1)
				{
					value = value+3;
					System.out.print(" " + value);
					howsteps ++;
				}
                while (value > 1) {
                    if (value % 2 == 0) {
                        value = value / 2;
                    } else {
                        value = value * 3 + 1;
                    }
                    System.out.print(" " + value);
                    howsteps++;
                }
                System.out.println(" (" + howsteps + ")");
            }
        } else {
            for (int i = 1; i <= highestseed; i++) {
                int value = i;
                while (value > 1) {
                    if (value % 2 == 0) {
                        value = value / 2;
                    } else {
                        value = value * 3 + 1;
                    }
                }
            }
        }

        System.out.println("Every one of the first " + highestseed + " hailstone sequences reached 1.");
    }
}




