public class CalcPi {
	public static void main(String [] args) { 
		int Howmanytimstocheers = Integer.parseInt(args[0]); 
		int sign = 1;
		double pai = 0.0;
		for (int i = 0; i < Howmanytimstocheers; i++) {
            pai = pai +(1 *sign * (1.0 / (2 * i + 1)));
            sign = sign*(-1);
        }
			pai = pai* 4;
			System.out.println("pi according to Java: " + Math.PI);
			System.out.println("pi, approximated:     " + pai );		

}
}

